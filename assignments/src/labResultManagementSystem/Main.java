package labResultManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		LabResultLinkedList patientResults = new LabResultLinkedList();
		
		         
        patientResults.add(new BloodTestResult("Patient001", "Result1", "28-07-2024", "Positive", "13.5"));
        patientResults.add(new BloodTestResult("Patient002", "Result2", "25-08-2024", "Positive", "10.2"));
        patientResults.add(new UrineTestResult("Patient003", "Result3", "31-12-2024", "Positive", "9.6"));
        patientResults.add(new UrineTestResult("Patient004", "Result4", "15-11-2024", "Positive", "11.3"));    
        
     // Displaying the lab results using the display method 
               patientResults.display();
        
      
        // implementation of a method to update a specific lab result
//         patientResults.update("Result3", "Negative");
         

//       patientResults.display(); // call display method to see the change after updating
        
//         patientResults.delete("Result4"); 
//         patientResults.display();
        
     // Starting the fetch and display threads
        FetchLabResultsThread fetchThread = new FetchLabResultsThread(patientResults);
        DisplayLabResultsThread displayThread = new DisplayLabResultsThread(patientResults);

        fetchThread.start();
        displayThread.start();
    }


        
}
	

