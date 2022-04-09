import javax.swing.JOptionPane;

public class showConfirmDialog {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("1. 이름을 입력하세요");
        JOptionPane.showMessageDialog(null, name+"님 안녕하세요");
        
        String count = JOptionPane.showInputDialog("2. 인원수를 입력하세요");
        JOptionPane.showMessageDialog(null, count+"명 입니다.");
        
        String temp = JOptionPane.showInputDialog("3. 체온을 입력하세요");
        JOptionPane.showMessageDialog(null, "손님의 체온은 "+temp+"도 입니다");
        
        String toGo = JOptionPane.showInputDialog("4. 매장식사 여부를 입력하세요");
        JOptionPane.showConfirmDialog(null, toGo);

    }  
}
