package com.sms.tominoes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sms.tominoes.Model.OrderModel;

public interface OrderRepository extends MongoRepository<OrderModel, String> { }
