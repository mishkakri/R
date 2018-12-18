package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class DepositTest {
	@Test
	public void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(30000.0 , 10.0, 1);
		assertEquals(33000, result,0.1);
	}

}
