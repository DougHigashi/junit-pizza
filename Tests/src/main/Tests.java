package main;

public class Tests {
	
	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		Pizza pizza1 = new Pizza("Frango e Catupiry", 35);
		Pizza pizza2 = new Pizza("Mussarela", 25);
		
		pizza1.adicionarIngredientes("Frango desfiado");
		pizza1.adicionarIngredientes("Catupiry");
		System.out.println("Pizza de Frango: " + pizza1.getIngredientes());
		
		pizza2.adicionarIngredientes("Molho de Tomate");
		pizza2.adicionarIngredientes("Queijo Mussarela");
		pizza2.adicionarIngredientes("Ervilha");
		System.out.println("Pizza de mussarela: " + pizza2.getIngredientes());
		
		pizza2.removerIngrediente("Ervilha");
		System.out.println("Pizza de mussarela: " + pizza2.getIngredientes());
		
		carrinho.adicionarItem(pizza1);
		carrinho.adicionarItem(pizza2);
		System.out.println(carrinho.getTotalPizzas());
		System.out.println(carrinho.getTotalPagar());
		
		System.out.println(pizza2.getNumPizzas());
	}
	
	
	//Ignorar abaixo
	public boolean returnFalse() {
		return false;
	}
	
	public boolean returnTrue() {
		return true;
	}
}
