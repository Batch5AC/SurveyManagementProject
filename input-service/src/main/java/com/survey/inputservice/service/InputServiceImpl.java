package com.survey.inputservice.service;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.inputservice.dao.InputDao;
import com.survey.inputservice.entity.InputEntity;
import com.survey.inputservice.pojo.InputPojo;


@Service
public class InputServiceImpl implements InputService {
	
	static Logger LOG = Logger.getLogger(InputServiceImpl.class.getClass());
	
	@Autowired
	InputDao inputDao;

	@Override
	public InputPojo addInput(InputPojo inputPojo) {
		LOG.info("entered addInput()");
		//System.out.println(inputPojo);
		InputEntity inputEntity = new InputEntity(inputPojo.getInputid(),
			                                      inputPojo.getUserid(),
				                                  inputPojo.getQuestion1(),
			                                      inputPojo.getQuestion2(),
			                                      inputPojo.getQuestion3(),
			                                      inputPojo.getQuestion4(),
			                                      inputPojo.getQuestion5(),
			                                     inputPojo.getQuestion6());
		System.out.println(inputEntity);
		inputDao.save(inputEntity);
		LOG.info("Exited addInput()");
		BasicConfigurator.resetConfiguration();
		//System.out.println(inputPojo);
		return inputPojo;
	}

}
