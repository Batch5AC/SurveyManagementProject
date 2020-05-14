package com.survey.inputservice.service;


import com.survey.inputservice.pojo.InputPojo;
import com.survey.inputservice.pojo.InputStatPojo;

public interface InputService {

	InputPojo addInput(InputPojo inputPojo);

	InputStatPojo getStat(int id);

}
