import java.util.Scanner;

public class Quiz03_VendingMachine {
public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);

int balance = 3000; // 소지금
int coke = 0;  // 콜라 소지한 갯수       
int sprite = 0; // 사이다 소지한 갯수
int maesil = 0; // 매실차 소지한 갯수

int coke_price = 1000;
int sprite_price = 800;
int maesil_price = 1500;


vending : while(true) {
System.out.println("==== 자판기 시뮬레이터 ====");
System.out.println("음료수를 선택하세요.");
System.out.println("1. 콜라(+ coke_price +) 2. 사이다(+sprite_price+) 3. 매실차(+maesil_price+) [0. 소지품 확인] 10. 자판기 종료");
System.out.print(">> ");
int menu = Integer.parseInt(sc.nextLine());


switch(menu) {
    case 1: //콜라
        if(balance < coke_price) { //잔액이 부족하면
            System.out.println("잔액이 부족합니다.");
            break;
        }
        System.out.println("콜라를 구매했습니다.");
        System.out.println("콜라 +1");
        System.out.println("소지금 -"+coke_price);
        balance -= coke_price;
        coke++;
        
    break;
    case 2: //사이다
        if(balance < sprite_price) {
            System.out.println("잔액이 부족합니다.");
            break;
        }
        System.out.println("사이다를 구매했습니다.");
        System.out.println("사이다 +1");
        System.out.println("소지금 -"+sprite_price);
        balance -= sprite_price;
        sprite++;
        
    break;
    case 3: //매실차
        if(balance < maesil_price) {
            System.out.println("잔액이 부족합니다.");
            break;
        }
        System.out.println("매실차를 구매했습니다.");
        System.out.println("매실차 +1");
        System.out.println("소지금 -"+maesil_price);
        balance -= maesil_price;
        maesil++;
        
    break;
    case 0: //소지품확인
        System.out.println("==== 소지품 목록 ====");
        System.out.println("소지품 : " + balance);
        System.out.println("콜라 : " + coke +"개");
        System.out.println("사이다 : " + sprite +"개");
        System.out.println("매실차 : " + maesil + "개");
        System.out.println("==================");
        
    break;
    case 10: //자판기 종료
        System.out.println("자판기 종료");
    break vending;
  default: //메뉴다시선택
      System.out.println("메뉴를 잘못 입력했습니다.");
  }
}
}
}