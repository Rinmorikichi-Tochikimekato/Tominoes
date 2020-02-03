package com.sms.tominoes.Order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sms.tominoes.Category.CategoryService;
import com.sms.tominoes.Crust.CrustService;
import com.sms.tominoes.Order.Beans.OrderBeanCalculateRequest;
import com.sms.tominoes.Order.Beans.OrderBeanCalculateResponse;
import com.sms.tominoes.Order.Beans.OrderBeanPlaceOrderRequest;
import com.sms.tominoes.Tax.TaxSevice;
import com.sms.tominoes.Toppings.ToppingsService;

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
	
	public OrderModel placeOrder(OrderBeanPlaceOrderRequest order) {
		// TODO Auto-generated method stub
		float price= order.getPrice();
		float cgst = (float)taxSevice.getTaxByName("cgst") * price/100;
		float sgst = (float)taxSevice.getTaxByName("sgst") * price/100;
		price += cgst+sgst;
	
		
	 
		
		return orderRepository.save(new OrderModel(order.getPizzaName(),order.getTopings(),order.getCrustName(),cgst,sgst,price));
	
	}
	
	public List<OrderModel> getAllOrders(){
		return orderRepository.findAll();
	}
	
	public Optional<OrderModel> getOrder(String id) {
		return orderRepository.findById(id);
	}

	public OrderBeanCalculateResponse calculatePrice(OrderBeanCalculateRequest orderModel) {
		// TODO Auto-generated method stub
		float price= categoryService.getCategory(orderModel.getPizzaName())+crustService.getPriceByName(orderModel.getCrustName());
		
		for(String topping : orderModel.getTopings()) {
			price += toppingsService.getPrice(topping);
		}
		
		return new OrderBeanCalculateResponse(orderModel.getPizzaName(), orderModel.getTopings(), orderModel.getCrustName(), price);
	}

	
}
