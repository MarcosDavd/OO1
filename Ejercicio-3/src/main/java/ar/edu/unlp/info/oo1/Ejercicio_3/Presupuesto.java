package ar.edu.unlp.info.oo1.Ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		// TODO Auto-generated constructor stub
		this.fecha=LocalDate.now();
		items=new ArrayList<>();
		this.cliente=cliente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void agregarItem(Item item) {
		// TODO Auto-generated method stub
		this.items.add(item);
	}
	public double calcularTotal() {
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
	}
	
	
}
