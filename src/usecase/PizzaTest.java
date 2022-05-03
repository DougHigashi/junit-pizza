package usecase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Carrinho;
import main.Pizza;

class PizzaTest {
	
	static Pizza pizza1;
	static Pizza pizza2;
	static Carrinho carrinho;
	
	@BeforeAll
	public static void setUp() {
		pizza1 = new Pizza("Frango e Catupiry", 35);
		pizza2 = new Pizza("Mussarela", 25);
		carrinho = new Carrinho();
		carrinho.adicionarItem(pizza1);
		carrinho.adicionarItem(pizza2);
	}
	
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
