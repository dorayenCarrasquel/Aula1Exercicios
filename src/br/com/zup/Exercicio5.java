package br.com.zup;

public class Exercicio5 {
    public static void main(String[] args) {
        //Adicionando as variáveis
        float temperaturaFahrenheit = 78;

        //Calculo da temperatura
        float celsius = (temperaturaFahrenheit-32) / 1.800F;

        //Resultados Usuario
        System.out.println("Convirtiendo " + temperaturaFahrenheit +"° em °Celsius");
        System.out.println("O resultado é: " +celsius);
    }
}
