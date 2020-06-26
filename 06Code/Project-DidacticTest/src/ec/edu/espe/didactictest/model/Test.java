/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didactictest.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import ec.edu.espe.didactictest.utils.ListQuestion;
import ec.edu.espe.didactictest.utils.Validation;

/**
 *
 * @author Seabstian
 */
public class Test {

    private ListQuestion<Question> questions;
    public static int totalQuestions;
    private int questionID;
    public static int totalPoints;

    public Test() {
        questions = new ListQuestion<>();
        totalQuestions = 0;
        questionID = 0;
    }

    public ListQuestion<Question> getQuestions() {
        return questions;
    }

    public static int getTotalPoints() {
        return totalPoints;
    }

    public static void setTotalPoints(int totalPoints) {
        Test.totalPoints = totalPoints;
    }

    public static int getTotalQuestions() {
        return totalQuestions;
    }

    public int getQuestionID() {
        return questionID;
    }

    public Question nextQuestion() {
        Question question = questions.get(questionID);

        if (question != null) {
            questionID++;
        }
        return question;
    }

    public void restartTest() {
        questionID = 0;
        totalQuestions = 0;
    }

    public void performTest() {
        if (questions.isEmpty()) {
            System.out.println("There are no questions to display");
        } else 
        totalPoints += totalQuestions;
    }

    public void loadArchive(String archive) throws FileNotFoundException, IOException {

        BufferedReader buffer = new BufferedReader(new FileReader(archive));
        ListQuestion<Reply> replys = new ListQuestion<>();
        
        String line;
        Question question;        
        String text_question = "";        
        int pointsQuestion = 0, opcioncorrecta = 0;
        boolean questionBoolean = false, replyBoolean = false, pointsBoolean = false;

        while ((line = buffer.readLine()) != null) {

            try {
                if (line.startsWith(";P;")) {
                    text_question = line.substring(3);
                    questionBoolean = true;
                } else if (questionBoolean && line.startsWith(";R;")) {
                    opcioncorrecta = Integer.parseInt(line.substring(3).trim());
                    replyBoolean = true;
                } else if (replyBoolean) {
                    pointsQuestion = Integer.parseInt(line.trim());
                    pointsBoolean = true;
                } else if (questionBoolean) {
                    replys.addLast(new Reply(line));

                    if (replys.size() > 4) {
                        throw new Exception();
                    }
                }

                if (questionBoolean && replyBoolean && pointsBoolean && (replys.size() >= 2 && replys.size() <= 4)) {

                    replys.get(opcioncorrecta - 1).setCorrectly(true);

                    question = new Question(text_question, replys, pointsQuestion);

                    questions.addLast(question);

                    questionBoolean = false;
                    replyBoolean = false;
                    pointsBoolean = false;
                    replys = new ListQuestion<>();
                }

            } catch (Exception ex) {
                questionBoolean = false;
                replyBoolean = false;
                pointsBoolean = false;
                replys = new ListQuestion<>();
            }
        }
        buffer.close();
    }

    void totalQuestions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
