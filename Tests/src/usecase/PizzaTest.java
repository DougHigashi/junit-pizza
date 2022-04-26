package usecase;

import static org.junit.jupiter.api.Assertions.*;

import main.Pizza;
import main.Tests;

class PizzaTest {
	public Tests tests = new Tests();
	Pizza pizza1 = new Pizza("Frango e Catupiry", 35);
	Pizza pizza2 = new Pizza("Mussarela", 25);
	Pizza pizza3 = pizza2;

	@org.junit.jupiter.api.Test
	public void testTrue() {
		assertTrue(pizza1.getPreco() > 10);
	}
	
	@org.junit.jupiter.api.Test
	public void testFalse() {
		assertFalse(pizza1.getPreco() < 10);
	}
	
	@org.junit.jupiter.api.Test
	public void testEqual() {
		assertEquals(pizza3, pizza2);
	}
}
