package service;

import java.util.Optional;

import database.UserDao;
import dto.UserDto;

public class UserService {

	private final UserDao userDao = new UserDao();
	
	public Optional<UserDto> getUser (long id) {
		return userDao.findById(id)
				.map(it -> new UserDto());
	}
}
