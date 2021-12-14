package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.UserService;
import ibmtal.com.facebook.database.UserDao;
import ibmtal.com.facebook.entity.User;
@Service
public class UserManager implements UserService {
	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public ArrayList<User> getAll() {
		
		return new ArrayList<User>(userDao.findAll());
	}
	
}
