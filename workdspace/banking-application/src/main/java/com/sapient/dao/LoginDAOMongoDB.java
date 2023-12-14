package com.sapient.dao;

import com.sapient.beans.Login;
import com.sapient.dao.contracts.ILoginDao;
import com.sapient.exception.LoginFailedException;

public class LoginDAOMongoDB implements ILoginDao{

	@Override
	public boolean loginCheck(Login login) throws LoginFailedException {
		// you are connecting to db (MongoDB) 
		return false;
	}

}
