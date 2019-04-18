package AEP2;

public class App {
	
	public static void main(String[] args) {
		RepositorioDeAvaliacoes repositorio = new RepositorioDeAvaliacoes();
		
		Disciplina prog = new Disciplina("Programacao");
		Disciplina banco = new Disciplina("Banco de Dados");
		Disciplina projeto = new Disciplina("Projeto Integrador");
		Disciplina ia = new Disciplina("Inteligencia Artificial");
		Disciplina alg = new Disciplina("Algoritimos");
		
		Aluno aluno1 = new Aluno("Luiz", 123);
		Aluno aluno2 = new Aluno("Lucas", 321);
		Aluno aluno3 = new Aluno("Carlos", 213);
		Aluno aluno4 = new Aluno("Julia", 231);
		Aluno aluno5 = new Aluno("Elo", 456);
		Aluno aluno6 = new Aluno("Vitor", 654);
		Aluno aluno7 = new Aluno("Joao", 546);
		Aluno aluno8 = new Aluno("Pedro", 564);
		Aluno aluno9 = new Aluno("Fernado", 789);
		Aluno aluno10 = new Aluno("Lucia", 987);
		
		
		Avaliacao provaprog1 = new Avaliacao(aluno8,prog,6);
		Avaliacao provaprog2 = new Avaliacao(aluno8,prog,8);
		Avaliacao provaprog3 = new Avaliacao(aluno8,prog,10);
		Avaliacao provaprog4 = new Avaliacao(aluno8,prog,7);
		prog.aprovado(provaprog1, provaprog2, provaprog3, provaprog4, aluno8);
		prog.alunosAprovados();
		
		//Reprovados
		Avaliacao prova1prog = new Avaliacao(aluno1,prog,4);
		Avaliacao prova2prog = new Avaliacao(aluno1,prog,3);
		Avaliacao prova3prog = new Avaliacao(aluno1,prog,2);
		Avaliacao prova4prog = new Avaliacao(aluno1,prog,4);
		
		prog.aprovado(prova1prog, prova2prog, prova3prog, prova4prog, aluno1);
		prog.alunosAprovados();
		
		Avaliacao prova1banco = new Avaliacao(aluno2,banco,4);
		Avaliacao prova2banco = new Avaliacao(aluno2,banco,5);
		Avaliacao prova3banco = new Avaliacao(aluno2,banco,1);
		Avaliacao prova4banco = new Avaliacao(aluno2,banco,4);
		
		Avaliacao prova5banco = new Avaliacao(aluno3,banco,0);
		Avaliacao prova6banco = new Avaliacao(aluno3,banco,3);
		Avaliacao prova7banco = new Avaliacao(aluno3,banco,2);
		Avaliacao prova8banco = new Avaliacao(aluno3,banco,2);
		
		banco.aprovado(prova1banco, prova2banco, prova3banco, prova4banco, aluno2);
		banco.alunosAprovados();
		
		banco.aprovado(prova5banco, prova6banco, prova7banco, prova8banco, aluno3);
		banco.alunosAprovados();
		
		
		
		Avaliacao prova1projeto = new Avaliacao(aluno4,projeto,4);
		Avaliacao prova2projeto = new Avaliacao(aluno4,projeto,5);
		Avaliacao prova3projeto = new Avaliacao(aluno4,projeto,1);
		Avaliacao prova4projeto = new Avaliacao(aluno4,projeto,4);
		
		Avaliacao prova5projeto = new Avaliacao(aluno5,projeto,0);
		Avaliacao prova6projeto = new Avaliacao(aluno5,projeto,3);
		Avaliacao prova7projeto = new Avaliacao(aluno5,projeto,2);
		Avaliacao prova8projeto = new Avaliacao(aluno5,projeto,2);
		
		Avaliacao prova9projeto = new Avaliacao(aluno6,projeto,0);
		Avaliacao prova10projeto = new Avaliacao(aluno6,projeto,3);
		Avaliacao prova11projeto = new Avaliacao(aluno6,projeto,2);
		Avaliacao prova12projeto = new Avaliacao(aluno6,projeto,2);
		
		projeto.aprovado(prova1projeto, prova2projeto, prova3projeto, prova4projeto, aluno4);
		projeto.alunosAprovados();
		
		projeto.aprovado(prova5projeto, prova6projeto, prova7projeto, prova8projeto, aluno5);
		projeto.alunosAprovados();
		
		projeto.aprovado(prova9projeto, prova10projeto, prova11projeto, prova12projeto, aluno6);
		projeto.alunosAprovados();
		
		
		
		
		
		Avaliacao prova1ia = new Avaliacao(aluno7,ia,4);
		Avaliacao prova2ia = new Avaliacao(aluno7,ia,5);
		Avaliacao prova3ia = new Avaliacao(aluno7,ia,1);
		Avaliacao prova4ia = new Avaliacao(aluno7,ia,4);
		
		Avaliacao prova5ia = new Avaliacao(aluno8,ia,0);
		Avaliacao prova6ia = new Avaliacao(aluno8,ia,3);
		Avaliacao prova7ia = new Avaliacao(aluno8,ia,2);
		Avaliacao prova8ia = new Avaliacao(aluno8,ia,2);
		
		Avaliacao prova9ia = new Avaliacao(aluno9,ia,0);
		Avaliacao prova10ia = new Avaliacao(aluno9,ia,3);
		Avaliacao prova11ia = new Avaliacao(aluno9,ia,2);
		Avaliacao prova12ia = new Avaliacao(aluno9,ia,2);
		
		Avaliacao prova13ia = new Avaliacao(aluno10,ia,0);
		Avaliacao prova14ia = new Avaliacao(aluno10,ia,3);
		Avaliacao prova15ia = new Avaliacao(aluno10,ia,2);
		Avaliacao prova16ia = new Avaliacao(aluno10,ia,2);
		
		ia.aprovado(prova1ia, prova2ia, prova3ia, prova4ia, aluno7);
		ia.alunosAprovados();
		
		ia.aprovado(prova5ia, prova6ia, prova7ia, prova8ia, aluno8);
		ia.alunosAprovados();
		
		ia.aprovado(prova9ia, prova10ia, prova11ia, prova12ia, aluno9);
		ia.alunosAprovados();
		
		ia.aprovado(prova13ia, prova14ia, prova15ia, prova16ia, aluno10);
		ia.alunosAprovados();
		
		
		
		
		Avaliacao prova1alg = new Avaliacao(aluno7,alg,4);
		Avaliacao prova2alg = new Avaliacao(aluno7,alg,5);
		Avaliacao prova3alg = new Avaliacao(aluno7,alg,1);
		Avaliacao prova4alg = new Avaliacao(aluno7,alg,4);
		
		Avaliacao prova5alg = new Avaliacao(aluno8,alg,0);
		Avaliacao prova6alg = new Avaliacao(aluno8,alg,3);
		Avaliacao prova7alg = new Avaliacao(aluno8,alg,2);
		Avaliacao prova8alg = new Avaliacao(aluno8,alg,2);
		
		Avaliacao prova9alg = new Avaliacao(aluno9,alg,0);
		Avaliacao prova10alg = new Avaliacao(aluno9,alg,3);
		Avaliacao prova11alg = new Avaliacao(aluno9,alg,2);
		Avaliacao prova12alg = new Avaliacao(aluno9,alg,2);
		
		Avaliacao prova13alg = new Avaliacao(aluno10,alg,0);
		Avaliacao prova14alg = new Avaliacao(aluno10,alg,3);
		Avaliacao prova15alg = new Avaliacao(aluno10,alg,2);
		Avaliacao prova16alg = new Avaliacao(aluno10,alg,2);
		
		Avaliacao prova17alg = new Avaliacao(aluno10,alg,0);
		Avaliacao prova18alg = new Avaliacao(aluno10,alg,3);
		Avaliacao prova19alg = new Avaliacao(aluno10,alg,2);
		Avaliacao prova20alg = new Avaliacao(aluno10,alg,2);
		
		ia.aprovado(prova1alg, prova2alg, prova3alg, prova4alg, aluno7);
		ia.alunosAprovados();
		
		ia.aprovado(prova5alg, prova6alg, prova7alg, prova8alg, aluno8);
		ia.alunosAprovados();
		
		ia.aprovado(prova9alg, prova10alg, prova11alg, prova12alg, aluno9);
		ia.alunosAprovados();
		
		ia.aprovado(prova13alg, prova14alg, prova15alg, prova16alg, aluno10);
		ia.alunosAprovados();
		
		ia.aprovado(prova17alg, prova18alg, prova19alg, prova20alg, aluno1);
		ia.alunosAprovados();
		
		
		repositorio.adicionarAvaliacao(provaprog1);
		repositorio.adicionarAvaliacao(provaprog2);
		repositorio.adicionarAvaliacao(provaprog3);
		repositorio.adicionarAvaliacao(provaprog4);
		
		repositorio.adicionarAvaliacao(prova1prog);
		repositorio.adicionarAvaliacao(prova2prog);
		repositorio.adicionarAvaliacao(prova3prog);
		repositorio.adicionarAvaliacao(prova4prog);
		
		repositorio.adicionarAvaliacao(prova1banco);
		repositorio.adicionarAvaliacao(prova2banco);
		repositorio.adicionarAvaliacao(prova3banco);
		repositorio.adicionarAvaliacao(prova4banco);
		repositorio.adicionarAvaliacao(prova5banco);
		repositorio.adicionarAvaliacao(prova6banco);
		repositorio.adicionarAvaliacao(prova7banco);
		repositorio.adicionarAvaliacao(prova8banco);
		
		repositorio.adicionarAvaliacao(prova1projeto);
		repositorio.adicionarAvaliacao(prova2projeto);
		repositorio.adicionarAvaliacao(prova3projeto);
		repositorio.adicionarAvaliacao(prova4projeto);
		repositorio.adicionarAvaliacao(prova5projeto);
		repositorio.adicionarAvaliacao(prova6projeto);
		repositorio.adicionarAvaliacao(prova7projeto);
		repositorio.adicionarAvaliacao(prova8projeto);
		repositorio.adicionarAvaliacao(prova9projeto);
		repositorio.adicionarAvaliacao(prova10projeto);
		repositorio.adicionarAvaliacao(prova11projeto);
		repositorio.adicionarAvaliacao(prova12projeto);
		
		repositorio.adicionarAvaliacao(prova1ia);
		repositorio.adicionarAvaliacao(prova2ia);
		repositorio.adicionarAvaliacao(prova3ia);
		repositorio.adicionarAvaliacao(prova4ia);
		repositorio.adicionarAvaliacao(prova5ia);
		repositorio.adicionarAvaliacao(prova6ia);
		repositorio.adicionarAvaliacao(prova7ia);
		repositorio.adicionarAvaliacao(prova8ia);
		repositorio.adicionarAvaliacao(prova9ia);
		repositorio.adicionarAvaliacao(prova10ia);
		repositorio.adicionarAvaliacao(prova11ia);
		repositorio.adicionarAvaliacao(prova12ia);
		repositorio.adicionarAvaliacao(prova13ia);
		repositorio.adicionarAvaliacao(prova14ia);
		repositorio.adicionarAvaliacao(prova15ia);
		repositorio.adicionarAvaliacao(prova16ia);
		
		repositorio.adicionarAvaliacao(prova1alg);
		repositorio.adicionarAvaliacao(prova2alg);
		repositorio.adicionarAvaliacao(prova3alg);
		repositorio.adicionarAvaliacao(prova4alg);
		repositorio.adicionarAvaliacao(prova5alg);
		repositorio.adicionarAvaliacao(prova6alg);
		repositorio.adicionarAvaliacao(prova7alg);
		repositorio.adicionarAvaliacao(prova8alg);
		repositorio.adicionarAvaliacao(prova9alg);
		repositorio.adicionarAvaliacao(prova10alg);
		repositorio.adicionarAvaliacao(prova11alg);
		repositorio.adicionarAvaliacao(prova12alg);
		repositorio.adicionarAvaliacao(prova13alg);
		repositorio.adicionarAvaliacao(prova14alg);
		repositorio.adicionarAvaliacao(prova15alg);
		repositorio.adicionarAvaliacao(prova16alg);
		repositorio.adicionarAvaliacao(prova17alg);
		repositorio.adicionarAvaliacao(prova18alg);
		repositorio.adicionarAvaliacao(prova19alg);
		repositorio.adicionarAvaliacao(prova20alg);
		
		
	}
}
