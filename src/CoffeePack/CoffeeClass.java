package CoffeePack;

import java.util.ArrayList;
import java.util.Scanner;
public class CoffeeTest {
	public static void main(String[] args) {
		
		ArrayList<Coffee> container = new ArrayList<Coffee>();
		
		
		Coffee c1 = new Coffee();
		c1.setType("아이스 아메리카노");
		c1.setPrice(1200);
		c1.setIced(true);
		
		Coffee c2 = new Coffee();
		c2.setType("카페라떼");
		c2.setPrice(2200);
		c2.setIced(false);
		
		Coffee c3 = new Coffee();
		c3.setType("바닐라라떼");
		c3.setPrice(3200);
		c3.setIced(false);
		
		container.add(c1);container.add(c2);container.add(c3);
		
		
		Coffee tmp  = (Coffee)container.get(1);
		
		tmp.putAllInfo();
		
		boolean isFound = false;
		String search ="아이스";
//		for(Coffee x : container) {
//			if(x.getType().contains(search)) {
//				isFound=true;
//			}
//		}
//		if(isFound) {System.out.println("맞다.");}
//		else {System.out.println("아니다.");}
//
//	}
		
		
		Coffee order = new Coffee();
		System.out.println("커피종류를 입력하세요 1.아이스아메리카노 2.카페라떼 3.바닐라라떼");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n==1) {order.setType("아이스아메리카노");order.setPrice(1200);}
		else if(n==2) {order.setType("카페라떼");order.setPrice(2200);}
		else if(n==3) {order.setType("바닐라라떼");order.setPrice(3300);}
		else {System.out.println("Error 없는번호 입니다.");}
		
		n = input.nextInt();
		if(n==1) {order.setIced(true);}
		else if(n==2) {order.setIced(false);}
		else {System.out.println("Error 없는번호 입니다.");}
		
		System.out.println("=========================================");
		order.putAllInfo();
		System.out.println("=========================================");
		
		container.add(order);
	
		
	}

	

}
