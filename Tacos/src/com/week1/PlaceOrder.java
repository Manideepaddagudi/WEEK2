package com.week1;

public class PlaceOrder {
	public static void main(String[] args)  {
		TacoStore mxTacoStore = new MXTacoStore();
		Taco taco=mxTacoStore.orderTaco("cheese");
		System.out.println("The taco is "+ taco.getName());
	}


}
