/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projektmaven1;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Pitero
 */
@Named(value = "MB")
@RequestScoped
public class NewJSFManagedBean {

    private String slowo;

    public NewJSFManagedBean() {
    }

    public String getSlowo() {
        return slowo;
    }

    public void setSlowo(String slowo) {
        this.slowo = slowo;
    }

}
