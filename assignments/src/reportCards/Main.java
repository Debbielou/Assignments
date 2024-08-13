package reportCards;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\Digital Eye\\report_card.txt";
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File exists!");
            // Your existing code to write to the file goes here
        } else {
            System.out.println("File does not exist.");
        }


	}

}
