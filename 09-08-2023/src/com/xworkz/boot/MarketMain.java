package com.xworkz.boot;

import com.xworkz.app.KRMarket;
import com.xworkz.app.Market;

public class MarketMain {

	public static void main(String[] args) {
		Market market = new Market();
		market.purchase();
		market.purchase(5.5);
		market.purchase(10);
		market.purchase("POTATO");
		market.purchase("POTATO", 120.6);
		market.purchase("POTATO", 10);

		System.out.println("--------------------------------------------------------------");


		KRMarket market3 = new KRMarket();
		market3.purchase();
		market3.purchase(5.5);
		market3.purchase(10);
		market3.purchase("CARROT");
		market3.purchase("CARROT", 120.6);
		market3.purchase("CARROT", 10);

	}

}
