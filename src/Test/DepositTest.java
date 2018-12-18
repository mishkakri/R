package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest {
	
	@Test
	public void testDeposit() {
		
		//Test class
		DepositCalculator test = new DepositCalculator();

		//Test method
		assertEquals(33000, test.Deposit(30000.0 , 10.0, 1),0.1);
	}

}
