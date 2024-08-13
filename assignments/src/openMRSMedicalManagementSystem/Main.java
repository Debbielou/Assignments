package openMRSMedicalManagementSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedicationOrder patientOrder = new MedicationOrder();
		
		ArrayList<MedicationOrder> medicationOrders = new ArrayList<>();
	
		
	     medicationOrders.add(new MedicationOrder(001, "Aspirin", "100mg", 101, "01/05/2024", "01/10/2024"));
	     medicationOrders.add(new MedicationOrder(002, "Ibuprofen", "200mg", 102, "01/08/2024", "01/15/2024"));
	     medicationOrders.add(new MedicationOrder(003, "Paracetamol", "500mg", 103, "01/12/2024", "01/20/2024"));
	     medicationOrders.add(new MedicationOrder(004, "Headex", "10mg", 104, "01/10/2024", "01/18/2024"));
	     medicationOrders.add(new MedicationOrder(005, "Magnesium", "500mg", 105, "01/15/2024", "01/25/2024"));
	     medicationOrders.add(new MedicationOrder(006, "Dexa", "20mg", 106, "01/20/2024", "01/30/2024"));
	     
	    
	     for (MedicationOrder order : medicationOrders) { // this is an implementation of toString method
	         long duration = patientOrder.calculateDuration(order.getStartDate(), order.getEndDate())  ;
	    	 System.out.println(order );
	    	 System.out.println("The treatment will take " + duration + " " + "days");    
	    	 
	     }

	     
	     ArrayList<Patient> patients = new ArrayList<>();
	     patients.add(new Patient(101, "Alice", 30, "Female"));
	     patients.add(new Patient(102, "Bob", 45, "Male"));
	     patients.add(new Patient(103, "Carol", 28, "Female"));
	     patients.add(new Patient(104, "David", 50, "Male"));
	     patients.add(new Patient(105, "Eve", 22, "Female"));
	     patients.add(new Patient(106, "Frank", 60, "Male"));
	     
	     for (Patient patient : patients) {
	            System.out.println(patient);
	            System.out.println();
	        }
	   	    
	     
	     Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("1. Add new medication order");
	            System.out.println("2. View all medication orders");
	            System.out.println("3. Update medication order details");
	            System.out.println("4. Delete medication order");
	            System.out.println("5. Calculate total duration of medication orders");
	            System.out.println("6. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // go to newline

	            if (choice == 1) {
	                addMedicationOrder(scanner);
	            } else if (choice == 2) {
	                viewAllMedicationOrders();
	            } else if (choice == 3) {
	                updateMedicationOrder(scanner);
	            } else if (choice == 4) {
	                deleteMedicationOrder(scanner, null);
	            } else if (choice == 5) {
	                calculateTotalDuration();
	            } else if (choice == 6) {
	                exit = true;
	            } else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void addMedicationOrder(Scanner scanner) {
	        System.out.println("Enter medication order details:");
	        System.out.print("ID: ");
	        scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Medication Name: ");
	        scanner.nextLine();
	        System.out.print("Dosage: ");
	        scanner.nextLine();
	        System.out.print("Patient ID: ");
	        scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Start Date (MM/DD/YYYY): ");
	        scanner.nextLine();
	        System.out.print("End Date (MM/DD/YYYY): ");
	        scanner.nextLine();

	    }

	    
	    @SuppressWarnings("null")
		private static void viewAllMedicationOrders() {
	        MedicationOrder[] medicationOrders = null;
			for (MedicationOrder order : medicationOrders) {
	            System.out.println(order);
	        }
	    }
	    
	    @SuppressWarnings("null")
		private static void updateMedicationOrder(Scanner scanner) {
	        System.out.print("Enter the ID of the medication order to update: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        MedicationOrder[] medicationOrders = null;
			for (MedicationOrder order : medicationOrders) {
	            if (order.getId() == id) {
	                System.out.println("Enter new details (leave blank to keep current value):");
	                System.out.print("Medication Name (" + order.getMedicationName() + "): ");
	                String medicationName = scanner.nextLine();
	                if (!medicationName.isEmpty()) {
	                    order.setMedicationName(medicationName);
	                }
	                System.out.print("Dosage (" + order.getDosage() + "): ");
	                String dosage = scanner.nextLine();
	                if (!dosage.isEmpty()) {
	                    order.setDosage(dosage);
	                }
	                System.out.print("Start Date (" + order.getStartDate() + "): ");
	                String startDate = scanner.nextLine();
	                if (!startDate.isEmpty()) {
	                    order.setStartDate(startDate);
	                }
	                System.out.print("End Date (" + order.getEndDate() + "): ");
	                String endDate = scanner.nextLine();
	                if (!endDate.isEmpty()) {
	                    order.setEndDate(endDate);
	                }
	                System.out.println("Medication order updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Medication order not found.");
	    }

	    private static void deleteMedicationOrder(Scanner scanner, MedicationOrder[] medicationOrders) {
	        System.out.print("Enter the ID of the medication order to delete: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        MedicationOrder[] medicationOrders1;
			for (MedicationOrder order : medicationOrders1) {
	            if (order.getId() == id) {
	                medicationOrders1.length();
	                System.out.println("Medication order deleted successfully.");
	                return;
	            }
	        }
	        System.out.println("Medication order not found.");
	    }

	    private static void calculateTotalDuration() {
	        long totalDuration = 0;
	        for (MedicationOrder order : medicationOrders) {
	            totalDuration += order.calculateDuration();
	        }
	        System.out.println("Total duration of all medication orders: " + totalDuration + " days.");
	    }

}


	    

//	        MedicationOrder orderDate;
//			if (orderDate.validateDates()) {
//	            ArrayList<MedicationOrder> medicationOrders;
//				medicationOrders.add(orderDate);
//	            System.out.println("Medication order added successfully.");
//	        } else {
//	            System.out.println("Invalid date format. Medication order not added.");
//	        }
	     
	  
	     
	  
//        String startDate = "22/07/2024";
//        boolean dateValid = patientOrder.validateDates(startDate);
//        System.out.println("Is the date valid? " + dateValid);
        
//
//        String startDate = "07/22/2024";
//        String endDate = "07/30/2024";
//        patientOrder.calculateDuration(startDate, endDate);
 