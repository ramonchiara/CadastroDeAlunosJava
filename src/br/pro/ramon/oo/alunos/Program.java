package br.pro.ramon.oo.alunos;

import java.util.Scanner;

import br.pro.ramon.oo.alunos.menus.AtualizarAluno;
import br.pro.ramon.oo.alunos.menus.ConsultarAluno;
import br.pro.ramon.oo.alunos.menus.InserirAluno;
import br.pro.ramon.oo.alunos.menus.ItemDeMenu;
import br.pro.ramon.oo.alunos.menus.ListarAlunosAprovados;
import br.pro.ramon.oo.alunos.menus.ListarAlunos;
import br.pro.ramon.oo.alunos.menus.ListarAlunosPorMedia;
import br.pro.ramon.oo.alunos.menus.ListarAlunosPorNome;
import br.pro.ramon.oo.alunos.menus.ListarAlunosReprovados;
import br.pro.ramon.oo.alunos.menus.RemoverAluno;
import br.pro.ramon.oo.alunos.menus.Sair;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		ItemDeMenu[] principal = new ItemDeMenu[] { 
				new InserirAluno(),
				new ListarAlunosPorNome(),
				new ConsultarAluno(),
				new AtualizarAluno(),
				new RemoverAluno(),
				new ListarAlunosAprovados(),
				new ListarAlunosReprovados(),
				new ListarAlunosPorMedia(),
				new Sair() 
		};

		boolean sair = false;
		do {
			for (int i = 0; i < principal.length; i++) {
				System.out.println(i + " - " + principal[i].getDescricao());
			}
			System.out.print("Qual a opção desejada: ");
			int opcao = Integer.parseInt(console.nextLine());

			sair = principal[opcao].executar();
		} while (!sair);
	}

}
