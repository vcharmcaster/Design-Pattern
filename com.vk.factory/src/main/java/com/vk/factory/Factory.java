package com.vk.factory;

public class Factory {

	public static IShape getShape(String shape)
	{
		if( "Circle".equalsIgnoreCase(shape))
		{
				return new Circle();
		}
		else if("Triangle".equalsIgnoreCase(shape))
		{
			return new Triangle();
		}
		else if("Square".equalsIgnoreCase(shape))
		{
				return new Square();
		}
		else
		{
				throw new RuntimeException("No shape Found");
		}
	}
}
