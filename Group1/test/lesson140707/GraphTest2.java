package lesson140707;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GraphTest2 {

	static {
		System.out.println("static init");
	}
	
	{
		System.out.println("instance init");
	}

	public GraphTest2() {
		System.out.println("constructor");
	}
	
	Graph g;
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("setupClass (BeforeClass)");
	}
	

	@AfterClass
	public static void tearDownClass() {
		System.out.println("tearDownClass (AfterClass)");
	}
	
	@Before
	public void setup() {
		System.out.println("setup (before");
	}
	
	
	@Test
	public void test1() throws Exception {
		System.out.println("test1");
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("test2");
		test1(); // bad practice !!! don't do it!
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown (after)");
	}

}
