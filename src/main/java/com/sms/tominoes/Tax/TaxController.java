package com.sms.tominoes.Tax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.tominoes.Crust.CrustModel;
import com.sms.tominoes.Crust.CrustService;

@RestController
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
   	public ResponseEntity<List<TaxModel>> getAllTaxFields(){
   	    List<TaxModel> crustlist=taxservice.getAllTaxFields();
   	    if(crustlist!=null)
   		    return new ResponseEntity<List<TaxModel>>(crustlist,HttpStatus.OK);
   	    else
   	    	return new ResponseEntity<List<TaxModel>>(crustlist,HttpStatus.NOT_FOUND);
   	    		
   	}
    @PutMapping("/updateTaxField")
    public void updateTaxField(@RequestBody TaxModel crustmodel) {
  	   taxservice.updateTaxField(crustmodel,crustmodel.getName());

 	} 
	
}
