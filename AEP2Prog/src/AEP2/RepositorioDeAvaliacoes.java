package AEP2;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAvaliacoes {
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
	public void adicionarAvaliacao (Avaliacao avaliacao) {
		avaliacoes.add(avaliacao);
	}
	
	public List obterAprovados(Disciplina disciplina) {
		return disciplina.alunosAprovados();
	}
	
	
}
