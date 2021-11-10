package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		/* Equals: compara se os conteudos são iguais*/
		System.out.println("-----------------------------------------");
		System.out.println("Equals:");
		
		String a = "Maria";
		String b = "Alex";
		
		//compara se a é igual a b
		System.out.println(a.equals(b));
		
		/* HashCode: gera dois valores inteiros
		 * Apartir destes dois valores é possivel comparar se um é igual a outro*/
		System.out.println("-----------------------------------------");
		System.out.println("HashCode:");
		
		String c = "Maria";
		String d = "Alex";
		
		//gera um numero inteiro
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		/* Na classe cria os metodos de equals e hashCode para fazer a comparação
		 * Da pra fazer a comparação com os hashCode ou com o conteudo dos objetos */
		System.out.println("-----------------------------------------");
		System.out.println("HashCode e Equals personalizados:");
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());//mostra o codigo hashCode gerado
		System.out.println(c2.hashCode());//mostra o codigo hashCode gerado
		System.out.println(c1.equals(c2));//compara se o conteudo dos objestos são iguais
		System.out.println(c1 == c2);//compara as posições de memoria que são diferentes
		
		//a comparaçao funciona normal apenas analisando o conteudo 
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(s1 == s2);
		
	}

}
