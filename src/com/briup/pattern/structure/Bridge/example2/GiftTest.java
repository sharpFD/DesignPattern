package com.briup.pattern.structure.Bridge.example2;

public class GiftTest {
	public static void main(String[] args) {
		Gift g1 = new Flower(new Red());
		g1.show();
		
		Gift g2 = new Ring(new Blue());
		g2.show();
	}
}
