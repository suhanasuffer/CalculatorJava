import java.io.* ;  //contain scanner as well as buffer reader
import java.util.*;

class Calculator{
 public double addition (double firstNumber, double secondNumber){
    return firstNumber + secondNumber; 
}

public double subtraction (double firstNumber, double secondNumber){
    return firstNumber - secondNumber; 
}

public double multiplication (double firstNumber, double secondNumber){
    return firstNumber * secondNumber; 
}

public double division (double firstNumber, double secondNumber){
	return firstNumber / secondNumber;
}

public double addArray (double[] array){
	double sum = 0;
	for (double i=0; i<array.length; i++){
		sum = sum + array[i];
	}
	return sum;
}

public double variance (double[] array){
	double sum = 0;
	double vari = 0;
	double mean = 0;
	double n = array.length;
	double sumSd = 0;
	
	for (double i=0; i<n; i++){
		sum = sum + array[i];
	}
	
	mean = sum / n;

	
	for (double i=0; i<n; i++){	
        sumSd = sumSd + Math.pow((array[i]-mean),2);
        }
            
        vari = sumSd / n;
		
		return vari;
	}
	
public double standardDeviation (double[] array){
	double sum = 0;
	double vari = 0;
	double mean = 0;
	double n = array.length;
	double sumSd = 0;
	double stdev = 0;
	
	for (double i=0; i<n; i++){
		sum = sum + array[i];
	}
	
	mean = sum / n;
	
	for (double i=0; i<n; i++){	
        sumSd = sumSd + Math.pow((array[i]-mean),2);
        }
            
    vari = sumSd / n;
     
    stdev = Math.sqrt(vari);	 
	
}


}