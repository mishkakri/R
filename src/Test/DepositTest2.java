package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest2 {

	@Test
	public void testDeposit1() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();
		
		//Test method
		assertEquals(33745.92, test.Deposit(30000.0 , 4.0, 3),0.1);
	}
}
