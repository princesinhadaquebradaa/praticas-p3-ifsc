package Exercicio1;

public class VeiculoMain {
	
	public static void main(String[] args) {
		
//		Codifique a classe Veiculo acima. 
//		Lembre-se de gerar métodos encapsuladores (getters e setters) para todos os atributos. 
//		Lembre-se: na leitura de diagrama de classes, o “sinal de menos” representa que 
//		o atributo terá modificador de acesso privado (private).

        Veiculo carro = new Veiculo();
        
       carro .setNome("Brasilia");
       String Nome = carro.getNome();
       System.out.println(Nome);
       
       carro.setAno(2002);
       Integer Ano = carro.getAno();
       System.out.println(Ano);
       
       
        
		
	}

}
