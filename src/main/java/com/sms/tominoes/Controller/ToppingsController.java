package com.sms.tominoes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.tominoes.Beans.GetAllTopingsResponseBean;
import com.sms.tominoes.Beans.GetToppingsByNameRequestBean;
import com.sms.tominoes.Beans.UpdateRequestBean;
import com.sms.tominoes.Model.ToppingsModel;
import com.sms.tominoes.Service.ToppingsService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/toppings")
public class ToppingsController {

	@Autowired
	ToppingsService topingsService;
	
	@PostMapping("addToppings")
	ResponseEntity<ToppingsModel> addToping(@RequestBody ToppingsModel topingsModel) {
		return new ResponseEntity<ToppingsModel>(topingsService.addToping(topingsModel.name,topingsModel.price),HttpStatus.CREATED);
	} 
	
	@GetMapping("getAllToppings")
	ResponseEntity<GetAllTopingsResponseBean> getAllToppings() {
		
		List<ToppingsModel> topingList = topingsService.getAllTopings();
		if(topingList!=null)
			return new ResponseEntity<GetAllTopingsResponseBean>(new GetAllTopingsResponseBean(topingsService.getAllTopings()), HttpStatus.OK );
		
		return new ResponseEntity(null, HttpStatus.NOT_FOUND);
	} 
	
	@GetMapping("/getToppings")
	ResponseEntity<ToppingsModel> getTopping(@RequestBody GetToppingsByNameRequestBean getToppingsByNameRequest ) {
		
		if(topingsService.checkToping(getToppingsByNameRequest.getName())) {
			return new ResponseEntity<ToppingsModel>(topingsService.getToping(getToppingsByNameRequest.getName()),HttpStatus.OK);
		}
		
		return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	} 
	
	@PutMapping("/updateToppings")
	ResponseEntity<ToppingsModel> updateTopping( @RequestBody UpdateRequestBean updateRequestModel ){
		return new ResponseEntity<ToppingsModel>( topingsService.updateTopping(updateRequestModel.getName(),updateRequestModel.getPrice()) , HttpStatus.OK);
	}
	
}
