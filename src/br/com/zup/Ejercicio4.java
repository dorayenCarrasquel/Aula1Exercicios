package br.com.zup;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Adicionando as variáveis
        int horasTrabalhadas = 40;
        float valorHora = 10.5F;

        //Operação
        float salarioBruto = valorHora * horasTrabalhadas;

        //Resultados para o usuário
        System.out.println("Foram " + horasTrabalhadas +"hras trabalhadas durante este mês e você recebe R$" +valorHora);
        System.out.println("O salario deste mês é: R$" +salarioBruto);
    }
}
