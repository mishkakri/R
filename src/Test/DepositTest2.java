package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepositTest2 {

	@Test
	public void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(15000.0 , 4.0, 1);
		assertEquals(15600, result,0.1);
	}
}
