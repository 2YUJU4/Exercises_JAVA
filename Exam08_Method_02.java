import java.util.Scanner;

public class Exam08_Method_02 {

    public static String dict(String kor){

        String eng = "";
		
		if(kor.equals("당근")) {
			eng = "carrot";
		}else if(kor.equals("마늘")) {
			eng = "galic";	
		}else if(kor.equals("양파")) {
			eng = "onion";
		}else {
			eng = "사전에 등록되지 않은 단어";	
		}
		
		return eng;
		
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 원하는 채소의 이름을 입력하세요. ====");
		System.out.print(">> ");
		String veg = sc.nextLine();
		
		String eng = dict(veg);
		
		System.out.println("입력한 " + veg + "은/는 영어로 " + eng + "입니다");   
    }   
}