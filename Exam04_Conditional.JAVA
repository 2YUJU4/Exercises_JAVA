import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실습1
		
		  System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		  System.out.print("메뉴번호를 입력하세요 : "); String menu = sc.nextLine();
		  
		  if (menu.equals("1")) { System.out.print("입력 메뉴입니다."); } else if
		  (menu.equals("2")) { System.out.print("수정 메뉴입니다."); } else if
		  (menu.equals("3")) { System.out.print("조회 메뉴입니다."); } else if
		  (menu.equals("4")) { System.out.print("삭제 메뉴입니다."); } else if
		  (menu.equals("7")) { System.out.print("프로그램이 종료됩니다."); }
		 

		// 실습2
		
		  System.out.print("숫자를 한 개 입력하세요 : "); int input =
		  Integer.parseInt(sc.nextLine()); if (input%2 == 0&&input > 0) {
		  System.out.println("짝수다"); }else if (input%2 != 0&&input > 0) {
		  System.out.print("홀수다"); }else { System.out.println("양수만 입력해주세요."); }
		 

		// 실습3
		
		  System.out.print("국어 : "); int k = Integer.parseInt(sc.nextLine());
		  
		  System.out.print("수학 : "); int e = Integer.parseInt(sc.nextLine());
		  
		  System.out.print("영어 : "); int m = Integer.parseInt(sc.nextLine());
		  
		  int sum = k + e + m;
		  
		  double avg = (k + e + m)/3;
		  
		  if (k >= 40 && e >=40 && m >= 40 && avg >= 60){ 
		  
		  System.out.println("국어 : " + k); System.out.println("수학 : " + e);
		  System.out.println("영어 : " + m); System.out.println("합계 : "+sum);
		  System.out.println("평균 : "+avg); System.out.println("축하합니다, 합격입니다!");
		  
		  }else if(k >= 40 && e >=40 && m >= 40 && avg < 60){   
		  System.out.println("불합격 입니다."); }
		  
		 ystem.out.println("영어 : " + m); System.out.println("합계 : "+sum);
			  System.out.println("평균 : "+avg); System.out.println("축하합니다, 합격입니다!");
			  
			  }  System.out.println("불합격 입니다.");   
		 
		// 실습5
		
		  System.out.print("아이디 : "); String id = sc.nextLine();
		  
		  System.out.print("비밀번호 : "); String pw = sc.nextLine();
		  
		  if (id.equals("myId")&&pw.equals("myPassword12")) {
		  System.out.print("로그인 성공"); } else if (id.equals("myId")) {
		  System.out.print("비밀번호가 틀렸습니다"); } else if (pw.equals("myPassword12")) {
		  System.out.print("아이디가 틀렸습니다."); }
		 
	
		//실습6
		
		 System.out.print("권한을 확인하고자 하는 회원 등급 : ");		  
		 String a = sc.nextLine();
		  
		 if (a.equals("관리자")) { System.out.print("회원관리, 게시글 관리,  게시글 작성, 댓글 작성 게시글 조회"); 
		 }else if(a.equals("회원")) { System.out.print("게시글 작성, 게시글 조회, 댓글 작성"); 
		 }else if(a.equals("비회원")) { System.out.print("게시글 조회"); 
		 }
		
		
	    //실습7
		 System.out.print("키(m)를 입력해 주세요 : ");		  
		 double height = Double.parseDouble(sc.nextLine());
		 System.out.print("몸무게(kg)를 입력해 주세요 : ");		  
		 double weight = Double.parseDouble(sc.nextLine());
		 double bmi = weight/(height*height);
		 System.out.println("BMI 지수 : " + bmi);
		 
		 if(bmi<18.5) {
			 System.out.println("저체중");
		 }else if(bmi<23&&bmi>=18.5) {
			 System.out.println("정상체중");
		 }else if(bmi<=23&&bmi<25) {
			 System.out.println("과체중");
		 }else if(bmi<=25&&bmi<30) {
			 System.out.println("비만");
		 }else if(bmi>=30) {
			 System.out.println("고도비만");
		 }
		  
    }
}
