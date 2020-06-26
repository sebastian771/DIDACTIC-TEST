/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import ec.edu.espe.didactictest.utils.ListQuestion;
/**
 *
 * @author Roberth
 */

public class Question {
    
    private String question;
    private ListQuestion<Answer> answers;
    private int points;
    
    public Question(String question, ListQuestion<Answer> answers, int points) {
        this.question = question;
        this.answers = answers;
        this.points = points;
    }
    
    public String getQuestion() {
        return question;
    }

    public ListQuestion<Answer> getAnswers() {
        return answers;
    }

    public int getPoints() {
        return points;
    }    
    
    public void showQuestion(){
        System.out.println(question);
        
        int i=0;
        
        while(i<answers.size()){            
            System.out.println("\t  " + (i+1) + answers.get(i));
            i++;
        }
    }
        
    public boolean checkAnswer(int answer){
        Answer nr1 = answers.get(answer - 1);
        
        if (nr1 != null)
        {
            return nr1.isCorrectly();
        }
        return false;
    }
}
