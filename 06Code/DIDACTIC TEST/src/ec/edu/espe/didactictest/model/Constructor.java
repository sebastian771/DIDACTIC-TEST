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
public class Constructor {
    private String name;
    private int age;
    private String indentificationCard;
    private String school;

    public Constructor(String name, int age, String indentificationCard, String school) {
        this.name = name;
        this.age = age;
        this.indentificationCard = indentificationCard;
        this.school = school;
    }
    
  @Override
    public String toString() {
        return "Student{" + "name=" +getName() + ", age=" + getAge()
                + ",indentificationCard=" + getIndentificationCard() + ",school=" + getSchool();
    }
    public String generateCsvData() {
        return getName() + "," + getAge() + "," + getIndentificationCard() + "," + getSchool();
    } 

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the indentificationCard
     */
    public String getIndentificationCard() {
        return indentificationCard;
    }

    /**
     * @param indentificationCard the indentificationCard to set
     */
    public void setIndentificationCard(String indentificationCard) {
        this.indentificationCard = indentificationCard;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }
    
}
