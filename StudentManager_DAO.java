public class StudentManager_DAO {
    
    private ArrayList stdList = new ArrayList<>();
	
	public void insert(StudentDTO std){
		stdList.add(std);
	}
	
	public ArrayList selectAll() { //알맞은 반환자료형 
		return stdList;
	}
	
	public void modify(StudentDTO std) {
		//downcasting stdList는 Object형으로 감싸져있는 상태
		//Object에는 getNo의 메소드가 존재하지 않음, StudentDTO로 형변환
		for(int i = 0; i < stdList.size(); i++) {
			if(((StudentDTO) stdList.get(i)).getNo() == std.getNo()) {
				stdList.set(i, std); 				
				break;
			}
		}
	}

	public void delete(int no) {
		 for(int i = 0; i < stdList.size(); i++) {
				 if(((StudentDTO) stdList.get(i)).getNo() == no) {
					stdList.remove(i); 
					break;
			}
		 }
	}
}