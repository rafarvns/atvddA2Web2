package atividadewebjsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnector {
    EntityManagerFactory factory = null;
    public DBConnector(){
        this.factory = Persistence.
                createEntityManagerFactory("atvddwebDS");
    }

    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
