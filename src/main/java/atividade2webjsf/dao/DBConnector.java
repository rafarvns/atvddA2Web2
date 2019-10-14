package atividade2webjsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnector {
    EntityManagerFactory factory = null;
    public DBConnector(){
        this.factory = Persistence.
                createEntityManagerFactory("atvdd2webDS");
    }

    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
