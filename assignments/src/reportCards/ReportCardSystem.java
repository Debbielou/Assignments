package reportCards;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class ReportCardSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            
            HashMap<String, Integer> grades = new HashMap<>();
            System.out.println("Enter grades for " + name + ":");
            System.out.println("Math:");
            grades.put("Math", scanner.nextInt());
            System.out.println("English:");
            grades.put("English", scanner.nextInt());
            System.out.println("SST:");
            grades.put("SST", scanner.nextInt());
            System.out.println("Science:");
            grades.put("Science", scanner.nextInt());
            scanner.nextLine(); 

            Student student = new Student(name, grades); // this is the object of the student class
            students.add(student);//method adds student objects to the arraylist called students
        }
        
        scanner.close();

        students.sort(Comparator.comparingDouble(Student::getAverageScore).reversed());

        System.out.println("Mid Term Report Card:");
        for (Student student : students) {
            System.out.println(student.getName() + " 's Average score: " + student.getAverageScore());
            student.getPerformance();

        }
       

        // Save report card to file
        String filePath = "C:\\Users\\Digital Eye\\report_card.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Report Card:");
            for (Student student : students) {
             writer.println(student.getName() + " 's Average score: " + student.getAverageScore());
//             student.getPerformance();  
            }
            System.out.println("Report card saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}