package lista6;

public class Animal {
	
	private String Nome;
	private String Raca;
	private Float Comprimento;
	private Integer Num_de_Patas;
	private String Cor;
	private String Ecossistma;
	public void Caminha() {
		System.out.println("Andaa...");
	}
	
	
	public Float getComprimento() {
		return Comprimento;
	}
	public void setComprimento(Float comprimento) {
		Comprimento = comprimento;
	}
	public Integer getNum_de_Patas() {
		return Num_de_Patas;
	}
	public void setNum_de_Patas(Integer num_de_Patas) {
		Num_de_Patas = num_de_Patas;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getEcossistma() {
		return Ecossistma;
	}
	public void setEcossistma(String ecossistma) {
		Ecossistma = ecossistma;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getRaca() {
		return Raca;
	}
	public void setRaca(String raca) {
		Raca = raca;
	}
	
	
	

}
