import java.util.Scanner;

public class IT26101217Lab8Q4 {
    public static void main(String[] args) {
	
        int[] studentsArray = new int[8];
        int studentCount = 0;
        int userInput;
        
        Scanner input = new Scanner(System.in);
        
        while (studentCount < 8) {
            System.out.print("Enter Student ID for Student " + (studentCount + 1) + ": ");
            userInput = input.nextInt();
            
            if (userInput > 0) {
                studentsArray[studentCount] = userInput; // Store the Positive Number
                studentCount++;
            }
            else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
        
        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = input.nextInt();
        boolean isFound = false;
        
        for (int count = 0; count < studentsArray.length; count++) {
            if (studentsArray[count] == searchId) {
                isFound = true;
                break;
            }
        }
        
        if (isFound) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
        
        input.close();
    }
}