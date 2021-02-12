package org.oar.app.main;

import org.oar.app.dao.UserDao;
import org.oar.app.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CatApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CatApplication.class, args);
		UserDao dao = context.getBean(UserDao.class);
		
		
		User u = new User();
		
		u.setId(10);
		
		dao.save(u);
	}

}
