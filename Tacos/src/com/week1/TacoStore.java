package com.week1;

public abstract class TacoStore {
	SimpleTacoFactory simpletacofactory;

	
	public TacoStore() {
	}
	
	public TacoStore(SimpleTacoFactory simpletacofactory) {

		this.simpletacofactory = simpletacofactory;

	}

	public Taco orderTaco(String type) 
	{
		Taco taco;
		taco = createTaco(type);
		taco.prepare();
		taco.loading();
		taco.box();
		return taco;
	}

	protected abstract Taco createTaco(String type);
}
