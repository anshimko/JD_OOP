package by.htp.les10.main.task05a.main;

import by.htp.les10.main.task05a.controller.Controller;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();
		
		String resp1 = controller.doAction("createBouquet bouquet=Birhtday");
		String resp2 = controller.doAction("addCover bouquet=Birhtday name=Paper price=2");
		String resp3 = controller.doAction("addFlower bouquet=Birhtday name=Rose color=Red price=10");
		String resp4 = controller.doAction("addFlower bouquet=Birhtday name=Rose color=Red price=8");
		String resp5 = controller.doAction("addFlower bouquet=Birhtday name=Tulip color=Pink price=8");
		
		
		String resp6 = controller.doAction("createBouquet bouquet=Wedding");
		String resp7 = controller.doAction("addCover bouquet=Wedding name=Basket price=23");
		String resp8 = controller.doAction("addFlower bouquet=Wedding name=Aster color=White price=20");
		String resp9 = controller.doAction("addFlower bouquet=Wedding name=Rose color=White price=20");
		String resp10 = controller.doAction("addFlower bouquet=Wedding name=Tulip color=White price=20");
		
		String resp11 = controller.doAction("takeBouquet bouquet=Birhtday");
		String resp12 = controller.doAction("takeBouquet bouquet=Wedding");
		
		System.out.println(resp11);
		System.out.println(resp12);
		

	}

}
