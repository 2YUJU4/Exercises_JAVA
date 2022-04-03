import java.util.Scanner;

public class Scanner {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
	//실습문제 1
    public class Exam_01HomeWork {
	public static void main(String[]args) {
		
	System.out.println("이름을 입력하세요");
	String name = sc.nextLine();
		
	System.out.println("성별을 입력하세요(남/여)");
	String gender = sc.nextLine();
		
	char c = gender.charAt(0);
	gender = "남자";
		
	System.out.println(c);
	    
	System.out.println("나이를 입력하세요");
	String age = sc.nextLine();
	    
	System.out.println("키를 입력하세요(cm) : ");
	String high = sc.nextLine();
	    
	System.out.println("이름을 입력하세요 : " + name);
	System.out.println("성별을 입력하세요(남/여) : " + c);
	System.out.println("나이를 입력하세요 : " + age);
	System.out.println("키를 입력하세요(cm) : " + high);
	System.out.println("키 "+ high+"인 "+age+"살 "+gender+" "+name+"님 반갑습니다^^");
	
    //실습문제 2
    System.out.println("첫번째 정수");
	int first = sc.nextInt();
    System.out.println("첫번째 정수 : " + first);
     
    sc.nextLine();
     
    System.out.println("두번째 정수");
    int second = Integer.parseInt(sc.nextLine());
    System.out.println("두번째 정수 : " + second);
     
    System.out.println("더하기 결과 : " + (first + second));
    System.out.println("빼기 결과 : " + (first - second));
    System.out.println("곱하기 결과 : " + (first * second));
    System.out.println("나누기 결과 : " + (first / second));

    //실습문제3
    System.out.print("가로 : ");
    double width = sc.nextDouble();
   
 	System.out.print("세로 : ");
    double high = sc.nextDouble();
	
	System.out.println("면적 : " + (width * high));
	System.out.println("둘레 : " + (width + high)*2);
	
    //실습문제4
    System.out.println("문자열을 입력하세요 : ");
    String a = sc.nextLine();
	
	System.out.println(a.charAt(0));
	    
	char first = a.charAt(0);
	char second = a.charAt(1);
	char third = a.charAt(2);
		
	System.out.println("첫 번째 문자 : " + first);
	System.out.println("두 번째 문자 : " + second);
	System.out.println("세 번째 문자 : " + third);

    //실습문제 5
    System.out.print("인삿말을 입력하세요.\n>> ");
	String hi = sc.nextLine(); //String변수에 저장해 두었나가 나중에 필요할때 변수 부르기.
    
	System.out.print("이릅을 입력하세요.\n>> ");
	 String name = sc.nextLine();
	   
	System.out.print("영문이름을 입력하세요.\n>> ");
	String en = sc.nextLine();
	       
	System.out.print("나이를 입력하세요.\n>> ");
	int age = Integer.parseInt(sc.nextLine());
	    
	System.out.print("체온 측정 결과를 입력하세요.\n>> ");
	 //double tem = sc.nextDouble();
	double tem = Double.parseDouble(sc.nextLine());
	    
	System.out.println(hi);
	System.out.println("저의 이름은 " + name+ "입니다. 영어 이름은 " + en + "입니다.");
	System.out.println("제 나이는 " + age +" 입니다.");
	System.out.println("오늘의 체온측정 결과는 " + tem +"도 입니다.");

    //실습문제 6		
	System.out.println("==== 정수 사칙연산 프로그램 ====");

	System.out.print("첫 번째 정수를 입력해 주세요 >> ");		
	int x = Integer.parseInt(sc.nextLine());
			
	System.out.print("두 번째 정수를 입력해 주세요 >> ");
	int y = Integer.parseInt(sc.nextLine());
			
	System.out.println(x + " + " + y + " = " + (x+y));
	System.out.println(x + " - " + y + " = " + (x-y));
	System.out.println(x + " * " + y + " = " + (x*y));
	System.out.println(x + " / " + y + " = " + (x/y));

	}
}