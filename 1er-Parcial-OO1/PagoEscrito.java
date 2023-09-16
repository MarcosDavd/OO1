package examen;

import java.time.LocalDate;

public abstract class PagoEscrito {
	protected double monto;
	protected String destinatario;
	protected String originante;
	protected LocalDate fechaDeEmision;
	
	public abstract boolean estaVencido();
	public abstract double valorLiquido();
	
	public double getMonto() {
		return this.monto;
	}
	
	public String getOriginante() {
		return this.originante;
	}
	
	public String getDestinatario() {
		return this.destinatario;
	}
}
