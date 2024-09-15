package br.com.rogersantos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
	private String nome;
	public List<Integer> notas = new ArrayList<Integer>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void insereNotas() {
		int contador;
		Scanner s = new Scanner(System.in);
		
		for(contador = 0; contador < 4; contador++) {
			System.out.println("Digite a nota " + (contador + 1) + ": ");
		    notas.add(s.nextInt());
		}
		
		System.out.println("Notas registradas.\n");
	}
	
	public int calculaMediaAluno() {
		if(notas.size() < 4) {
			return -1;
		}else {
			int contador, media = 0;
			
			for(contador = 0; contador < 4; contador++) {
				media += notas.get(contador);
			}
			
			media = media / 4;
			
			return media;
		}
	}

	public void verificaAprovacao() {
		int media = calculaMediaAluno();
		
		if(media >= 7) {
			System.out.println("O aluno esta aprovado: " + media);
		}else if(media >= 5 && media < 7) {
			System.out.println("O aluno esta de recuperação: " + media);
		}else if(media >= 0 && media < 5) {
			System.out.println("O aluno esta reprovado: " + media);
		}else {
			System.out.println("O aluno não tem as quatro notas registradas."
					+ "\nPor favor registre todas as notas do aluno!\n");
		}
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}	

}
