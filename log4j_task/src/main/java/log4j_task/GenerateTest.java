package log4j_task;

import static org.junit.Assert.*;
import org.junit.Test;

import log4j_task.Generate;

public class GenerateTest {

	@Test
	public void testCla() 
	{
		Generate t= new Generate();
		assertEquals(2400.0,t.cla("StandardMaterial", 2),0);
		Generate t2= new Generate();
		assertEquals(3600.0,t2.cla("HighStandardMaterial", 2),0);
		Generate t3= new Generate();
		assertEquals(3000.0,t3.cla("AboveStandardMaterial", 2),0);
		Generate t4= new Generate();
		assertEquals(5000.0,t4.cla("HighStandardMaterial and FullyAutomated", 2),0);
	}

}
