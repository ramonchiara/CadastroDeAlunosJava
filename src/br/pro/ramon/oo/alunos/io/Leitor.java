package br.pro.ramon.oo.alunos.io;

import java.util.Scanner;

public class Leitor {
	
	private Scanner console;
	
	public Leitor() {
		console = new Scanner(System.in);
	}
	
	public String lerString(String rotulo) {
		System.out.print(rotulo);
		return console.nextLine();
	}
	
	public double lerDouble(String rotulo) {
		return Double.parseDouble(lerString(rotulo));
	}

}
