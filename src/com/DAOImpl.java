package com;

import javax.persistence.EntityManager;

/**
 * Created by User on 15.06.2017.
 */
public class DAOImpl implements DAO {

    private EntityManager entityManager;

    public DAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Person person) {
        entityManager.persist(person);

    }
}
