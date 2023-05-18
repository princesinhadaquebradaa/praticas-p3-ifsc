package Exercicio11;

public class PessoaMain {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.Nome = "Vitoria";
		p.BDay = "13/01/2006";
		p.CPF = 8888884414l;
		System.out.println("A pessoa " + p.Nome + " faz tem seu BDay no dia" + p.BDay + " e possui o CPF" + p.CPF);
		
		p.Nome = "Carlise";
		p.BDay = "04/12/1890";
		p.CPF = 1234567l;
		System.out.println("A pessoa " + p.Nome + " faz tem seu BDay no dia" + p.BDay + " e possui o CPF" + p.CPF);

		p.Nome = "Pedro";
		p.BDay = "31/03/2008";
		p.CPF = 55968l;
		System.out.println("A pessoa " + p.Nome + " faz tem seu BDay no dia" + p.BDay + " e possui o CPF" + p.CPF);
		

		
		
		
		
		
		
	}

}
