package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void TestTotalAmountSaved() {
		Retirement a = new Retirement(40,0.07,20,0.02,10000.0,2642.0);
		assertEquals(a.TotalAmountSaved(),1454485.55,0.01);
	}
	
	@Test
	public void TestAmountToSave() {
		Retirement a = new Retirement(40,0.07,20,0.02,10000.0,2642.0);
		assertEquals(Math.abs(a.AmountToSave()),554.13,0.01);
	}

}
