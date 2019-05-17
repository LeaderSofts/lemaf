package br.com.source.leadersofts.modelo;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	private int idVeiculo;
	private int numAssentos;
	private String categoria;
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	private String placa;
	private int codCategoria;
	private int idLocadora;
		
	public int getIdLocadora() {
		return idLocadora;
	}
	public void setIdLocadora(int idLocadora) {
		this.idLocadora = idLocadora;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public int getNumAssentos() {
		return numAssentos;
	}
	public void setNumAssentos(int numAssentos) {
		this.numAssentos = numAssentos;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	
}