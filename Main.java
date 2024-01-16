import java.io.* ;  //contain scanner as well as buffer reader
import java.util.*;

class Main{
	public static void main(String args[]){
		Input input = new Input();
		Calculator calculator = new Calculator();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to perform operations on an array(1) or two numbers(2)?");
		int x = scan.nextInt();
		
		if (x == 1){		
			System.out.println("Enter the size of array:");
			double size = scan.nextDouble(); 
			double[] arr = new double[size];
			arr = input.inputArray(size);
			System.out.println("Do you want to add (1), calculate variance(2) or calculate standard deviation(3) of the array");
			int a = scan.nextInt();
			switch (a) {
				case 1:
				System.out.println("Addition of the given array is " + calculator.addArray(arr));
				break;
				case 2:
				System.out.println("Variance of array is " + calculator.variance(arr));
				break;
				case 3:
				System.out.println("Standard deviation of array is " + calculator.standardDeviation(arr));
				break;
				default:
				System.out.println("Invalid choice.");
			}
		}
		
		else if (x == 2){
		 double[] numbers = new double[2];		
		 numbers = input.inputNumbers();
		
		 System.out.println("Do you wish to add(1), subtract(2), multiply(3) or divide(4) the two numbers?");
		 int n = scan.nextInt();
		 switch (n) {
			 case 1:
			 System.out.println("The addition of " + numbers[0] + " and " + numbers[1] + " is " + calculator.addition(numbers[0], numbers[1])); 
             break;
             
            case 2:
            System.out.println("The subtraction of " + numbers[0] + " and " + numbers[1] + " is " + calculator.subtraction(numbers[0], numbers[1]));
            break;

            case 3:
            System.out.println("The multiplication of " + numbers[0] + " and " + numbers[1] + " is " + calculator.multiplication(numbers[0], numbers[1])); 
            break;

            case 4:
            System.out.println("The division of " + numbers[0] + " and " + numbers[1] + " is " + calculator.division(numbers[0], numbers[1]));
        
            default:
            System.out.println("Invalid choice");			
		 }
	    }
	    else{
			System.out.println("Invalid choice.");
		}
		
}
}

