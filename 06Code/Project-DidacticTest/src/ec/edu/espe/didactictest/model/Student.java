/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author David Zambrano
 */
public class Student {
    
    

    public static String name;
 
    private String lastName;
    private String age;
    private String indentificationCard;
    private String school;
    private String fitness; 
    private String inclination; 
    private String affinity; 
    private String taste; 
    private String quality; 
    public static String username;
    private String password;
    private String passwordA;
    private boolean confirmation;
    private boolean save;
    private String option;

    private Scanner write = new Scanner(System.in);

    
    private Scanner writen = new Scanner(System.in);
    private Menu2 menu = new Menu2();
    private Write w = new Write();

    public void login() throws FileNotFoundException, IOException {

        while (getOption() != "3") {
            try {
                System.out.println("ººDIDACTIC TESTºº");
                System.out.println("1.Register");
                System.out.println("2.Log in");
                System.out.println("3.-Exit");
                System.out.println("----------------------");
                System.out.println("Select an option");
                setOption(getWriten().nextLine());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            switch (getOption()) {

                case "1":
                    Scanner read = new Scanner(System.in);
                    System.out.println("ººDIDACTIC TEST - REGISTERºº");
                    System.out.println("Enter your names:");
                    setName(getWrite().nextLine());
                    System.out.println("Enter your last name:");
                    setLastName(getWrite().nextLine());
                    System.out.println("Enter your age:");
                    setAge(getWrite().nextLine());
                    System.out.println("Enter your ID:");
                    setIndentificationCard(getWrite().nextLine());
                    System.out.println("Enter your school");
                    setSchool(getWrite().nextLine());
                    System.out.println("Username:");
                    setUsername(getWrite().nextLine());
                    File fi = new File("Data.csv");
                    if (fi.exists()) {
                        FileReader fr = new FileReader(fi);
                        BufferedReader br = new BufferedReader(fr);
                        String Line;
                        while ((Line = br.readLine()) != null) {
                            String[] contact = Line.split(",");
                            if (contact[0].equals(getUsername())) {
                                relogin();
                            }

                        }

                    }

                    System.out.println("Password:");
                    setPassword(getWrite().nextLine());
                    System.out.println("Again the password");
                    setPasswordA(getWrite().nextLine());
                    Constructor c = new Constructor(getUsername(), getPasswordA());
                    getW().user(c);
                    if (getPassword().equals(getPasswordA())) {
                        System.out.println("You have successfully registered");
                    } else {
                        System.out.println("Not successfully registered :(");
                    }

                    break;

                case "2":

                    System.out.println("ººDIDACTIC TEST - LOG INºº");
                    System.out.println("Username:");
                    setUsername(getWrite().nextLine());
                    System.out.println("Password:");
                    setPassword(getWrite().nextLine());                    
                    File f = new File("Data.csv");
                    if (f.exists()) {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String Line;
                        while ((Line = br.readLine()) != null) {
                            String[] contact = Line.split(",");
                            if (contact[0].equals(getUsername()) && contact[1].equals(getPassword())) {
                                Constructor constructor = new Constructor(getUsername(), getPasswordA());
                                getMenu().menu2(constructor);
                            }
                        }
                    }
                    System.out.println("You don't have an account yet. "
                            + "Proceed to register");

                    break;
                case "3":
                    System.exit(0);
                    System.out.println("Thank you for trusting Didactic Test");

                default:
                    System.out.println("Option not valid, just enter \"1\", "
                            + "\"2\" or \"3\"");
                    break;
            }

        }
    }

    public void relogin() throws FileNotFoundException, IOException {
        File fi = new File("Data.csv");
        if (fi.exists()) {
            FileReader fr = new FileReader(fi);
            BufferedReader br = new BufferedReader(fr);
            String Line;
            while ((Line = br.readLine()) != null) {
                String[] contact = Line.split(",");
                if (contact[0].equals(getUsername())) {
                    System.out.println("This user is already registered try another");
                    System.out.println("Username:");
                    setUsername(getWrite().nextLine());
                    relogin();
                }

            }

        }
    }

    public void deleteAccount() {

    }

    public void registerCapacities() {

    }

    public boolean saveData() {
        return false;
    }

    public void edit() {

    }

    public static String getName() {
        System.out.println("<<<<-<<<<-<-<-<<" + name);
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
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

    /**
     * @return the fitness
     */
    public String getFitness() {
        return fitness;
    }

    /**
     * @param fitness the fitness to set
     */
    public void setFitness(String fitness) {
        this.fitness = fitness;
    }

    /**
     * @return the inclination
     */
    public String getInclination() {
        return inclination;
    }

    /**
     * @param inclination the inclination to set
     */
    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    /**
     * @return the affinity
     */
    public String getAffinity() {
        return affinity;
    }

    /**
     * @param affinity the affinity to set
     */
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * @return the quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the passwordA
     */
    public String getPasswordA() {
        return passwordA;
    }

    /**
     * @param passwordA the passwordA to set
     */
    public void setPasswordA(String passwordA) {
        this.passwordA = passwordA;
    }

    /**
     * @return the confirmation
     */
    public boolean isConfirmation() {
        return confirmation;
    }

    /**
     * @param confirmation the confirmation to set
     */
    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    /**
     * @return the save
     */
    public boolean isSave() {
        return save;
    }

    /**
     * @param save the save to set
     */
    public void setSave(boolean save) {
        this.save = save;
    }

    /**
     * @return the option
     */
    public String getOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * @return the write
     */
    public Scanner getWrite() {
        return write;
    }

    /**
     * @param write the write to set
     */
    public void setWrite(Scanner write) {
        this.write = write;
    }

    /**
     * @return the writen
     */
    public Scanner getWriten() {
        return writen;
    }

    /**
     * @param writen the writen to set
     */
    public void setWriten(Scanner writen) {
        this.writen = writen;
    }

    /**
     * @return the menu
     */
    public Menu2 getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(Menu2 menu) {
        this.menu = menu;
    }

    /**
     * @return the w
     */
    public Write getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(Write w) {
        this.w = w;
    }
    
    
    @Override
    public String toString() {
        return "Name: " + getName() +"\nLastname: " + lastName + "\nAge: " + age + 
              "\nSchool: " + school + "\nIdentification:" + indentificationCard; //To change body of generated methods, choose Tools | Templates.
    }    
   // public String toStrings() {
      //  return name;
   // }//
}
