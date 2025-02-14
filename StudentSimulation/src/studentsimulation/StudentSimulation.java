package studentsimulation;

import java.util.Scanner;

public class StudentSimulation {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("FirstName: ");
        String firstName = inp.nextLine();
        
        Student student = new Student(firstName,"Auditor","BsIT",
        "2b",2024-2025,89.22,78.1);
        
      student.evaluateGrade();
    }
    
}
