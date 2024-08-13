package labResultManagementSystem;

public class BloodTestResult extends LabResult {
	
	private String hemoglobinLevel;

    public BloodTestResult(String patientId, String resultId, String date, String result, String hemoglobinLevel) {
        super(patientId, resultId, date, result);
        this.hemoglobinLevel = hemoglobinLevel;
    }

    public String getHemoglobinLevel() {
        return hemoglobinLevel;
    }

    public void setHemoglobinLevel(String hemoglobinLevel) {
        this.hemoglobinLevel = hemoglobinLevel;
    }

   
    public void processResult() {
       System.out.println(getResult());
    }

   
    public void validateResult() {
    	if (hemoglobinLevel != null && !hemoglobinLevel.isEmpty()) {
            System.out.println("Blood test result is valid.");
        } else {
            System.out.println("Blood test result is invalid.");
        }
    }


  
    public String toString() {
    	return super.toString() +	"\n" +		
    	"\nHemoglobinLevel: " + hemoglobinLevel;
    }
    
    

    }



   