package examen;

import java.time.LocalDate;

public class Pagare extends PagoEscrito {
    private LocalDate fechaDeVencimiento;
    
    public Pagare(double monto, String destinatario, String originante, LocalDate fechaDeEmision, LocalDate fechaDeVencimiento) {
    	this.monto = monto;
    	this.destinatario = destinatario;
    	this.originante = originante;
    	this.fechaDeEmision = fechaDeEmision;
    	this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public boolean estaVencido() {
        return !LocalDate.now().isBefore(this.fechaDeVencimiento);
    }

    public double valorLiquido() {
        return (this.estaVencido())?this.monto:0;
    }
}