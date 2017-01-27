/**
 * 
 */
package arithmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/*
 * As a programmer you need to make the usage of application as easy as possible.
 * Top priority should be usability and efficiency.
 * We will try to make a calculator with an interface like just like Linux command line tool
 */ 
/**
 * @author Avanti
 *
 */
public class CalculatorDemo {
	
	public CalculatorDemo(){
		
	}
	
	private Double performOperation(String input){
		//Regex r = "+/-*%"; 
		//input.split(regex);
		// split string based on regex to an array;
		
		return null;
	}
	
	private void printResult(Double result, String input){
		System.out.println(input + "=" + result);
	}
	
	private void calculate(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try {
			while (true) {
				input = br.readLine();
				if (input.equalsIgnoreCase("exit") ||
						input.equalsIgnoreCase("quit")){
					break;
				} else {
					Double result = performOperation(input);
					if(result!=null){
						printResult(result, input);						
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDemo calcDemo = new CalculatorDemo();
		calcDemo.calculate();
	}
}