package labResultManagementSystem;

public class UrineTestResult extends LabResult{
	
	private String proteinLevel;

    public UrineTestResult(String patientId, String resultId, String date, String result, String proteinLevel) {
        super(patientId, resultId, date, result);
        this.proteinLevel = proteinLevel;
    }

    public String getProteinLevel() {
        return proteinLevel;
    }


    public void processResult() {
        System.out.println(getResult());
    }

 
    public void validateResult() {
        if (proteinLevel != null && !proteinLevel.isEmpty()) {
            System.out.println("Urine test result is valid.");
        } else {
            System.out.println("Urine test result is invalid.");
        }
    }


   
    public String toString() {
        return super.toString() + ", Protein Level: " + proteinLevel;
    }
}
    
