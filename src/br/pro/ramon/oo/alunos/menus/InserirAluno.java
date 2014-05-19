package br.pro.ramon.oo.alunos.menus;

import java.util.Scanner;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class InserirAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Inserir aluno";
	}

	@Override
	public boolean executar() {
		Scanner console = new Scanner(System.in);

		System.out.print("Matrícula: ");
		String matricula = console.nextLine();

		System.out.print("Nome: ");
		String nome = console.nextLine();

		System.out.print("P1: ");
		double p1 = Double.parseDouble(console.nextLine());

		System.out.print("P2: ");
		double p2 = Double.parseDouble(console.nextLine());

		Aluno aluno = new Aluno(matricula, nome);
		aluno.setP1(p1);
		aluno.setP2(p2);

		dao.inserir(aluno);

		System.out.println("Aluno cadastrado com sucesso!");

		return false;
	}

}
