package usecase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Pizza;
import main.Tests;

class PizzaTest {
	public Tests tests = new Tests();
	Pizza pizza1 = new Pizza("Frango e Catupiry", 35);
	Pizza pizza2 = new Pizza("Mussarela", 25);
	
	@Test
	public void testTrue() {
		assertTrue(pizza1.getPreco() > 10);
	}
	
	@Test
	public void testFalse() {
		assertFalse(pizza1.getPreco() < 10);
	}
	
	@Test
	public void testEqual() {
		assertNotEquals(pizza1, pizza2);
	}
	
	@Test
	public void testPizzaQuantity() {
		System.out.println(pizza2.getNumPizzas());
		assertTrue(pizza2.getNumPizzas()>1);
	}
}
