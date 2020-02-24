package com.sms.tominoes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sms.tominoes.Model.CrustModel;

public interface CrustRepository extends MongoRepository<CrustModel, String> {

	public CrustModel findByName(String name);

}
