/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

/**
 *
 * @author David Zambrano
 */
public class Associate {
    
    private String name;
    private String lastName;
    private String age;
    private String school;
    private String id_username;
    private String password;
    private String passwordA;
    private boolean confirmation;
    private boolean save;
    private String option; 

    public Associate(String name, String lastName, String age,String school, 
            String username, String passwordA) {        
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.school = school;
        this.id_username = username;
        this.passwordA = passwordA;        
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getID_Username() {
        return id_username;
    }

    public void setID_Username(String username) {
        this.id_username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordA() {
        return passwordA;
    }

    public void setPasswordA(String passwordA) {
        this.passwordA = passwordA;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public boolean isSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }  
}
    
  
