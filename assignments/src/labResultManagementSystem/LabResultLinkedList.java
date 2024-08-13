package labResultManagementSystem;

public class LabResultLinkedList {
    private LabResultNode head;


public void add(LabResult result) {
    LabResultNode newNode = new LabResultNode(result);
    if (head == null) {
        head = newNode;
    } else {
        LabResultNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

public void display() {
	LabResultNode current = head;
    while (current != null) {
        System.out.println(current.data);
        System.out.println(); // Add a blank line after each lab result
        current = current.next;
    }
}


public void update(String resultId, String newResult) {
    LabResultNode current = head;
    while (current != null) {
        if (current.data.getResultId().equals(resultId)) {
            current.data.setResult(newResult);
            System.out.println("Result updated successfully.");
            display();
            return;
        }
        current = current.next;
    }
    System.out.println("Result ID not found.");
}

public void delete(String resultId) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    if (head.data.getResultId().equals(resultId)) {
        head = head.next;
        System.out.println("Result deleted successfully.");
        display();
        return;
    }

    LabResultNode current = head;
    while (current.next != null) {
        if (current.next.data.getResultId().equals(resultId)) {
            current.next = current.next.next;
            System.out.println("Result deleted successfully.");
            display();
            return;
        }
        current = current.next;
    }
    System.out.println("Result ID not found.");
}
}
