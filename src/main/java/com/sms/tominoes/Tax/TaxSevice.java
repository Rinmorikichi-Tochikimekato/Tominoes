package com.sms.tominoes.Tax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.tominoes.Crust.CrustModel;

@Service
public class TaxSevice {
   @Autowired
	TaxRepository taxrepository;
	
	public TaxModel add(String name, double rate) {
		return taxrepository.save(new TaxModel(name,rate));
		
	}
	
	public double getTaxByName(String name) {
		return (taxrepository.findByName(name).getRate());
	}

	public List<TaxModel> getAllTaxFields() {
		// TODO Auto-generated method stub
		return taxrepository.findAll();
	}

	public void updateTaxField(TaxModel taxmodel, String name) {
		TaxModel tm = taxrepository.findByName(name);
		tm.setRate(taxmodel.rate);
		taxrepository.save(tm);	}

}
