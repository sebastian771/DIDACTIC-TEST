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
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author David Zambrano
 */
public class Student {
    
    public static String name; 
    public static String lastName;
    public static String age;
    public static String school;
    public static String id_username;
    private String password;
    private String passwordA;
    private boolean confirmation;
    private boolean save;
    private String option;
    
    private Scanner write = new Scanner(System.in);    
    private Scanner writen = new Scanner(System.in);
    private DTMenu menu = new DTMenu();
    private Writer w = new Writer();

    public void login() throws FileNotFoundException, IOException {

        while (getOption() != "3") {
            try {
                System.out.println("|------------------------------------|");
                System.out.println("|----------ººDIDACTIC TESTºº---------|");
                System.out.println("|    1.Register                      |");
                System.out.println("|    2.Log in                        |");
                System.out.println("|    3.-Exit                         |");
                System.out.println("|------------------------------------|");
                System.out.println("|------------------------------------|");
                System.out.print("| Select an option: ");
                setOption(getWriten().nextLine());
                System.out.println("|------------------------------------|");
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            switch (getOption()) {

                case "1":
                    String yellow = "\033[33m";
                    String black ="\033[30m";
                    System.out.println("--------------------------------------");
                    System.out.println("|    ººDIDACTIC TEST - REGISTERºº    |");
                    System.out.println("--------------------------------------");
                    System.out.print("  Enter your names: ");
                    setName(getWrite().nextLine());
                    System.out.print("  Enter your last name: ");
                    setLastName(getWrite().nextLine());
                    System.out.print("  Enter your age: ");
                    setAge(getWrite().nextLine());                    
                    System.out.print("  Enter your Hig School: ");
                    setSchool(getWrite().nextLine());
                    System.out.println(yellow+ "--------------------------------------");
                    System.out.println(yellow+ "|       ¡¡¡¡REMEMBER!!!!             |");
                    System.out.println(yellow+ "|   YOUR ID WILL BE YOUR USERNAME    |");
                    System.out.println(yellow+ "--------------------------------------");
                    System.out.print(black+" Enter your ID/Username: ");
                    setID_Username(getWrite().nextLine());                  
                    
                    File fi = new File("UserRecords.csv");
                    
                    if (fi.exists()) {
                        FileReader fr = new FileReader(fi);
                        BufferedReader br = new BufferedReader(fr);
                        
                        String Line;
                        
                        while ((Line = br.readLine()) != null) {
                            String[] contact = Line.split(",");
                            
                            if (contact[3].equals(getID_Username())) {                                
                                relogin();
                            }
                        }
                        
                    }
                    System.out.print(black+"Password: ");
                    setPassword(getWrite().nextLine());
                    System.out.print(black+"Again the password: ");
                    setPasswordA(getWrite().nextLine());
                    
                    Associate c = new Associate(getName(),getLastName(),getAge(),
                            getSchool(),getID_Username(), getPasswordA());
                    
                    
                    if (getPassword().equals(getPasswordA())) {
                        String green="\033[32m";
                        System.out.println(green+"--------------------------------------");
                        System.out.println(green+" It has been successfully registered as: " 
                                          + getName());
                        System.out.println(green+"--------------------------------------");
                        
                        File f = new File("UserRecords.csv");
                        getW().user(c);
                    
                        Associate constructor = new Associate(getName(),getLastName(),getAge(),
                                getSchool(),getID_Username(), getPasswordA());
                        getMenu().menu2(constructor);
                      
                    } else {
                        String red="\033[31m";
                        System.out.println(red+"--------------------------------------");
                        System.out.println(red+"|   Not successfully registered :(   |");
                        System.out.println(red+"--------------------------------------");
                        
                        break;
                    }    
                        
           

                case "2":
                    String green="\033[32m";
                    System.out.println("------ººDIDACTIC TEST - LOG INºº------");
                    System.out.println(green+"| Username:");
                    setID_Username(getWrite().nextLine());
                    System.out.println(green+"Password:");
                    setPassword(getWrite().nextLine());
                    
                    File f = new File("UserRecords.csv");
                    
                    if (f.exists()) {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String Line;

                        while ((Line = br.readLine()) != null) {
                            String[] contact = Line.split(",");
                            
                            if (contact[4].equals(getID_Username()) && contact[5].equals(getPassword())) {
                                Associate constructor = new Associate(getName(),getLastName(),getAge(),
                                getSchool(),getID_Username(), getPasswordA());
                                
                                name = contact[0];
                                lastName = contact[1];
                                age = contact[2];
                                school = contact[3];                                
                                
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

    public void relogin() throws FileNotFoundException, IOException{
        File fi = new File("UserRecords.csv");
        
        if (fi.exists()) {
            FileReader fr = new FileReader(fi);
            BufferedReader br = new BufferedReader(fr);
            String Line;
            
            while ((Line = br.readLine()) != null) {
                String[] contact = Line.split(",");
                
                if (contact[3].equals(getID_Username())) {
                    System.out.println("This user is already registered try another");
                    System.out.println("Username:");
                    setID_Username(getWrite().nextLine());
                    relogin();
                }

            }

        }
    }

    public boolean saveData() {
        return false;
    }
   
    public static String getName() {       
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
     * @return the username
     */
    public String getID_Username() {
        return id_username;
    }

    /**
     * @param username the username to set
     */
    public void setID_Username(String username) {
        this.id_username = username;
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
    public DTMenu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(DTMenu menu) {
        this.menu = menu;
    }

    /**
     * @return the w
     */
    public Writer getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(Writer w) {
        this.w = w;
    }
    
    
    @Override
    public String toString() {
        return "Name: " + getName() +"\nLastname: " + getLastName() + "\nAge: " 
                + age + "\nSchool: " + school + "\nIdentification:" + 
                getID_Username();
    }   
  
}
