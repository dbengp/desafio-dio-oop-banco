
public class Cliente {

	private String nome;
	private int score;

	Cliente(String nome){
		this.nome = nome;
	}

	Cliente(String nome, int score){
		this.nome = nome;
		this.score = score;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.nome = score;
	}

}