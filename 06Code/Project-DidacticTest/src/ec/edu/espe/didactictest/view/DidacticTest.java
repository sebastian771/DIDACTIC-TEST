
package ec.edu.espe.didactictest.view;

import ec.edu.espe.didactictest.model.Test;
import ec.edu.espe.didactictest.model.Analysis;
import ec.edu.espe.didactictest.model.Menu2;
import ec.edu.espe.didactictest.model.Student;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class DidacticTest {
    public static void main(String[] args) throws Exception {             
        Analysis analysis = new Analysis();
        Student student = new Student();
        
        student.login();        
        analysis.testAnalysis();
    }
}
