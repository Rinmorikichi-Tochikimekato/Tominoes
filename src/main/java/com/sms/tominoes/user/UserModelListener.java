package com.sms.tominoes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class UserModelListener extends  AbstractMongoEventListener<UserModel> {
	
	
	private SequenceGeneratingService sequenceGeneratorService;

    @Autowired
    public UserModelListener(SequenceGeneratingService sequenceGeneratorService) {
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<UserModel> event) {
        if (event.getSource().getUserId() < 1) {
            event.getSource().setUserId(sequenceGeneratorService.generateSequence("users_sequence"));
        }
    }
}
