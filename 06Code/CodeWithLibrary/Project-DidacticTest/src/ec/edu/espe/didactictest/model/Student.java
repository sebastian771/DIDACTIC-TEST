/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import static ec.edu.espe.didactictest.model.DTMenu.getOption;
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
    //Colors
    public String green ="\033[32m]";
    public String yellow = "\033[33m";
    public String black ="\033[30m";
    public String red="\033[31m";
    
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
                System.out.print(black+"| Select an option: ");
                setOption(getWriten().nextLine());
                System.out.println("|------------------------------------|");
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            switch (getOption()) {

                case "1":
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
                    if(getID_Username().length()==10){
                    }else{
                        reEnterUsername();
                        /*while (getID_Username().length()!=10) {
                            if(getID_Username().length()!=10){
                                if(getID_Username().length()<10){
                                    System.out.println(red+"Very shrot ID, must be 10 characters!!");    
                                    System.out.println(red+"  Re-enter your ID/Username!!! ");
                                    System.out.print(black+ " ID/Username: "+black);
                                }
                                if(getID_Username().length()>10){
                                    System.out.println(red+"Very long ID, must be 10 characters!!");    
                                    System.out.println(red+"  Re-enter your ID/Username!!! ");
                                    System.out.print(black+ " ID/Username: "+black);
                                }
                            }*/
                        
                                                            }                       
                    
                   File fi = new File("UserRecords.csv");     
                    if (fi.exists()) {
                        FileReader fr = new FileReader(fi);
                        BufferedReader br = new BufferedReader(fr);
                        
                        String Line;
                        
                        while ((Line = br.readLine()) != null) {
                            String[] contact = Line.split(",");
                            
                            if (contact[4].equals(getID_Username())) {                                
                                relogin();
                            }}}
                    
                    System.out.print(black+" Password: ");
                    setPassword(getWrite().nextLine());
                    System.out.print(black+" Again the password: ");
                    setPasswordA(getWrite().nextLine());
                    
                    Associate c = new Associate(getName(),getLastName(),getAge(),
                            getSchool(),getID_Username(), getPasswordA());
                    
                    
                    if (getPassword().equals(getPasswordA())) {
                        
                        System.out.println(green+" -----------------------------------------");
                        System.out.println(green+" It has been successfully registered as:");
                        System.out.println("\t\t\t" +getName());
                        System.out.println(green+"--------------------------------------"+black);
                        
                        File f = new File("UserRecords.csv");
                        getW().user(c);
                    
                        Associate constructor = new Associate(getName(),getLastName(),getAge(),
                                getSchool(),getID_Username(), getPasswordA());
                        getMenu().menu2(constructor);
                      
                    } else {
                        System.out.println(red+"--------------------------------------");
                        System.out.println(red+"|   Not successfully registered :(   |");
                        System.out.println(red+"--------------------------------------"+black);
                        
                        break;
                    } 
                        
           

                case "2":
                    System.out.println("------ººDIDACTIC TEST - LOG INºº------");
                    System.out.print("| Username:  "+green);
                    setID_Username(getWrite().nextLine());
                    System.out.print(black+"| Password:  "+green);
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
                    System.out.println(green+ "Thank you for trusting Didactic Test");
                default:
                    System.out.println(red+"Option not valid, just enter \"1\", "
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
                
                if (contact[4].equals(getID_Username())) {
                    System.out.println(red+"This user is already registered try another!!");
                    System.out.print(black+"Username:");
                    setID_Username(getWrite().nextLine());
                    reEnterUsername();
                    relogin();
                }
            }
        }
    }

    public void reEnterUsername(){
while (getID_Username().length()!=10) {
    if(getID_Username().length()!=10){
        if(getID_Username().length()<10){
            System.out.println(red+"Very shrot ID, must be 10 characters!!");    
            System.out.println(red+"  Re-enter your ID/Username!!! ");
            System.out.print(black+ " ID/Username: "+black);
        }
        if(getID_Username().length()>10){
            System.out.println(red+"Very long ID, must be 10 characters!!");    
            System.out.println(red+"  Re-enter your ID/Username!!! ");
                                    System.out.print(black+ " ID/Username: "+black);
            }
        } setID_Username(getWrite().nextLine());   
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
