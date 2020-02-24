package com.sms.tominoes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sms.tominoes.Model.ToppingsModel;

public interface ToppingsRepository extends MongoRepository<ToppingsModel, String> {

	public ToppingsModel findByName(String name);

}
