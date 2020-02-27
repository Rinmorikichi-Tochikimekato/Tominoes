package com.sms.tominoes.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class OrderModelListener extends  AbstractMongoEventListener<OrderModel> {
	
	
	private OrderNumberGeneratingService orderNumberGeneratingService;

    @Autowired
    public OrderModelListener(OrderNumberGeneratingService orderNumberGeneratingService) {
        this.orderNumberGeneratingService = orderNumberGeneratingService;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<OrderModel> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(orderNumberGeneratingService.generateSequence("users_sequence"));
        }
    }
}
