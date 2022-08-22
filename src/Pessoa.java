public class Pessoa {

	private String nome;
	private int idade;
	private String tipo;		
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getTipo() {
		return tipo;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		verificarTipo();
		}
	
	public void verificarTipo() {
        	if (idade >= 0 && idade <= 12) {
        		this.tipo = "Criança";
        	} else if (idade > 12 && idade <= 19) {
        		this.tipo = "Adolescente";
        	} else if (idade >= 20 && idade <= 65) {
        		this.tipo = "Adulto";
        	} else if (idade > 65) {
        		this.tipo = "Idoso";
        	}
	}
		
	@Override
	public String toString() {
		return "[Nome: " + nome + ", Idade: " + idade + ", Tipo: " + tipo + "]";
	}		
}
