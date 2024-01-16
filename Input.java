import java.io.* ;  //contain scanner as well as buffer reader
import java.util.*;

class Input{
	public double[] inputNumbers(){  //double[] this is double array
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		double firstNumber = scan.nextDouble();
		
		System.out.println("Enter Second Number");
		double secondNumber = scan.nextDouble();  //java can't take multiple inputs??
		
		double[] numbers = new double[2];
		numbers[0] = firstNumber;
		numbers[1] = secondNumber;
		
		return numbers;
	}
	
	public int[] inputArray(int size){
		Scanner scan = new Scanner(System.in);
		int[] array = new int[size];
		System.out.println("Enter the elements of array: ");
		for (int i=0; i<size; i++){
			System.out.println("Enter " + i + "number:");
			array[i] = scan.nextInt();
		}
		
		for (int i=0; i<size; i++){
		    System.out.println("The entered array is:");
			System.out.println(array[i]);
		}
    	
        int[] arr = new int[size];		
		return arr;
	}
	
}