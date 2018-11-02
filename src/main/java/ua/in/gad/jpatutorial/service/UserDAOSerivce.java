package ua.in.gad.jpatutorial.service;

import org.springframework.stereotype.Repository;
import ua.in.gad.jpatutorial.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class UserDAOSerivce {

    @PersistenceContext
    private EntityManager entityManager;


    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
