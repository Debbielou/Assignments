package labResultManagementSystem;

public class FetchLabResultsThread extends Thread {

   private LabResultLinkedList sharedList;

    public FetchLabResultsThread(LabResultLinkedList sharedList) {
        this.sharedList = sharedList;
    }

  
    public void run() {
        // Simulate fetching lab results
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(10000); // loop will run 5x to fetch results but it will delay for 10 seconds for each time
            }
                // Create a new LabResult
       LabResult result = new LabResult("Patient" + i, "Result" + i, "28-07-2024", "Result" + i) {
       
       
         public void processResult() {
           System.out.println(getResult());
          }

          
         public void validateResult() {
        	   
           }       
       };

  // Add the fetched result to the shared list
       synchronized (sharedList) {
           sharedList.add(result);
       }

       System.out.println("Fetched and added result: " + result);
   
} catch (InterruptedException e) {
   System.out.println("Fetching interrupted.");
}
}
}


	
	// my practice below
//	public static void main(String[] args) {
	
//		Thread.currentThread().setName("FetchLabResultsThread");
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setPriority(MAX_PRIORITY);
//		System.out.println(Thread.currentThread().getPriority());
		
//		System.out.println(Thread.currentThread().isAlive());
		
//		FetchLabResultsThread labResultThread = new FetchLabResultsThread();
		//call the start method to make the thread run. if it's not called the print result will be false
//		labResultThread.setDaemon(true);
//		labResultThread.start();
//		System.out.println(labResultThread.isAlive());
//		System.out.println(Thread.activeCount());
//		System.out.println(labResultThread.isDaemon());
//	
	
    

 