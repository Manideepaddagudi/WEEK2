package com.week1;

import java.util.ArrayList;
import java.util.List;

public abstract class Taco {
	
		 String name;
		 String taco;
		 String sauce;
		 List<String> toppings=new ArrayList<String>();
		
		 void prepare() {
		 System.out.println("preparing"+ name);
		 System.out.println("preparing taco ...");
		 System.out.println("Adding sauce...");
		 System.out.println("Adding toppings: ");
		 for (int i = 0; i < toppings.size(); i++) {
		 System.out.println(" "  + toppings.get(i));
		 }
		 }
		 
		 void preparing() {
		 System.out.println("Preparing Taco");
		 }
		 void loading() 
		 {
		 System.out.println("loading taco with toppings");
		 }
		 
		 void box() {
		 System.out.println("Place taco in official TacoStore box");
		 }
		 public String getName() {
		 return name;
		 }
		}

