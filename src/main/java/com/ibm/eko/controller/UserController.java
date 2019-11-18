package com.ibm.eko.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.eko.api.UsersApi;
import com.ibm.eko.dto.mapper.UserDtoMapper;
import com.ibm.eko.dto.model.UserDTO;
import com.ibm.eko.entity.User;
import com.ibm.eko.exception.MSIException;
import com.ibm.eko.service.UserService;
import com.ibm.eko.util.HttpResponseBuilder;

@RestController
public class UserController implements UsersApi {

	@Autowired
	private UserService mUserServie;

	@Autowired
	private UserDtoMapper mUserDtoMapper;

	@Override
	public ResponseEntity<Object> getUserById(@Valid String id, String authorization) {
		try {
			// TODO: do your own service magic here
			User user = mUserServie.getUserByUserId(id);
			UserDTO dto = mUserDtoMapper.from(user);
			return HttpResponseBuilder.success(HttpStatus.OK, "success", dto);
		} catch (MSIException e) {
			return HttpResponseBuilder.fail(e.getCode(), "failed", e.getMessage());
		} catch (Exception e) {
			return HttpResponseBuilder.fail(HttpStatus.BAD_REQUEST, "failed", e.getMessage());
		}
	}
}
