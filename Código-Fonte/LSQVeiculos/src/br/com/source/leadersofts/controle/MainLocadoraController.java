package br.com.source.leadersofts.controle;

import java.util.ArrayList;
import java.util.List;

import br.com.source.leadersofts.modelo.*;

public class MainLocadoraController {

	public Locadora locadora;	
	public Carro carro;
	List<Carro> carros;
	List<Cliente> clientes;
	
	//Neste método adiciono um veículo à lista de carros, posteriormente separo entre 3 listas de categorias diferentes
	public void populateVeiculos( Carro carro, int idVeiculo, String modelo, String marca,int ano, String cor, String placa,
			int numAssentos, String categoria, int codCategoria, int idLocadora){
		
		carros = locadora.getCarros();
		// Aqui passo configurações do veículo
		carro = new Carro();		
		carro.setIdVeiculo(idVeiculo);
		carro.setModelo(modelo);
		carro.setMarca(marca);
		carro.setAno(ano);
		carro.setCor(cor);
		carro.setPlaca(placa);
		carro.setNumAssentos(numAssentos);
		carro.setCategoria(categoria);
		carro.setCodCategoria(codCategoria);
		carro.setIdLocadora(idLocadora);
		carros.add(carro); // Adiciono o veículo à lista de veículos...
	}
	
	public List<Carro> listaCarros(){
		
		return carros; // recuperando a lista de veículos
	}
			
	public void populateLocadoras(){ 
		
		/*	
		for (Carro comp : carros){			
			 comp.setAno(0);			 			 
			 locadora.getCarrosCompactos().add( comp);
		}
		for (Carro esport : carros){
			esport.setAno(0);
			locadora.getCarrosEsportivos().add(esport);
		}
		for (Carro suv : carros){
			suv.setAno(0);
			locadora.getCarrosSuvs().add(suv);
		}
	*/
		
		int listSize = 0;
		int i = 0;
		//Locadora locadoraVeiculos = new Locadora();
		locadora.setIdLocadora(1);
		locadora.setNomeLocadora("SouthCar");
		locadora.setIdReserva(0);
		
		locadora.setIdLocadora(2);
		locadora.setNomeLocadora("WestCar");
		locadora.setIdReserva(0);
		
		locadora.setIdLocadora(3);
		locadora.setNomeLocadora("NorthCar");
		locadora.setIdReserva(0);
		
		listSize = carros.size();
			
		for ( Carro objCarro : carros ){
			//( (Carro) objCarro).setAno(0);			
			objCarro.setIdVeiculo( carros.get(i).getIdVeiculo() );
			objCarro.setMarca( carros.get(i).getMarca() );
			objCarro.setModelo( carros.get(i).getModelo() );
			objCarro.setCor( carros.get(i).getCor() );
			objCarro.setAno( carros.get(i).getAno() );
			objCarro.setNumAssentos( carros.get(i).getNumAssentos() );
			objCarro.setPlaca( carros.get(i).getPlaca() );
			objCarro.setCategoria( carros.get(i).getCategoria() );
			objCarro.setCodCategoria( carros.get(i).getCodCategoria() );
	
			if( this.carros.get(i).getCodCategoria() == 1 ){
				locadora.getCarrosCompactos().add(objCarro);
			}
			else if(this.carros.get(i).getCodCategoria() == 2) {
				locadora.getCarrosEsportivos().add(objCarro);
			}
			else if(this.carros.get(i).getCodCategoria() == 3) {
				locadora.getCarrosSuvs().add(objCarro);
			}
			i++;
		}
				
	}

	public void populateClientes( Cliente cli, String nome, String cpf, int cartaoFidelidade){
		cli = new Cliente();
		cli.setCfp(cpf);
		cli.setNome(nome);
		cli.setCartaoFidelidade(cartaoFidelidade);
		locadora.getClientes().add(cli );
		clientes.add(cli);
	}
	
	//public static void main ( String[] args ){
	
}
