package com.sms.tominoes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sms.tominoes.Beans.GetAllCrustResponseBean;
import com.sms.tominoes.Beans.GetCrustByNameRequestBean;
import com.sms.tominoes.Model.CrustModel;
import com.sms.tominoes.Service.CrustService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/crust")
public class CrustController {
    @Autowired
	private CrustService crustservice;
	
	@PostMapping("/addCrust")
	public ResponseEntity<CrustModel> addCrust(@RequestBody CrustModel crustModel)
	{
		CrustModel cm=crustservice.addCrust(crustModel.name,crustModel.price);
		if(cm!=null)
		    return new ResponseEntity<CrustModel>(cm,HttpStatus.OK);
	    else
	    	return new ResponseEntity<CrustModel>(cm,HttpStatus.NO_CONTENT);

	}
	@GetMapping("/getAllCrust")
	public ResponseEntity<GetAllCrustResponseBean> getAllCrust(){
	
		try {
			 return new ResponseEntity<GetAllCrustResponseBean>(crustservice.getAllCrust(),HttpStatus.OK);
		}
		   catch (Exception e) {
			// TODO: handle exception
			   return new ResponseEntity<GetAllCrustResponseBean>(HttpStatus.NOT_FOUND);
		}
	    
	    	
	    		
	}
	@GetMapping("/getCrustByName")
	public ResponseEntity<CrustModel> getCrustByName(@RequestBody GetCrustByNameRequestBean getCrustByNameRequestBean){
	    CrustModel crustmodel=crustservice.getbyName(getCrustByNameRequestBean.getName());
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
	public void deleteCrust(@RequestBody GetCrustByNameRequestBean getCrustBYNameRequestBean)
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
