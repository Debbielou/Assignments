package reportCards;

import java.util.HashMap;
import java.util.Map.Entry;

//Create a Student class with attributes for the student's name and a HashMap<String, Integer> for storing grades in the four subjects.
//Use an ArrayList<Student> to store all the student objects.
//Performance Evaluation:
//Implement a method to calculate the average score for each student.
//Sort the students based on their average scores in descending order (highest average first).
//File Output:
//Write the sorted list of students, along with their grades and average scores, to a text file on the C-drive (C:/report_card.txt).```

public class Student {
	private String name;
    private HashMap<String, Integer> grades;

    public Student(String name, HashMap<String, Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        int sum = 0;
        for (int grade : grades.values()) {
            sum = sum + grade;
        }
        return (double) sum / grades.size();
    }

	public void getPerformance() {
		System.out.println("Subject Grades for " + name + ":");
        for (Entry<String, Integer> entry : grades.entrySet()) {
            String subject = entry.getKey();
            int grade = entry.getValue();
                        System.out.println(subject + ": " + grade);
        }

		
	}
}