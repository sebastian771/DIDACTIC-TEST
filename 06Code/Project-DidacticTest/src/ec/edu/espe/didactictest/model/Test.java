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
import List.ListQuestion;
import Lectura.Read;

/**
 *
 * @author Seabstian
 */
public class Test {
    private ListQuestion<Question> questions;
    private int totalQuestions;
    private int questionID;

    public Test() {
        questions = new ListQuestion<>();  
        totalQuestions = 0;
        questionID = 0;
    }

    public ListQuestion<Question> getQuestions() {
        return questions;
    }

    public int getTotalQuestions() {
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
            System.out.println("No hay preguntas");
        } else {

           
            Read Enterokay = new Read();

            int i = 0, answer;
            Question question;

            while (i < questions.size()) {

               
                question = questions.get(i);
              
                question.showQuestion();

                answer = Enterokay.pedirIntRango(1, question.getAnswers().size(), "Introduce la respuesta");

                if (question.checkAnswer(answer)) {
                    System.out.println("Has acertado");
                    totalQuestions += question.getPoints();
                } else {
                    System.out.println("No has acertado");
                }

                i++;
            }

        }

        System.out.println("Has obtenido " + totalQuestions + " puntos");
    }

    public void loadArchive(String archive) throws FileNotFoundException, IOException {

        BufferedReader buffer = new BufferedReader(new FileReader(archive));

        String line;
        Question question;
        ListQuestion<Answer> respuestas = new ListQuestion<>();
        String texto_pregunta = "";
        int puntosPregunta = 0, opcioncorrecta = 0;
        boolean pregunta = false, respuesta = false, puntos = false;

        while ((line = buffer.readLine()) != null) {

            try {

                if (line.startsWith(";P;")) {
                    texto_pregunta = line.substring(3);
                    pregunta = true; 
                } else if (pregunta && line.startsWith(";R;")) {
                    opcioncorrecta = Integer.parseInt(line.substring(3).trim());
                    respuesta = true;
                } else if (respuesta) {
                    puntosPregunta = Integer.parseInt(line.trim());
                    puntos = true;
                } else if (pregunta) {
                    respuestas.addLast(new Answer(line));

                    if (respuestas.size() > 4) {
                        throw new Exception();
                    }
                }
                if (pregunta && respuesta && puntos && (respuestas.size() >= 2 && respuestas.size() <= 4)) {

                    respuestas.get(opcioncorrecta - 1).setCorrectly(true);

                    question = new Question(texto_pregunta, respuestas, puntosPregunta);

                    questions.addLast(question);

                    pregunta = false;
                    respuesta = false;
                    puntos = false;
                    respuestas = new ListQuestion<>();

                }

            } catch (Exception ex) {

                pregunta = false;
                respuesta = false;
                puntos = false;
                respuestas = new ListQuestion<>();
            }

        }

        buffer.close();

    }
}
