package br.com.source.leadersofts.modelo;

import java.util.List;

public class Reserva {
	
	private int numClientes;
	private int idReserva;
	private double taxa;
	private boolean isWeekend;
	private int numDias;
	private List<String> dias;
		
	public int getNumClientes() {
		return numClientes;
	}
	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public boolean isWeekend() {
		return isWeekend;
	}
	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}
	public int getNumDias() {
		return numDias;
	}
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}
	public List<String> getDias() {
		return dias;
	}
	public void setDias(List<String> dias) {
		this.dias = dias;
	}
	
	public void agendarDias(String diaSemana){
		this.dias.add(diaSemana);
	}
	
}
