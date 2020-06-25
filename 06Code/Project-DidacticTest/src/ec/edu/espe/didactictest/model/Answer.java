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
public class Answer {
    private String answer;
    private boolean correctly;

    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }   

    public boolean isCorrectly() {
        return correctly;
    }

    public void setCorrectly(boolean correctly) {
        this.correctly = correctly;
    }

    @Override
    public String toString() {
        return answer;
    }
    
}
