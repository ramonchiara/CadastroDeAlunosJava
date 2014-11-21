package br.pro.ramon.oo.alunos.menus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public abstract class ListarAlunos extends ItemDeMenu implements Comparator<Aluno> {

	@Override
	public boolean executar() {
		ArrayList<Aluno> alunos = dao.listar();
		
		Collections.sort(alunos, this);

		for (int i = 0; i < alunos.size(); i++) {
			Aluno atual = alunos.get(i);
			
			if (deveImprimir(atual)) {
				System.out.println(atual.getMatricula() + " - " + atual.getNome() + " - " + atual.calcularMedia());
			}
		}

		return false;
	}
	
	public abstract boolean deveImprimir(Aluno aluno);

	@Override
	public int compare(Aluno o1, Aluno o2) {
		String nome1 = o1.getNome();
		String nome2 = o2.getNome();
		
		return nome1.compareTo(nome2);
	}

}
