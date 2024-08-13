package openMRSMedicalManagementSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicationOrder {
	
	private int ID;
	private String medicationName;
	private String dosage;
	private int patientID;
	private String startDate;
	private String endDate;
	
	public MedicationOrder(int ID, String medicationName, String dosage, int patientID, String startDate, String endDate) {
    this.ID = ID;
    this.medicationName = medicationName;
    this.dosage = dosage;
    this.patientID = patientID;
    this.startDate = startDate;
    this.endDate = endDate;
	}
   
	           
    public MedicationOrder() {
		
	}
    
    public int getPatientID(){
    	return patientID;
    }


  public boolean validateDates(String startDate) {
    try {
        // Define the expected date format (dd/MM/yyyy)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Strict parsing

        // Parse the start date
        Date parsedDate = dateFormat.parse(startDate);

        // Validate the date (optional additional checks can be added here)
        return true; // Date is valid
    } catch (ParseException e) {
        // Handle invalid date format
        return false; // Date is invalid
    }
}

  public long calculateDuration(String startDate, String endDate) {
      
	  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); // an object of 'SimpleDateFormat' class
      try {
          Date start = sdf.parse(startDate);
          Date end = sdf.parse(endDate);
          long diffInMillies = Math.abs(end.getTime() - start.getTime());
            
                  
          int days = (int) (diffInMillies / (1000*60*60*24));
         
          return days;
          
        // return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
      } catch (ParseException e) {
          e.printStackTrace();
          return 0;
      }
  }

  public String toString() {
	  return "ID: " + ID +
              "\nMedicationName: " + medicationName +
              "\nDosage: " + dosage +
              "\nPatient ID: " + patientID +
              "\nStartDate: " + startDate +
              "\nEndDate: " + endDate + "\n";

	}
  
  public String getStartDate() {
	  return startDate;
  }
  public String getEndDate() {
	  return endDate;
  }


public long calculateDuration() {
	// TODO Auto-generated method stub
	return 0;
}


public boolean validateDates() {
	// TODO Auto-generated method stub
	return false;
}


public void setMedicationName(String medicationName2) {
	// TODO Auto-generated method stub
	
}


public void setDosage(String dosage2) {
	// TODO Auto-generated method stub
	
}


public void setStartDate(String startDate2) {
	// TODO Auto-generated method stub
	
}


public void setEndDate(String endDate2) {
	// TODO Auto-generated method stub
	
}


public int getId() {
	// TODO Auto-generated method stub
	return 0;
}


public String getMedicationName() {
	// TODO Auto-generated method stub
	return null;
}


public String getDosage() {
	// TODO Auto-generated method stub
	return null;
}
}
