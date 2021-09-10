package com.week1;

public class MXTacoStore extends TacoStore {
	public	Taco  createTaco(String item) {
		if (item.equalsIgnoreCase("cheese")) {
			return new MXStyleCheeseTaco();
		} else if (item.equalsIgnoreCase("Veggie")) {
			return new MXStyleVeggieTaco();
		} else return null;
	}

}
