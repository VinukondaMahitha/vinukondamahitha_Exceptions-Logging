package log4j_task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculating_InterestTest {

	@Test
	public void testSimple_Interest() {
		Calculating_Interest c1=new Calculating_Interest();
		assertEquals(1273.08,c1.Simple_Interest(1236.00,2,1.5),0);
	}

	@Test
	public void testCompound_Interest() {
		Calculating_Interest c2=new Calculating_Interest();
		assertEquals(11409.5790,c2.Compound_Interest(10020.00,2,10,6.5),2);
		
	}

}
