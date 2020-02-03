package com.sms.tominoes.Toppings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toppings")
public class ToppingsController {

	@Autowired
	ToppingsService topingsService;
	
	@PostMapping("addToppings")
	ResponseEntity<ToppingsModel> addToping(@RequestBody ToppingsModel topingsModel) {
		return new ResponseEntity<ToppingsModel>(topingsService.addToping(topingsModel.name,topingsModel.price),HttpStatus.CREATED);
	} 
	
	@GetMapping("getAllToppings")
	ResponseEntity<List<ToppingsModel>> getAllToppings() {
		
		List<ToppingsModel> topingList = topingsService.getAllTopings();
		if(topingList!=null)
			return new ResponseEntity<List<ToppingsModel>>(topingList, HttpStatus.OK );
		
		return new ResponseEntity(null, HttpStatus.NOT_FOUND);
	} 
	
	@GetMapping("/getToppings")
	ResponseEntity<ToppingsModel> getTopping(@RequestBody GetToppingsByNameRequestmodel getToppingsByNameRequest ) {
		
		if(topingsService.checkToping(getToppingsByNameRequest.getName())) {
			return new ResponseEntity<ToppingsModel>(topingsService.getToping(getToppingsByNameRequest.getName()),HttpStatus.OK);
		}
		
		return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	} 
	
	@PutMapping("/updateToppings")
	ResponseEntity<ToppingsModel> updateTopping( @RequestBody UpdateRequestModel updateRequestModel ){
		return new ResponseEntity<ToppingsModel>( topingsService.updateTopping(updateRequestModel.getName(),updateRequestModel.getPrice()) , HttpStatus.OK);
	}
	
}
