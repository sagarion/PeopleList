/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author thibault.daucourt
 */
@Named(value = "peopleListBean")
@RequestScoped
public class PeopleListBean implements Serializable{

    @Inject Services services;
    
    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
    }
    
    public List getPeopleList(){
        return services.getPeopleList();
    }
    
    public void getPeopleListsavePerson(String gender, String firstName, String lastName, Boolean married, Date birthDate){
        services.savePerson(gender, firstName, lastName, married, birthDate);
        
    }
    
}
