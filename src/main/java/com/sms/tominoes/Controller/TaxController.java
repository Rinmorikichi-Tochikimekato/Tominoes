package com.sms.tominoes.Controller;

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

import com.sms.tominoes.Beans.GetAllTaxResponseBean;
import com.sms.tominoes.Model.TaxModel;
import com.sms.tominoes.Service.TaxSevice;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/tax")
public class TaxController {
    @Autowired
	private TaxSevice taxservice; 
	
   	
   	@PostMapping("/addTaxField")
   	public ResponseEntity<TaxModel> addTaxField(@RequestBody TaxModel taxModel)
   	{
   		TaxModel cm=taxservice.add(taxModel.name,taxModel.rate);
   		if(cm!=null)
   		    return new ResponseEntity<TaxModel>(cm,HttpStatus.OK);
   	    else
   	    	return new ResponseEntity<TaxModel>(cm,HttpStatus.NO_CONTENT);

   	}
   	
   	@GetMapping("/getAllTaxFields")
   	public ResponseEntity<GetAllTaxResponseBean> getAllTaxFields(){

   		try {
   		    return new ResponseEntity<GetAllTaxResponseBean>(new GetAllTaxResponseBean(taxservice.getAllTaxFields()),HttpStatus.OK);

   		}
   		catch (Exception e) {
			// TODO: handle exception
   			return new ResponseEntity<GetAllTaxResponseBean>(HttpStatus.NOT_FOUND);
		}
   	    	
   	    		
   	}
    @PutMapping("/updateTaxField")
    public TaxModel updateTaxField(@RequestBody TaxModel taxmodel) {
  	   return taxservice.updateTaxField(taxmodel,taxmodel.getName());

 	} 
	
}
