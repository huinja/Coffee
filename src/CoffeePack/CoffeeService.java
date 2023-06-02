package CoffeePack;
public class Coffee {
	
	private String Type;
	private int Price;
	private boolean Iced;
	
	void setType(String t) {Type=t;}
	void setPrice(int p) {Price=p;}
	void setIced(boolean ice) {Iced=ice;}
	
	String getType() {return Type;}
	int getPrice() {return Price;}
	boolean getIced() {return Iced;}
	
	
	void putType() {System.out.println("커피타입 "+getType()+"입니다.");}
	void putPrice() {System.out.println("커피가격은 "+getPrice()+"입니다.");}
	void putIced() {System.out.println("아이스여부 "+getIced()+"입니다.");}
	
	void putAllInfo() {
		putType();
		putPrice();
		putIced();
	}
	

}
