package br.pro.ramon.oo.alunos.menus;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class ListarAlunosPorMedia extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos (ordem de média)";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return true;
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		double media1 = o1.calcularMedia();
		double media2 = o2.calcularMedia();

		if (media1 < media2) {
			return -1;
		} else if (media1 > media2) {
			return 1;
		} else {
			return super.compare(o1, o2);
		}
	}

}
