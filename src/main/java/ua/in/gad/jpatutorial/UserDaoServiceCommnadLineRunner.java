package ua.in.gad.jpatutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ua.in.gad.jpatutorial.entity.User;
import ua.in.gad.jpatutorial.service.UserDAOSerivce;

@Component
public class UserDaoServiceCommnadLineRunner implements CommandLineRunner {

    public static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommnadLineRunner.class);

    @Autowired
    private UserDAOSerivce userDAOSerivce;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insertId = userDAOSerivce.insert(user);
        log.info("New user is created : " + insertId);
    }
}
