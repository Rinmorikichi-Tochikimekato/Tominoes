package com.sms.tominoes.Crust;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrustService  {
   
	@Autowired
	private CrustRepository repository;
    
    public CrustModel addCrust(String name,float price) {
    	 
    	 return repository.save(new CrustModel(name,price));
    	 
    }
    public void removeCrust(CrustModel crust) {
   	 
   	  repository.delete(crust);
   	 
   } 
    public List<CrustModel> getAllCrust() {
   	 
   	 return repository.findAll();
   	 
   }

	public CrustModel getbyName(String name) {
  return repository.findByName(name);
	}
	
	public float getPriceByName(String name) {
		  return repository.findByName(name).getPrice();
			}
	
	public void updatecrust(CrustModel crustmodel, String name) {
		
		CrustModel crust = getbyName(name);
		crust.setPrice(crustmodel.price);
		
		repository.save(crust);
	}
    
    
   
}
