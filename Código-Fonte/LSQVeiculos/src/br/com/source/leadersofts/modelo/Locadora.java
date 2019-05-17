package br.com.source.leadersofts.modelo;

import java.util.List;
import java.util.ArrayList;

public class Locadora {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Carro> carros = new ArrayList<Carro>();
	private Carro carro = new Carro();
	private Cliente cliente = new Cliente();
	private Reserva  reserva = new Reserva();
	
	private List<Carro> carrosCompactos = new ArrayList<Carro>();
	private List<Carro> carrosEsportivos = new ArrayList<Carro>();
	private List<Carro> carrosSuvs = new ArrayList<Carro>();
	
	private int idReserva;
	private int idLocadora;
	private String nomeLocadora;
	private String descricao;
		
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdLocadora() {
		return idLocadora;
	}

	public void setIdLocadora(int idLocadora) {
		this.idLocadora = idLocadora;
	}

	public String getNomeLocadora() {
		return nomeLocadora;
	}

	public void setNomeLocadora(String nomeLocadora) {
		this.nomeLocadora = nomeLocadora;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	public List<Carro> getCarrosCompactos() {
		return carrosCompactos;
	}

	public void setCarrosCompactos(List<Carro> carrosCompactos) {
		this.carrosCompactos = carrosCompactos;
	}

	public List<Carro> getCarrosEsportivos() {
		return carrosEsportivos;
	}

	public void setCarrosEsportivos(List<Carro> carrosEsportivos) {
		this.carrosEsportivos = carrosEsportivos;
	}

	public List<Carro> getCarrosSuvs() {
		return carrosSuvs;
	}

	public void setCarrosSuvs(List<Carro> carrosSuvs) {
		this.carrosSuvs = carrosSuvs;
	}

	public void simulaReserva(Cliente cli){ //Na verdade setar o cliente na classe principal e passar como argumento para a locadora		
				
		if ( cli.getCartaoFidelidade() > 0){
			this.reserva.setTaxa(0);
		}
	}
	
	public void fazReserva(Cliente cli){
		cli = this.cliente;
	}
	
}
