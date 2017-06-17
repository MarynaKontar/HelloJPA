package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by User on 15.06.2017.
 */
public class App {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em =  factory.createEntityManager();

        em.getTransaction().begin();//!!! Если не сделать begin и commit, то изменения в базе не появятся

        DAO dao = new DAOImpl(em);
        Person p = new Person();
        p.setName("AAAA");
        p.setAge(30);
        em.persist(p);
//        dao.save(p);

    em.getTransaction().commit();//!!!

    }
}
