public class StudentManager_DTO {
    	//번호(no) 이름(name) 나이(age) 성별(gender)

        private int no;
        private String name;
        private int age;
        private char gender;
    
        public StudentDTO() {}
        
        public StudentDTO(int no, String name, int age, char gender) {
            super();
            this.no = no;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        
        public int getNo() {
            return this.no;
        }
        public void setNo() {
            this.no = no;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge() {
            return this.age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public char getGender() {
            return this.gender;
        }
        public void setGender(char gender) {
            this.gender = gender;
        }
    
        @Override
        public String toString() {
            return no + " : " + name + " : "+ age + " : "+ gender;
        }
}
