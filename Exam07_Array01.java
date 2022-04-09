public class Exam07_Array01 {
    public static void main(String[] args) {
        
        int[] intArr2 = new int[100];
        for(int i = 99; i >= 0; i--) {
            intArr2[i] = 99 - i;
        }
        System.out.println("intArr2[0] : "+intArr2[0]);
        System.out.println("intArr2[99] : "+intArr2[99]);
        
        
        int[] intArr3 = new int[100];
        for(int i = 0; i < intArr3.length; i++) {
            intArr3[i] = intArr3.length - i;
        }
        System.out.println("intArr3[0] : "+intArr3[0]);
        System.out.println("intArr3[99] : "+intArr3[99]);
        
    }
}
