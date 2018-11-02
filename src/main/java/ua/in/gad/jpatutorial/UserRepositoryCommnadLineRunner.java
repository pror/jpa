package ua.in.gad.jpatutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ua.in.gad.jpatutorial.entity.User;
import ua.in.gad.jpatutorial.service.UserRepository;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommnadLineRunner implements CommandLineRunner {

    public static final Logger log = LoggerFactory.getLogger(UserRepositoryCommnadLineRunner.class);

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Juli", "Root_superRole");
        repository.save(user);
        List<User> userx = repository.findAll();
        log.info("find : " + userx);
    }
}
