package com.ibm.eko.dto.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

//TODO: need to replace %package name%
import com.ibm.eko.dto.model.UserDTO;
import com.ibm.eko.entity.User;

@Mapper(componentModel = "spring")
@Component
public interface UserDtoMapper {

	public UserDTO from(User user);

	public List<UserDTO> userList(List<User> users);

}