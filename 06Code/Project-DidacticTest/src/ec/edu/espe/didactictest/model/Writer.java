/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author David Zambrano
 */
public class Writer {

    public void user(Associate recent) {

        try {
            File f = new File("Data.csv");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(recent.getName() + "," + recent.getLastName() + "," + recent.getAge()
                        + "," + recent.getIndentificationCard() + "," + recent.getSchool() + "," + recent.getUsername()
                        + "," + recent.getPasswordA());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(recent.getName() + "," + recent.getLastName() + "," + recent.getAge()
                        + "," + recent.getIndentificationCard() + "," + recent.getSchool() + "," + recent.getUsername()
                        + "," + recent.getPasswordA());
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("There were problems creating the file!!");
        }
    }
}
