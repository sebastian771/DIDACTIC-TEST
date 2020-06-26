/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

/**
 *
 * @author Deniss
 */
public class Reply {
    private String reply;
    private boolean correctly;

    public Reply(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return reply;
    }   

    public boolean isCorrectly() {
        return correctly;
    }

    public void setCorrectly(boolean correctly) {
        this.correctly = correctly;
    }

    @Override
    public String toString() {
        return reply;
    }
    
}
