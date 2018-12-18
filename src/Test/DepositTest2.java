package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest2 {

	@Test
	public void testDeposit1() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();
		
		//Test method
		assertEquals(15600, test.Deposit(15000.0 , 4.0, 1),0.1);
	}
}
