public class Exam06_Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        int min = 1;
        int max = 10;
        int ranNum = (int)(Math.random()*(max - min + 1) + min );
        
        
        //초기화 : 변수에 초기값(default값)을 주는것
        //String rs = "";
        String rs = null; //null : 아무것도 아닌값
        
        
        if((ranNum%2) == 0) {
            rs = "짝";
        }else if((ranNum%2) == 1) {
            rs = "홀";
        }
        
        //System.out.println(ranNum);
        
        System.out.println("==== 홀/짝 맞추기 게임 ====");
        System.out.println("홀/짝을 입력하세요. >> ");
        String input = sc.nextLine();
        
        if(input.equals(rs)) {
            System.out.println("정답");
        }else {
            System.out.println("오답");
        }      
      }
    }
  }
}
