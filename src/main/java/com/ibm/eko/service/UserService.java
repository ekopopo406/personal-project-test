package com.ibm.eko.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ibm.eko.entity.User;
import com.ibm.eko.exception.MSIException;
import com.ibm.eko.util.TimeUtil;

@Service
public class UserService {

	public User getUserByUserId(String userId) throws MSIException {
		/* MSI sample entity, usually this will be fetched from DB */
		
		User user = new User();
		user.setId("msisampleuserid");
		user.setCreateTime(TimeUtil.getCurrDateTime());
		user.setUpdateTime(TimeUtil.getCurrDateTime());
		user.setFullname("microservice generator");
		user.setUsername("microservice");
		user.setMail("msi@ibm.com");
		
		/*open below commented out code to test the exception */
		
		//user.setMail(null);
		if (user.getMail() == null) {
			throw new MSIException(HttpStatus.BAD_REQUEST, "try to throw exception");
		}
		return user;
	}
}
