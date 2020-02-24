package com.sms.tominoes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.tominoes.Model.CrustModel;
import com.sms.tominoes.Model.TaxModel;
import com.sms.tominoes.Repository.TaxRepository;

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

	public TaxModel updateTaxField(TaxModel taxmodel, String name) {
		TaxModel tm = taxrepository.findByName(name);
		tm.setRate(taxmodel.rate);
		return taxrepository.save(tm);	}

}
