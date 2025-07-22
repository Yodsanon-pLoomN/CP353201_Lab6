package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.TVPlan.TVPackage;

class TVPlanTest {
	
	
	TVPlan TV = new TVPlan(true, true, true);
	TVPackage Package = TVPackage.STANDARD;
	
	@Test
	void test() {
		assertEquals(300,TV.pricePerMonth(Package));
	}

}
