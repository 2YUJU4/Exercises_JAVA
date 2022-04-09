public class Exam07_Array02 {
    public static void main(String[] args) {
     
        char[] arr = new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (65 + i); 
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
	//foreach 
//	for(char i : arr) { 
//		System.out.print(i + " ");
//	}
    }
}
