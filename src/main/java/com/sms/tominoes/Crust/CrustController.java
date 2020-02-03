package com.sms.tominoes.Crust;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/crust")
public class CrustController {
    @Autowired
	private CrustService crustservice;
	
	@PostMapping("/addCrust")
	public ResponseEntity<CrustModel> addBase(@RequestBody CrustModel crustModel)
	{
		CrustModel cm=crustservice.addCrust(crustModel.name,crustModel.price);
		if(cm!=null)
		    return new ResponseEntity<CrustModel>(cm,HttpStatus.OK);
	    else
	    	return new ResponseEntity<CrustModel>(cm,HttpStatus.NO_CONTENT);

	}
	@GetMapping("/getAllCrust")
	public ResponseEntity<List<CrustModel>> getAllCrust(){
	    List<CrustModel> crustlist=crustservice.getAllCrust();
	    if(crustlist!=null)
		    return new ResponseEntity<List<CrustModel>>(crustlist,HttpStatus.OK);
	    else
	    	return new ResponseEntity<List<CrustModel>>(crustlist,HttpStatus.NOT_FOUND);
	    		
	}
	@GetMapping("/getCrustByName")
	public ResponseEntity<CrustModel> getbyName(@RequestBody GetCrustBYNameRequestBean getCrustBYNameRequestBean){
	    CrustModel crustmodel=crustservice.getbyName(getCrustBYNameRequestBean.getName());
		if(crustmodel!=null)
			return new ResponseEntity<CrustModel>(crustmodel,HttpStatus.OK);
		else
			return new ResponseEntity<CrustModel>(crustmodel,HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateCrustByName")
	 public void updateCrust(@RequestBody CrustModel crustmodel) {
 	   crustservice.updatecrust(crustmodel,crustmodel.getName());

	} 
	@DeleteMapping("/deleteCrustByName")
	public void deleteCrust(@RequestBody GetCrustBYNameRequestBean getCrustBYNameRequestBean)
	{  CrustModel crustmodel=crustservice.getbyName(getCrustBYNameRequestBean.getName());
		crustservice.removeCrust(crustmodel);
	}

//	@PutMapping("")
//	 public void updateCrust(@RequestBody CrustModel crustmodel) {
// 	   crustservice.updatecrust(crustmodel);
//
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
//	 public void deleteTopic(@PathVariable String id) {
//  	        crustservice.delete(name);
//   }
	
	
	
	
}
