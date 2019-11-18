package com.ibm.dto.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

//TODO: need to replace %package name%
import com.ibm.dto.model.UserDTO;
import com.ibm.entity.User;

@Mapper(componentModel = "spring")
@Component
public interface UserDtoMapper {

	public UserDTO from(User user);

	public List<UserDTO> userList(List<User> users);

}