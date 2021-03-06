package org.ebank.web;

import net.sourceforge.jwebunit.junit.WebTestCase;
import net.sourceforge.jwebunit.junit.WebTester;

public class TestJWebUnitDepositStoryUI extends WebTestCase {

	public void setUp() {
		setBaseUrl("http://localhost:9090/ebank-web");
	}
	
	public void testHomePageShouldDisplayReassuringTitle() throws Exception {
		beginAt("/");
		assertTitleEquals("eBank - your money is safe with us!");
		
	}
	
	public void testDepositingCashShouldAddToBalance() {		
		beginAt("/");
		assertTextPresent("Current Balance: $0");
		setTextField("depositAmount","100");
		clickButtonWithText("deposit");
		assertTextPresent("Current Balance: $100");
	}
}
