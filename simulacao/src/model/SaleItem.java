package model;

import java.util.ArrayList;

public class SaleItem extends ProductDescription {
	

	private int qtd;
	

	public double sumeValor() {
		return qtd * getPreco();
	}
}

