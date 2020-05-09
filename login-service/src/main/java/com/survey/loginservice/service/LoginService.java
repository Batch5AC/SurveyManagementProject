package com.survey.loginservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
import com.survey.loginservice.pojo.UserOutputPojo;

public interface LoginService {
	ResponseEntity<UserOutputPojo> checkUser(LoginPojo loginPojo);

	ResponseEntity<List<AdminDataPojo>> checkAdmin(AdminLoginPojo adminLoginPojo);
}
