package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest {
	
	@Test
	public void testDeposit() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();

		//Test method
		assertEquals(24642, test.Deposit(20000.0 , 11.0, 2),0.1);
	}

}
