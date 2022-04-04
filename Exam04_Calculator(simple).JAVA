import java.util.Scanner;

public class Quiz01_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 계산기 프로그램 ====");
		System.out.print("숫자입력 > ");
		
	    int x = Integer.parseInt(sc.nextLine());
		
	    System.out.print("숫자입력 > ");
		
	    int y = Integer.parseInt(sc.nextLine());
	    
	    System.out.print("연산자 입력(+,-,*,/) > ");
	    
	    String cal = sc.nextLine();
	    
	    if(cal.equals("+")) {
	    	System.out.println(x + " + " + y + " = " + (x+y));
	    }else if(cal.equals("-")) {
	    	System.out.println(x + " - " + y + " = " + (x-y));
	    }else if(cal.equals("*")) {
	    	System.out.println(x + " * " + y + " = " + (x*y));
	    }else if(cal.equals("/")) {
	    	System.out.println(x + " / " + y + " = " + (x/y));
	    }else {
	    	System.out.println("올바른 연산자가 아닙니다.");
	    }
	}	
}