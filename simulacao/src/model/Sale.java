package model;

import java.util.ArrayList;
import java.util.Date;


public class Sale {
	private Date data;
	private Date hora;
	ArrayList<String> produtos = new ArrayList<>();


	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double calculaTotal(double value, double quantidade) {
	return value + quantidade;
	}
}

