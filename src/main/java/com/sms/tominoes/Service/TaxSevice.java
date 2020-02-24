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
		return taxrepository.save(new TaxModel(name, rate));
	}

	public double getTaxByName(String name) {
		return (taxrepository.findByName(name).getRate());
	}

	public List<TaxModel> getAllTaxFields() {
		return taxrepository.findAll();
	}

	public TaxModel updateTaxField(TaxModel taxmodel, String name) {
		TaxModel tm = taxrepository.findByName(name);
		tm.setRate(taxmodel.getRate());
		return taxrepository.save(tm);
	}
	public void removeTax(TaxModel tm) {
		taxrepository.delete(tm);
	}
	public TaxModel getbyName(String name) {
		return taxrepository.findByName(name);
	}

}
