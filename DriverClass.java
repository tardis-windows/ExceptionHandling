/*
 * exception handling
 */

import java.util.Scanner;

public class DriverClass{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter x and y" );
		
		int x = scanner.nextInt(); 
		int y = scanner.nextInt(); 
		
		int[] arr = {10,20,30,40}; 
		
		try {
			int div = x/y;
			int answer = div*3; 
			System.out.print(answer);
			
			int idx = 2; 
			
			System.out.print(arr[idx]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace(); 
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("ArithmeticExeption"); 
		}
		
		
		System.out.print("Rest of code");
		scanner.close(); 
		
	}
}

