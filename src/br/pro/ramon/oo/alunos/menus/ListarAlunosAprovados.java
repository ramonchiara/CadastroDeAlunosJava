package br.pro.ramon.oo.alunos.menus;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class ListarAlunosAprovados extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos aprovados";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return aluno.passou();
	}

}
