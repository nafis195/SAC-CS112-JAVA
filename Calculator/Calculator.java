import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
	float number1, number2;
		
		System.out.print("Please enter first numbers: ");
		number1 = input.nextFloat();
		
		System.out.print("Please enter second number: ");
		number2 = input.nextFloat();
		
	float add, substract, multiply, divide;
	
 		add = number1 + number2;        //addition process
		substract = number1 - number2; //subtraction process
		multiply = number1 * number2; //multiplication process
		divide = number1 / number2;  //division process
		
	System.out.println("Sum is " + add); //sum output
	System.out.println("Difference is " + substract); //substract output
	System.out.println("Product is " + multiply);  //multiply output
	System.out.println("Quotient is " + divide);  //division output

	}

}
