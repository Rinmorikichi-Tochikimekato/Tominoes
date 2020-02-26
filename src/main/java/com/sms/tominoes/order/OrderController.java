package com.sms.tominoes.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sms.tominoes.Beans.CalculatePriceRequestBean;
import com.sms.tominoes.Beans.CalculatePriceResponseBean;
import com.sms.tominoes.Beans.GetAllCrustResponseBean;
import com.sms.tominoes.Beans.GetAllOrdersResponseBean;
import com.sms.tominoes.Beans.GetOrderRequestBean;
import com.sms.tominoes.Beans.PlaceOrderRequestBean;

@RestController

@CrossOrigin(origins = "*")
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/calculatePrice")
	public ResponseEntity<CalculatePriceResponseBean> calculatePrice(@RequestBody CalculatePriceRequestBean order) {
		try {
			// System.out.println(order);
			return new ResponseEntity<CalculatePriceResponseBean>((orderService.calculatePrice(order)), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<CalculatePriceResponseBean>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("/placeOrder")
	public ResponseEntity<OrderModel> placeOrder(@RequestBody PlaceOrderRequestBean order) {
	//	try {
			// System.out.println(order);
			return new ResponseEntity<OrderModel>((orderService.placeOrder(order)), HttpStatus.CREATED);
	//	} catch (Exception e) {
		//	System.out.println(e);
	//		return new ResponseEntity<OrderModel>(HttpStatus.INTERNAL_SERVER_ERROR);
		//}
	}

	@GetMapping("/getAllOrders")
	public ResponseEntity<GetAllCrustResponseBean> getAllOrders() {
		try {
			return new ResponseEntity(new GetAllOrdersResponseBean(orderService.getAllOrders()), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<GetAllCrustResponseBean>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/getOrder")
	public ResponseEntity<OrderModel> getOrder(@RequestBody GetOrderRequestBean orderReq) {
		// try {
		return new ResponseEntity(orderService.getOrder(orderReq.getId()), HttpStatus.OK);
		// }
		// catch (Exception e) {
		// TODO: handle exception
		// return new ResponseEntity(HttpStatus.NOT_FOUND);
		// }
	}

}
