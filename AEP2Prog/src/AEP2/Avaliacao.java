package AEP2;

public class Avaliacao {
	private float nota;
	private Aluno aluno;
	private Disciplina disciplina;
	
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, float nota) {
		if(nota >= 0 && nota <=10) {
			this.nota = nota;
			this.aluno = aluno;
			this.disciplina = disciplina;
		}else {
			System.out.println("Erro: Nota fora do limite permitido");
		}
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
	public float getNota() {
		return this.nota;
	}
}
