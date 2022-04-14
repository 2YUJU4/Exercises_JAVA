import java.util.Scanner;

public class Shop_Program_Run {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	Shop_Program baskin = new Shop_Program ("베스킨31","09:00","21:00", new Shop_Program_Product[10]);
	while(true) {
	System.out.println("***** baskin 재고 관리 프로그램 *****");
	//1. 아이스크림 등록 2. 아이스크림 목록확인 3. 가게 정보 확인 0. 프로그램 종료
	System.out.println("1. 제품 등록");
	System.out.println("2. 제품 목록 확인");
	System.out.println("3. 가게 정보 확인");
	System.out.println("0. 프로그램 종료");
	System.out.print(">> ");
	
	int menu = Integer.parseInt(sc.nextLine());
	
	if(menu == 1) {
		System.out.print("등록할 제품을 선택하세요 ");
		System.out.print("1. 아이스크림");
		System.out.print("2. 빵");
		System.out.print("3. 음료");
		System.out.print(">> ");
		int pd = Integer.parseInt(sc.nextLine());
		
		System.out.println("품번 입력 >> ");
		String product_no =  sc.nextLine();
		
		System.out.println("이름 입력 >> ");
		String name = sc.nextLine();
		
		System.out.println("가격 입력 >> ");
		int price = Integer.parseInt(sc.nextLine());
		
		if(pd == 1) {
			baskin.addProduct(new Shop_Program_IceCream(product_no, name, price));
		}else if(pd == 2) {
			baskin.addProduct(new Shop_Program_Bread(product_no, name, price)); 
			
		}else if(pd == 3) {
			baskin.addProduct(new Shop_Program_Beverage(product_no, name, price));
		}
		
		
	}else if(menu == 2) {
		System.out.println(baskin.printProduct());
	}else if(menu == 3) {
		System.out.println(baskin.getName()
				+" :  "+baskin.getOpenTime()
				+" : "+baskin.getCloseTime()
				+" : "+baskin.printProduct());
		
	}else if(menu == 0) {
		break;
	}
   }
   } 
}
