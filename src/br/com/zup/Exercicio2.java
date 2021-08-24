package br.com.zup;

public class Exercicio2 {
    public static void main(String[] args) {
    //Adicionando as variáveis
    float nota1 = 7.5F;
    float nota2 = 8;
    float nota3 = 9.3F;
    float nota4 = 8.2F;

    float somaNotas = nota1 + nota2 + nota3 + nota4;
    float media = somaNotas / 4;

    // Resultados da Media
        System.out.println("Suas notas este semestre foram " +nota1 +", " +nota2 +", " +nota3 +" e " + nota4);
        System.out.println("A soma das notas: "+somaNotas);
        System.out.println("Por ende a media do semestre foi: " +media);
    }
}
