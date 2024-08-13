package labResultManagementSystem;

public class DisplayLabResultsThread extends Thread {

    private LabResultLinkedList sharedList;

    public DisplayLabResultsThread(LabResultLinkedList sharedList) {
        this.sharedList = sharedList;
    }

    
    public void run() {
        try {
            while (true) {
       // Display the lab results every 3 seconds
         Thread.sleep(3000);

          synchronized (sharedList) {
           System.out.println("Displaying all lab results:");
            sharedList.display();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Display interrupted.");
        }
    }
}


