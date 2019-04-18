package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private float media;
	private List<Aluno> aprovados = new ArrayList<Aluno>();
	private List<Aluno> reprovados = new ArrayList<Aluno>();
	
	public Disciplina(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean aprovado(Avaliacao prova1, Avaliacao prova2, Avaliacao prova3, Avaliacao prova4, Aluno aluno) {
		if (prova1.getDisciplina().getNome() == this.nome && prova1.getAluno()== aluno) {
			if (prova2.getDisciplina().getNome() == this.nome && prova2.getAluno()== aluno) {
				if (prova3.getDisciplina().getNome() == this.nome && prova3.getAluno()== aluno) {
					if (prova4.getDisciplina().getNome() == this.nome && prova4.getAluno()== aluno) {
						this.media = ((prova1.getNota()+prova2.getNota()+prova3.getNota()+prova4.getNota())/4);
						if(this.media >= 6) {
							aprovados.add(aluno);
							return true;
						}
					}
				}
			}
		}
		reprovados.add(aluno);
		return false;
	}
	
	public List alunosAprovados() {
		return this.aprovados;
	}
	
	public List alunosReprovados() {
		return this.reprovados;
	}
}
