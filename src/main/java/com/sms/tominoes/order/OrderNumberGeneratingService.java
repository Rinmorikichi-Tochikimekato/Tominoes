package com.sms.tominoes.order;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
//import org.springframework.boot.autoconfigure.web.ServerProperties.Undertow.Options;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.http.server.PathContainer.Options;
import org.springframework.stereotype.Service;

@Service
public class OrderNumberGeneratingService {

	private MongoOperations mongoOperations;

	@Autowired
	public OrderNumberGeneratingService(MongoOperations mongoOperations) {
		super();
		this.mongoOperations = mongoOperations;
	}
	
	public int generateSequence(String seqName) {
		
		Criteria criteria = Criteria.where("_id").is(seqName);
		Query query = new Query();
		query.addCriteria(criteria);
		
		OrderNumberGeneratorModel counter = mongoOperations.findAndModify(
					query,
					new Update().inc("seq",1),
					FindAndModifyOptions.options().returnNew(true).upsert(true),
					OrderNumberGeneratorModel.class 
				);
				
			
        return !Objects.isNull(counter) ? counter.getSeq() : 0;
		

	
	
	}
	

	
}
