package ar.edu.unlp.info.oo1.ejercicio13;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class InversionEnPlazoFijo implements Inversion {
	
	private double valorInicial;
	private double interesDiario;
	private LocalDate fecha;
	
	
	
	
	public InversionEnPlazoFijo(double valorInicial, double interesDiario, LocalDate fecha) {
		this.setValorInicial(valorInicial);
		this.setInteresDiario(interesDiario);
		this.setFecha(fecha);
	}
	
	public InversionEnPlazoFijo(double valorInicial, double interesDiario) {
		this.setValorInicial(valorInicial);
		this.setInteresDiario(interesDiario);
		this.setFecha(LocalDate.now());
	}
	public double getValorInicial() {
		return valorInicial;
	}
	public double getInteresDiario() {
		return interesDiario;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	
	private void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	private void setInteresDiario(double interesDiario) {
		this.interesDiario = interesDiario;
	}
	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	private int calcularDistanciaEntreFechas() {
		Period periodo = Period.between(getFecha(), LocalDate.now());
		return periodo.getDays();
	}
	private double calcularInteres() {
		return this.getInteresDiario() * this.calcularDistanciaEntreFechas();
	}
	public double getValorActual() {
		return this.getValorInicial() + this.calcularInteres();
	}
	
	
	
	
  
}
