package labResultManagementSystem;

public class LabResultNode {
	
	LabResult data;
    LabResultNode next;

    public LabResultNode(LabResult data) {
        this.data = data;
        this.next = null; // null is used as a placeholder
    }
}
