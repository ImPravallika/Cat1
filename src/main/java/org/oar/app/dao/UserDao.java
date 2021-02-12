package org.oar.app.dao;

import org.oar.app.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao  extends CrudRepository<User, Integer>{

}
