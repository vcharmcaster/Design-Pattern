package com.vk.factory;

public class Main 
{
    public static void main( String[] args )
    {
    	System.out.println(Factory.getShape("Circle").draw());
    	System.out.println(Factory.getShape("Square").draw());
    	System.out.println(Factory.getShape("Triangle").draw());
    }
}
