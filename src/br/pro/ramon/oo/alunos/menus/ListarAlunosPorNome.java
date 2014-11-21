package br.pro.ramon.oo.alunos.menus;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class ListarAlunosPorNome extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos (ordem alfabética)";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return true;
	}

}
