package com.sms.tominoes.order;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sms.tominoes.Beans.CalculatePriceRequestBean;
import com.sms.tominoes.Beans.CalculatePriceResponseBean;
import com.sms.tominoes.Beans.PlaceOrderRequestBean;
import com.sms.tominoes.Model.OrderPrice;
import com.sms.tominoes.Service.CategoryService;
import com.sms.tominoes.Service.CrustService;
import com.sms.tominoes.Service.TaxSevice;
import com.sms.tominoes.Service.ToppingsService;

@Service
public class OrderService {

	@Autowired
	CategoryService categoryService;

	@Autowired
	CrustService crustService;

	@Autowired
	ToppingsService toppingsService;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	TaxSevice taxSevice;

	public OrderModel placeOrder(PlaceOrderRequestBean order) {
		double price = order.getPrice();
		double cgst = (double) taxSevice.getTaxByName("cgst") * price / 100;
		double sgst = (double) taxSevice.getTaxByName("sgst") * price / 100;
		price += cgst + sgst;
		LocalDate date=LocalDate.now(); 
		return orderRepository.save(new OrderModel(order.getPizzaName(), order.getTopings(), order.getCrustName(),
				new OrderPrice(cgst, sgst, order.getPrice(), price),date));
	}

	public List<OrderModel> getAllOrders() {
		return orderRepository.findAll();
	}

	public Optional<OrderModel> getOrder(String id) {
		return orderRepository.findById(id);
	}

	public CalculatePriceResponseBean calculatePrice(CalculatePriceRequestBean orderModel) {
		double price = categoryService.getCategory(orderModel.getPizzaName()).getprice()
				+ crustService.getPriceByName(orderModel.getCrustName());
		for (String topping : orderModel.getTopings()) {
			price += toppingsService.getPrice(topping);
		}
		return new CalculatePriceResponseBean(orderModel.getPizzaName(), orderModel.getTopings(),
				orderModel.getCrustName(), price);
	}

}
