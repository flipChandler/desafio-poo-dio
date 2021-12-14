package br.com.dio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Conteudo conteudo = new Curso();
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Camila");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("\nConteúdos incritos de Camila: " + dev1.getConteudosInscritos());
		
		dev1.progredir();
		dev1.progredir();
		System.out.println("--------------------------------------------------------------");
		System.out.println("Conteúdos incritos de Camila: " + dev1.getConteudosInscritos());
		System.out.println("XP: " + dev1.calculaTotalXp());
		System.out.println("Conteúdos concluídos de Camila: " + dev1.getConteudosConcluidos() + "\n");
		
		
		Dev dev2 = new Dev();
		dev2.setNome("Felipe");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos de Felipe: " + dev2.getConteudosInscritos());
		
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("--------------------------------------------------------------");
		System.out.println("Conteúdos incritos de Felipe: " + dev2.getConteudosInscritos());
		System.out.println("XP: " + dev2.calculaTotalXp());
		System.out.println("Conteúdos concluídos de Felipe: " + dev2.getConteudosConcluidos());
	}

}
