package br.pro.ramon.oo.alunos.menus;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class ConsultarAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Consultar aluno";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Matrícula: ");
		
		Aluno aluno = dao.pesquisar(matricula);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		}
		else {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("P1..: " + aluno.getP1());
			System.out.println("P2..: " + aluno.getP2());
		}
		
		return false;
	}

}
