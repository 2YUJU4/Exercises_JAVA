import java.util.Scanner;

public class HomeWork_ATM {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

int balance = 3000;

while(true) {
System.out.println("==== ATM 시뮬레이터 ====");
System.out.println("1. 잔액조회");
System.out.println("2. 입금하기");
System.out.println("3. 출금하기");
System.out.println("4. 종료하기");
System.out.print(">> ");

int menu = Integer.parseInt(sc.nextLine());



if(menu == 1) { //잔액조회
    System.out.println("현재 보유 잔액은 " + balance + "원 입니다.");
}else if(menu ==2) { //입금
    System.out.println("얼마를 입금하시겠습니까?");
    System.out.print(">> ");
    int in = Integer.parseInt(sc.nextLine());
    
    System.out.println(in + "원이 입금되었습니다.");
    balance += in;
    
    
}else if(menu == 3) { //출금
    System.out.println("얼마를 출금하시겠습니까?");
    System.out.print(">> ");
    int out = Integer.parseInt(sc.nextLine());
    
    System.out.println(out + "원이 출금되었습니다.");
    balance -= out;
    
}else if(menu == 4) { //종료
    System.out.println("거래가 종료되었습니다.");
    break;
  }
}	
}
}