package atividade2webjsf.bean;

import atividade2webjsf.dao.DBConnector;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class DBBean implements Serializable {

    private String wellcome = "Hello Horld";

    public DBBean() {
        new DBConnector();
    }

    public String getWellcome() {
        return wellcome;
    }

    public void setWellcome(String wellcome) {
        this.wellcome = wellcome;
    }
}
