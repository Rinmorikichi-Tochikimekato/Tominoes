package com.sms.tominoes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sms.tominoes.Model.ToppingsModel;
import com.sms.tominoes.Repository.ToppingsRepository;

@Service
public class ToppingsService {

	@Autowired
	ToppingsRepository topingsRepository;
	
	public ToppingsModel addToping(String name, double price) {
		return topingsRepository.save(new ToppingsModel(name,price));
	}

	public List<ToppingsModel> getAllTopings() {
		// TODO Auto-generated method stub
		return topingsRepository.findAll();
	}
	
	public double getPrice(String name) {
		return(topingsRepository.findByName(name).price);		
	}
	
	public boolean checkToping(String name) {
		if(topingsRepository.findByName(name)==null)
			return false;
		return true;
	}
	
	public ToppingsModel getToping(String name) {
		//System.out.println(topingsRepository.findByName(name).id);
		return topingsRepository.findByName(name);
	}

	public ToppingsModel updateTopping(String name, double price) {
		// TODO Auto-generated method stub
		
		ToppingsModel topping = getToping(name);
		
		topping.price=price;
		
		return topingsRepository.save(topping);
	}
	
}
