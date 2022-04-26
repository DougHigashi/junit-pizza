package main;

import java.util.ArrayList;

public class Pizza {
	
	private String sabor;
	
	private float preco = 0;
	
	private static int numPizzzas = 0;
	
	private ArrayList<String> ingredientes = new ArrayList<String>();
	
	public Pizza(String sabor, float preco) {
		this.sabor = sabor;
		this.preco = preco;
	}
	
	public int getTotalIngredientes() {
		return ingredientes.size();
	}

	public void adicionarIngredientes(String ingrediente) {
		if(ingredientes.size() > 8) {
			System.out.println("Já tem muito ingrediente");
		} else {
			ingredientes.add(ingrediente);
		}
	}
	
	public void removerIngrediente(String ingrediente) {
		if(ingredientes.contains(ingrediente)) {
			ingredientes.remove(ingrediente);
		}
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getNum_pizzzas() {
		return numPizzzas;
	}

	public void setNumPizzzas(int num) {
		numPizzzas = num;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	
}
