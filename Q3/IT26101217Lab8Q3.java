import java.util.Scanner;

public class IT26101217Lab8Q3 {
    public static void main(String[] args) {
	
        int[] numberArray = new int[6];
        int numberCount = 0;
        int userInput;
        
        Scanner input = new Scanner(System.in);
        
        while (numberCount < 6) {
            System.out.print("Enter a Positive Number (" + (numberCount + 1) + "/6): ");
            userInput = input.nextInt();
            
            if (userInput > 0) {
                numberArray[numberCount] = userInput;
                numberCount++;
            }
            else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
        
        int maxNumber = numberArray[0];
        
        for (int count = 0; count < numberArray.length; count++) {
            if (numberArray[count] > maxNumber) {
                maxNumber = numberArray[count];
            }
        }
        
        System.out.println("\nArray Contents:");
        for (int count = 0; count < numberArray.length; count++) {
            System.out.print(numberArray[count] + " ");
        }
        
        System.out.println();
        
        System.out.println("The Maximum Number Entered: " + maxNumber);
        
  
        input.close();
    }
}