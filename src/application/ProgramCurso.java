package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProgramCurso {

	public static void main(String[] args) {
		
		/*
		 * Em um portal de cursos online, cada usuário possui um código único, representado por
		 * um número inteiro.
		 * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
		 * matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
		 * é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
		 * alunos repetidos em mais de um curso.
		 * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
		 * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
		 * quantidade total e alunos dele, conforme exemplo.
		 * 
		 * How many students for course A? 3
		 * 21
		 * 35
		 * 22
		 * How many students for course B? 2
		 * 21
		 * 50
		 * How many students for course C? 3
		 * 42
		 * 35
		 * 13
		 * Total students: 6
		 */

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("Quantos estudantes tem para o curso A? ");
		Integer num1 = sc.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			Integer codigo = sc.nextInt();
			a.add(codigo);
		}

		System.out.print("Quantos estudantes tem para o curso B? ");
		Integer num2 = sc.nextInt();
		
		for(int i = 1; i <= num2; i++) {
			Integer codigo = sc.nextInt();
			b.add(codigo);
		}

		System.out.print("Quantos estudantes tem para o curso C? ");
		Integer num3 = sc.nextInt();
		
		for(int i = 1; i <= num3; i++) {
			Integer codigo = sc.nextInt();
			c.add(codigo);
		}
		
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		

		System.out.println("Total de Estudantes: " + total.size());



		sc.close();
	}

}
