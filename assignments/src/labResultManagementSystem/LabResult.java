package labResultManagementSystem;

//patientId (String)
//resultId (String)
//date (String)
//result (String)
//Methods:

//Constructor to initialize the attributes.
//Getter and setter methods for each attribute.
//toString() method to display the lab result details.
//Abstract methods processResult() and validateResult().

public abstract class LabResult {
	private String patientId;
	private String resultId;
	private String date;
	private String result;
	
	public LabResult(String patientId, String resultId, String date, String result){ // constructor to initialize the attributes
		this.patientId = patientId;
		this.resultId = resultId;
		this.date = date;
		this.result = result;
	}
	public LabResult() {
		
	}
	public String getPatientId() {
		return patientId;
	}
	public String getResultId() {
		return resultId;
	}
	public String getDate() {
		return date;
	}
	public String getResult() {
		return result;
	}
	public void setPatientId(String newPatientId) {
   }
	public void setResultId(String newResultId) {
	   }
	public void setDate(String newDate) {
	   }
	public void setResult(String newResult) {
	   }
	
	public String toString() {
		return "The lab results are: " +
	    "\nPatient ID: " + patientId +
	    "\nResult ID: " + resultId +
	    "\nDate: " + date +
	    "\nResult: " + result;
	}
	
	public abstract void processResult();
		
	
	public abstract void validateResult();
		
	
}