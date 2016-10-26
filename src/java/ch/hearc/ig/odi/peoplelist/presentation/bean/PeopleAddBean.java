/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author thibault.daucourt
 */
@Named(value = "peopleAdd")
@RequestScoped
public class PeopleAddBean extends Person {
    
    @Inject
    Services service;

    /**
     * Creates a new instance of PeopleAdd
     */
    public PeopleAddBean() {
        super();
    }
    
    public String addPerson() {
        service.savePerson(super.getGender(), super.getFirstName(), super.getLastName(), super.getMarried(), super.getBirthDate());
        return "ListPeople.xhtml";
    }
}