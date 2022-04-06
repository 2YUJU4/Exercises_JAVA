import java.util.Scanner;

public class Exam06_Random2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String com  = null;

int ran = (int)(Math.random()*(3 - 1 + 1) + 1 );
while(true) {
System.out.println("=== 가위 바위 보 게임 ===");
System.out.println("아래의 숫자 중 하나를 선택하세요.");	
System.out.println("1. 가위 2. 바위 3. 보 4. 종료");
System.out.print(">> ");

int input = Integer.parseInt(sc.nextLine());

if(ran == 1) {
	com = "가위";
}else if(ran == 2) {
	com = "바위";
}else if(ran == 3) {
	com = "보";
}

if(input == 1) {
	System.out.println("컴퓨터 : "+com+" 사용자 : 가위");
	if(ran == 1) {
		System.out.println("비겼습니다.");
	}else if(ran == 2) {
		System.out.println("졌습니다.");
	}else if(ran == 3) {
		System.out.println("이겼습니다.");
	}
}else if(input == 2) {
	System.out.println("컴퓨터 : " + com + " 사용자 : 바위");
	if(ran == 1) {
		System.out.println("이겼습니다.");
	}else if(ran == 2) {
		System.out.println("비겼습니다.");
	}else if(ran == 3) {
		System.out.println("졌습니다.");
	}
}else if(input == 3) {
	System.out.println("컴퓨터 : " + com + " 사용자 : 보");
	if(ran == 1) {
		System.out.println("졌습니다");
	}else if(ran == 2) {
		System.out.println("이겼습니다");
	}else if(ran == 3) {
		System.out.println("비겼습니다");
	}
}else if(input == 4) {
	System.out.println("게임을 종료합니다.");
	break;
   }
  }
 }
}
