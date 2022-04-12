import java.util.Scanner;

public class Exam08_Method {
    
    public static void getCustomer(String name ) {
    	System.out.println(name + "님 어서오세요!");
     }
     public static void getCustomer(int num) {
    	 if(num == 1) {
    		 System.out.println("혼밥 손님 입니다.");
    	 }else{
    		 System.out.println("손님 "+ num +"명 입장하였습니다.");
    	 }
     }
	 public static void getCustomer(double tem) {
		 System.out.println("현재 입장한 손님의 체온은 "+tem+"도 입니다.");
		 if(tem > 37.0) {
			 System.out.println("출입이 어렵습니다");
		 }else if(tem >= 36.5) {
			 System.out.println("정상 체온 입니다");
		 }else {
			 System.out.println("저체온 입니다.");
		 }
	 }
     public static void getCustomer(boolean heretogo) {
    	 if(heretogo == true) {
    		 System.out.println("매장 손님 입니다.");
    	 }else {
    		 System.out.println("포장 손님 입니다.");
    	 }
     }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	  	
        System.out.println("=== 손님 맞이 프로그램 ===");
        System.out.print("1. 이름을 입력해 주세요 >> ");
        String name = sc.nextLine();
        getCustomer(name);
        
        System.out.println();
        
        System.out.print("2. 인원수를 입력 해 주세요 >> ");
        int num = Integer.parseInt(sc.nextLine());
        getCustomer(num);
        
        System.out.println();
        
        System.out.print("3. 체온을 측정해 주세요 >> ");
        double tem = Double.parseDouble(sc.nextLine());
        getCustomer(tem);
        
        System.out.println();
        
        System.out.print("4. 매장 식사 여부를 입력해 주세요 >> ");{
        boolean heretogo = Boolean.parseBoolean(sc.nextLine());
        getCustomer(heretogo);
      }
    }
}