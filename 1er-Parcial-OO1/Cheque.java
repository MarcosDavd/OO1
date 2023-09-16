package examen;

import java.time.LocalDate;

public class Cheque{
    public Cheque(double monto, String destinatario, String originante, LocalDate fechaDeEmision) {
    	this.monto = monto;
    	this.destinatario = destinatario;
    	this.originante = originante;
    	this.fechaDeEmision = fechaDeEmision;
    }
    
    public boolean estaVencido() {
        return !LocalDate.now().isBefore(this.fechaDeEmision.plusDays(30));
    }

    public double valorLiquido() {
        return (!this.estaVencido())?this.monto:0;
    }
}