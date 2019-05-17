package br.com.source.leadersofts.visao;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import br.com.source.leadersofts.controle.*;
import br.com.source.leadersofts.modelo.*;

public class MainLocadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int cat = 0; // Variável de controle uusada para o arquivo txt
		
		/*Variáveis que serão passadas como parâmetro para settar o veículo na classe MainLocadora do pacote controller*/
		String modelo = "", marca = "", categoria="",placa="", cor="";
		int idVeiculo = 0, ano = 0, numAssentos = 0, codCategoria = 0, idLocadora = 0;
		
		/*Variáveis que serão passadas como parâmetro para settar o cliente na classe MainLocadora do pacote controller*/
		String nome="", cpf="";
		int cartaoFidelidade=0;
				
		MainLocadoraController controller = new MainLocadoraController();
		Carro carro = new Carro();
		Cliente cliente = new Cliente();
		
		/*Aqui crio os clientes manualmente, não disponho de uma GUI ou Servlet+JSP ou um JSF no momento*/		
		nome = "Leandro Souza Quintiliano"; 
		cpf = "012.345.678-90";	
		cartaoFidelidade = 1353;		
		controller.populateClientes(cliente, nome, cpf, cartaoFidelidade);
		
		nome = "Valentina Scheffer";
		cpf = "090.544.373.-74";
		cartaoFidelidade = 1277;
		
		controller.populateClientes(cliente, nome, cpf, cartaoFidelidade);		
		//*-----------------------------------------------------------------------------------------
		// Criando os veículos manualmente em um Array
	
		idVeiculo = 1;
		marca = "Volkswagen";
		modelo = "Up";
		ano = 2016;
		cor = "branca";
		placa = "GZA-0101";
		numAssentos = 4;
		categoria = "compacto";
		codCategoria = 1;
		idLocadora = 1;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 2;
		marca = "Renault";
		modelo = "Kwid";
		ano = 2012;
		cor = "Preta";
		placa = "GZA-0102";
		numAssentos = 4;
		categoria = "compacto";
		codCategoria = 1;
		idLocadora = 1;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 3;
		marca = "Fiat";
		modelo = "Mobi";
		ano = 2015;
		cor = "Branco";
		placa = "GZA-0103";
		numAssentos = 4;
		categoria = "compacto";
		codCategoria = 1;
		idLocadora = 1;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 4;
		marca = "Ford";
		modelo = "Ka";
		ano = 2009;
		cor = "verde";
		placa = "GZA-0104";
		numAssentos = 4;
		categoria = "compacto";
		codCategoria = 1;
		idLocadora = 1;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 5;
		marca = "Cherry";
		modelo = "New QQ";
		ano = 2015;
		cor = "";
		placa = "GZA-0105";
		numAssentos = 4;
		categoria = "compacto";
		codCategoria = 1;
		idLocadora = 1;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 6;
		marca = "Fiat";
		modelo = "500";
		ano = 2013;
		cor = "vermelha";
		placa = "GZA-0106";
		numAssentos = 2;
		categoria = "compacto";
		codCategoria = 1;
		idLocadora = 1;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
	/*######################################################################*/	
	// CARROS ESPORTIVOS 	
		idVeiculo = 7;
		marca = "Ford";
		modelo = "Mustang";
		ano = 2014;
		cor = "laranja";
		placa = "HMT-0101";
		numAssentos = 2;
		categoria = "esportivo";
		codCategoria = 2;
		idLocadora = 2;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 8;
		marca = "Porsche";
		modelo = "911";
		ano = 2017;
		cor = "preta";
		placa = "HMT-0102";
		numAssentos = 2;
		categoria = "esportivo";
		codCategoria = 2;
		idLocadora = 2;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 9;
		marca = "BMW";
		modelo = "M2";
		ano = 2013;
		cor = "preta";
		placa = "HMT-0103";
		numAssentos = 2;
		categoria = "esportivo";
		codCategoria = 2;
		idLocadora = 2;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 10;
		marca = "Chevrollet";
		modelo = "Corvette";
		ano = 2019;
		cor = "amarela";
		placa = "HMT-0104";
		numAssentos = 2;
		categoria = "esportivo";
		codCategoria = 2;
		idLocadora = 2;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 11;
		marca = "Ferrari";
		modelo = "F430";
		ano = 2015;
		cor = "amarela";
		placa = "HMT-0105";
		numAssentos = 2;
		categoria = "esportivo";
		codCategoria = 2;
		idLocadora = 2;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 12;
		marca = "Hyundai";
		modelo = "Veloster";
		ano = 2015;
		cor = "vermelha";
		placa = "HMT-0106";
		numAssentos = 2;
		categoria = "esportivo";
		codCategoria = 2;
		idLocadora = 2;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		/*######################################################################*/
		
		idVeiculo = 13;
		marca = "Lincoln";
		modelo = "Navigator";
		ano = 2016;
		cor = "prata";
		placa = "SUV-0101";
		numAssentos = 7;
		categoria = "suv";
		codCategoria = 3;
		idLocadora = 3;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 14;
		marca = "Jeep";
		modelo = "Compass";
		ano = 2017;
		cor = "amarela";
		placa = "SUV-0102";
		numAssentos = 6;
		categoria = "suv";
		codCategoria = 3;
		idLocadora = 3;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 15;
		marca = "Hyundai";
		modelo = "Creta";
		ano = 2013;
		cor = "azul";
		placa = "SUV-0103";
		numAssentos = 7;
		categoria = "suv";
		codCategoria = 3;
		idLocadora = 3;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 16;
		marca = "Honda";
		modelo = "HR-V";
		ano = 2015;
		cor = "cinza";
		placa = "SUV-0104";
		numAssentos = 5;
		categoria = "suv";
		codCategoria = 3;
		idLocadora = 3;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 17;
		marca = "Nissan";
		modelo = "Kicks";
		ano = 2012;
		cor = "verde chumbo";
		placa = "SUV-0105";
		numAssentos = 6;
		categoria = "suv";
		codCategoria = 3;
		idLocadora = 3;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		
		idVeiculo = 18;
		marca = "Hyundai";
		modelo = "Creta";
		ano = 2010;
		cor = "azul";
		placa = "SUV-0106";
		numAssentos = 4;
		categoria = "suv";
		codCategoria = 3;
		idLocadora = 3;
		
		controller.populateVeiculos(carro, idVeiculo, modelo, marca, ano, cor, placa,numAssentos, categoria, codCategoria,idLocadora);
		/* ====================================================================================== */
		
		javax.swing.JOptionPane.showMessageDialog(null, "Olá, vamos começar a interação.");
		System.out.println("Qual é seu nome ? ");
        String nomeUsuario = scan.next();	
        
        System.out.println("Olá "+nomeUsuario+", Seja Bem-vindo à LSQVeículos. \n Primeiramente "
        	+ "escolha a categoria de veículos desejada. ");
        
        System.out.println("1. Carros compactos com até 4 lugares \n2. Carros esportivos para até 2 lugares "
        	+ "3. Carros Suvs para até 7 lugares! ");
        
        System.out.println("Passo 1 _ _ _ Criando diretório de armazenamento do arquivo de texto:\n");       
        File filePath = new File("C:\\Leadersofts\\Quintiliano\\");
        filePath.mkdir();
        
        FileReader leitor; //Instanciando variáveis para manipular o arquivo...
        BufferedReader lerArq; 
        String linha = "";
        
        try{     	
        	leitor = new FileReader(filePath+"arquivoscan.txt"); //Inacializando as variáveis
            lerArq = new BufferedReader(leitor);
        	
            if ( filePath.exists() ){ // Sê o diretório existir lê o arquivo no diretório criado
        		linha += lerArq.readLine();
        		while(linha != null){
        			linha = lerArq.readLine();
        		}
        	}
            else{  // Senão lê o arquivo local
            	leitor = new FileReader("arquivoscan.txt"); 
                lerArq = new BufferedReader(leitor);
        		linha += lerArq.readLine();
        		while(linha != null){
        			linha = lerArq.readLine();
        		}
            }
            
        	leitor.close();
        }catch(IOException ex){
        	System.out.println("Erro ao tentar abrir o arquivo. Ocorreu o seguinte erro: " + ex.getMessage() );
        	ex.fillInStackTrace();      
        }finally{
        	System.out.println("Passo 2 _ _ _ _ _ escolha de carros por categoria");
        }
        
        cat = Integer.parseInt( linha.substring(23,25) ); //Lê as duas casas decimais  do meu número informado para categoria
        
        System.out.println("Passo 3 _ _ _ _ _ exibindos os veículos");
        
	     if(cat == 1){
	    	 int carrosCompactos = controller.locadora.getCarrosCompactos().size();
	    	 System.out.println("Carros disponíveis: ");
	    	 for (int i = 0; i < carrosCompactos; i++){
	    		 System.out.println("\n" + controller.locadora.getCarrosCompactos().get(i).getIdVeiculo() + 
	    			"Marca: " + controller.locadora.getCarrosCompactos().get(i).getMarca() +
	    			"Modelo: " + controller.locadora.getCarrosCompactos().get(i).getModelo() +
	    			"Ano: " + controller.locadora.getCarrosCompactos().get(i).getAno() +
	    			"Cor: "+ controller.locadora.getCarrosCompactos().get(i).getCor() + 
	    			"Categoria: " + controller.locadora.getCarrosCompactos().get(i).getCategoria() + 
	    			"Nro Assentos: " + controller.locadora.getCarrosCompactos().get(i).getNumAssentos() + 
	    			"Placa: " + controller.locadora.getCarrosCompactos().get(i).getPlaca() 
	    		 );  	    		 
	    	 }
	    	 
	     }else if(cat == 2){
	    	 int carrosEsportivos = controller.locadora.getCarrosEsportivos().size();
	    	 System.out.println("Carros disponíveis: ");
	    	 for (int i = 0; i < carrosEsportivos; i++){
	    		 System.out.println("\n" + controller.locadora.getCarrosEsportivos().get(i).getIdVeiculo() + 
	    			"Marca: " + controller.locadora.getCarrosEsportivos().get(i).getMarca() +
	    			"Modelo: " + controller.locadora.getCarrosEsportivos().get(i).getModelo() +
	    			"Ano: " + controller.locadora.getCarrosEsportivos().get(i).getAno() +
	    			"Cor: "+ controller.locadora.getCarrosEsportivos().get(i).getCor() + 
	    			"Categoria: " + controller.locadora.getCarrosEsportivos().get(i).getCategoria() + 
	    			"Nro Assentos: " + controller.locadora.getCarrosEsportivos().get(i).getNumAssentos() + 
	    			"Placa: " + controller.locadora.getCarrosEsportivos().get(i).getPlaca() 
	    		 );
	    	 }
	     }else if(cat == 3){
	    	 int carrosSuv = controller.locadora.getCarrosEsportivos().size();
	    	 System.out.println("Carros disponíveis: ");
	    	 for (int i = 0; i < carrosSuv; i++){
	    		 System.out.println("\n" + controller.locadora.getCarrosSuvs().get(i).getIdVeiculo() + 
	    			"Marca: " + controller.locadora.getCarrosSuvs().get(i).getMarca() +
	    			"Modelo: " + controller.locadora.getCarrosSuvs().get(i).getModelo() +
	    			"Ano: " + controller.locadora.getCarrosSuvs().get(i).getAno() +
	    			"Cor: "+ controller.locadora.getCarrosSuvs().get(i).getCor() + 
	    			"Categoria: " + controller.locadora.getCarrosSuvs().get(i).getCategoria() + 
	    			"Nro Assentos: " + controller.locadora.getCarrosSuvs().get(i).getNumAssentos() + 
	    			"Placa: " + controller.locadora.getCarrosSuvs().get(i).getPlaca() 
	    		 );
	    	 }
	     }else{
	    	 System.out.println("Opção inválida");
	    	 System.exit(0);    	  
	     }	          
				
	}
		

}
