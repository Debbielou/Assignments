package reportCards;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Reports {
	
	
public static void main(String[] args) {
	 

  Scanner scanner = new Scanner(System.in);
  ArrayList<Student> students = new ArrayList<>();

	  for (int i = 0; i < 2; i++) {
	   System.out.println("Enter student name:");
	   String name = scanner.nextLine();
	   HashMap<String, Integer> grades = getStudentGrades(scanner);
	   Student student = new Student(name, grades);
	   students.add(student);
	        }

	        scanner.close();

	        students.sort(Comparator.comparingDouble(Student::getAverageScore).reversed());

	        printReportCard(students);
	        saveReportCardToFile(students);
	    }

     private static HashMap<String, Integer> getStudentGrades(Scanner scanner) {
    HashMap<String, Integer> grades = new HashMap<>();
    System.out.println("Enter grades (Math, English, SST, Science):");
    grades.put("Math", scanner.nextInt());
    grades.put("English", scanner.nextInt());
    grades.put("SST", scanner.nextInt());
    grades.put("Science", scanner.nextInt());
    scanner.nextLine();
    return grades;
     }

     private static void printReportCard(ArrayList<Student> students) {
     System.out.println("Mid Term Report Card:");
     for (Student student : students) {
        System.out.println(student.getName() + "'s Average score: " + student.getAverageScore());
        student.getPerformance();
    }
 }

    private static void saveReportCardToFile(ArrayList<Student> students) {
    String filePath = "C:\\Users\\Digital Eye\\report_card.txt";
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
        writer.println("Report Card:");
        for (Student student : students) {
            writer.println(student.getName() + "'s Average score: " + student.getAverageScore());
        }
        System.out.println("Report card saved successfully!");
    } catch (IOException e) {
        e.printStackTrace();
    }

	    
	    }
	

}
	


