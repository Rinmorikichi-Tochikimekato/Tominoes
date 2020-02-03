package com.sms.tominoes.Order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.tominoes.Order.Beans.OrderBeanCalculateRequest;
import com.sms.tominoes.Order.Beans.OrderBeanCalculateResponse;
import com.sms.tominoes.Order.Beans.OrderBeanGetRequest;
import com.sms.tominoes.Order.Beans.OrderBeanPlaceOrderRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@PostMapping("/calculatePrice")
	public ResponseEntity<OrderBeanCalculateResponse> calculatePrice(@RequestBody OrderBeanCalculateRequest order) {
		try {
			//System.out.println(order);
			return new ResponseEntity<OrderBeanCalculateResponse> ( (orderService.calculatePrice(order)),HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return new ResponseEntity<OrderBeanCalculateResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/placeOrder")
	public ResponseEntity<OrderModel> placeOrder(@RequestBody OrderBeanPlaceOrderRequest order){
		try {
			//System.out.println(order);
			return new ResponseEntity<OrderModel>( (orderService.placeOrder(order)) , HttpStatus.CREATED);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return new ResponseEntity<OrderModel>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@GetMapping("/getAllOrders")
	public ResponseEntity<List<OrderModel>> getAllOrders(){
			try {
				return new ResponseEntity<List<OrderModel>> (orderService.getAllOrders(),HttpStatus.OK);
			}
			catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<List<OrderModel>>(HttpStatus.NOT_FOUND);
			}
		
		}
		
	@GetMapping("/getOrder")
	public ResponseEntity<Optional<OrderModel>> getOrder(@RequestBody OrderBeanGetRequest orderReq) {
		
		//try {
		return new ResponseEntity<Optional<OrderModel>>( orderService.getOrder(orderReq.getId()), HttpStatus.OK);
		//}
	//	catch (Exception e) {
			// TODO: handle exception
			//return new ResponseEntity(HttpStatus.NOT_FOUND);
		//}
	}
	
}
