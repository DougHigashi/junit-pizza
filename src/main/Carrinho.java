package main;

public class Carrinho {
	
	private float totalPagar = 0;
	
	private int totalPizzas = 0;
	
	public void adicionarItem(Pizza p) {
		float total = getTotalPagar();
		int pizzas = getTotalPizzas();
		pizzas++;
		total += p.getPreco();
		setTotalPizzas(pizzas);
		setTotalPagar(total);
		}

	public float getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(float totalPagar) {
		this.totalPagar = totalPagar;
	}

	public int getTotalPizzas() {
		return totalPizzas;
	}

	public void setTotalPizzas(int totalPizzas) {
		this.totalPizzas = totalPizzas;
	}
}
