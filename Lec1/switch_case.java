package Lec1;
import java.util.*;


public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1");
		int num1 = sc.nextInt();
		System.out.println("num2");
		int num2 = sc.nextInt();
		System.out.println("Operator (+, -, *, /)10");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		switch(operator) {
		case '+' : result = num1 + num2;
		break;
		case '-': result = num1 - num2;
		break;
		case '*': result = num1 * num2;
		break;
		case '/': result = num1/num2;
		break;
		default: System.out.print("Invalid");
		}
		System.out.print("Result:"+result);
		sc.close();
;	}

}
