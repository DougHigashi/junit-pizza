package usecase;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Carrinho;
import main.Pizza;

class CarrinhoTest {
	
	static Pizza pizza1;
	static Pizza pizza2;
	static Carrinho carrinho;
	
	//Iniciando pizzas e carrinho
	@BeforeAll
	public static void carrinhoSetup() {
		pizza1 = new Pizza("Presunto e Queijo", 30);
		pizza2 = new Pizza("Dois Queijos", 30);
		carrinho = new Carrinho();
		carrinho.adicionarItem(pizza1);
		carrinho.adicionarItem(pizza2);
	}
	
	@Test
	public void totalPagarTest() {
		assertEquals(60, carrinho.getTotalPagar());
	}
	
	@Test
	public void totalPizzasTest() {
		assertEquals(2, carrinho.getTotalPizzas());
	}
	
	@Test
	public void failTotalPizzasTest() {
		assertNotEquals(3, carrinho.getTotalPizzas());
	}
}
