public class Shop_Program {
    private String name;
	private String openTime;
	private String closeTime;
	private Shop_Program_Product[] product; //부모형 클래스 멤버필드
	private int index = 0;
	
	public Shop_Program() {}
	
	public Shop_Program(String name, String openTime, String closeTime, Shop_Program_Product[] product) {
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.product = product;
		
		//this.name 은 상위 shop의 멤버필드 name - 사용자가 넘겨주는 매개변수와 구별하기 위하여
	}
	
	public Shop_Program_Product[] getProduct() {
		return this.product;
	}
	public void setProduct(Shop_Program_Product[] product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public void addProduct(Shop_Program_Product product) {
		this.product[index++] = product;
	}

	public String printProduct() {
		String rs ="";
		for(int i = 0; i <this.product.length; i++) {
			if(this.product[i] != null) {
				rs += product[i].getProduct_no()
				 + " : "+product[i].getName()
				 + " : "+product[i].getPrice()
				 +"\n";
			}
		}
		return rs;
	}   
}
