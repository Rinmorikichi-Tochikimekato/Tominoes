package com.sms.tominoes.Service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.tominoes.Beans.GetAllCrustResponseBean;
import com.sms.tominoes.Model.CrustModel;
import com.sms.tominoes.Repository.CrustRepository;

@Service
public class CrustService  {
   
	@Autowired
	private CrustRepository repository;
    
    public CrustModel addCrust(String name,double price) {
    	 
    	 return repository.save(new CrustModel(name,price));
    	 
    }
    public void removeCrust(CrustModel crust) {
   	 
   	  repository.delete(crust);
   	 
   } 
    public GetAllCrustResponseBean getAllCrust() {
   	 
   	 return  new GetAllCrustResponseBean( repository.findAll());
   	 
   }

	public CrustModel getbyName(String name) {
  return repository.findByName(name);
	}
	
	public double getPriceByName(String name) {
		  return repository.findByName(name).getPrice();
			}
	
	public void updatecrust(CrustModel crustmodel, String name) {
		
		CrustModel crust = getbyName(name);
		crust.setPrice(crustmodel.price);
		
		repository.save(crust);
	}
    
    
   
}
