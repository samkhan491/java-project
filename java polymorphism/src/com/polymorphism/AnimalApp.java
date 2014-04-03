package com.polymorphism;

public class AnimalApp {

	public static void main(String[] args) 
		{	
	
	 Animal[] animals={
			new Bird(),
			new Fish(),
			new Bird()};
	
	for (Animal a: animals)
	{
	
		a.move();
}
}
}
