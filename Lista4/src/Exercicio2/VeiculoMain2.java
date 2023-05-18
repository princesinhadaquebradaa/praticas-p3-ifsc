package Exercicio2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VeiculoMain2 {
	
	public static void main(String[] args) {
		
		Veiculo2 carro = new Veiculo2();
		
		carro.setNome("Fusca");
		String Nome = carro.getNome();
		System.out.println(Nome);
		
		carro.setAno(1788);
		Integer Ano = carro.getAno();
		System.out.println(Ano);
		
		carro.setNumRodas(4);
		Integer NumRodas = carro.getNumRodas();
		System.out.println(NumRodas);
		
		carro.setFabricante("Hakss");
		String Fabricante = carro.getFabricante();
		System.out.println(Fabricante);
		
		carro.setCor("Rosa Pink");
		String Cor = carro.getCor();
		System.out.println(Cor);
		
	    ArrayList<Veiculo2> veiculo = new ArrayList<>();
	    Veiculo2 uno = new Veiculo2();
	    uno.setAno(1596);
	    uno.setNumRodas(4);
	    uno.setFabricante("fiat");
	    uno.setCor("Azul");
	    
	    
	    ArrayList<Veiculo2> aa = new ArrayList<>();
	    
	    Veiculo2 corsa = new Veiculo2();
	    
	    corsa.setAno(1256);
	    corsa.setNumRodas(4);
	    corsa.setFabricante("Onix");
	    corsa.setCor("Amarelo");
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
	}

}
