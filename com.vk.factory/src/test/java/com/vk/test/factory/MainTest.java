package com.vk.test.factory;

import com.vk.factory.Factory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class MainTest 
    extends TestCase
{
	
    public MainTest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite(MainTest.class );
    }

    
    public void testCircleShape()
    {
        assertEquals("Circle", Factory.getShape("Circle").draw());
    }

    public void testSquareShape()
    {
        assertEquals("Square", Factory.getShape("Square").draw());
    }

    public void testTriangleShape()
    {
        assertEquals("Triangle", Factory.getShape("Triangle").draw());
    }

}
