import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.time.LocalDateTime;

public class Hello {
    public static void main(String[] args) {

      }
}

/*
        String name = "Matheus";
        int nota = 2;

        if (nota > 5){
            System.out.println("Aprovado");
        } else if (nota < 3){
            System.out.println("Reprovado");
        } else {
            System.out.println("Em recuperação");
        }

        System.out.println("Hello World");
        System.out.println("Hello " + name);
 */

/*
 String nome = "Matheus";
        String outroNome = "matheus";

        System.out.println(nome.equalsIgnoreCase(outroNome));
 */

/*
// Olá (nome). Hoje é (dia da semana), Bom dia/Boa tarde/Boa noite.

        String nome = "Matheus";

        // ISO 8601
        LocalDate hoje = LocalDate.now();

        Locale brasil = new Locale("pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        int horas = agora.getHour();

        if (horas > 0 && horas < 12){
           saudacao = "Bom dia!";
        } else if (horas > 12 && horas < 18){
            saudacao = "Boa tarde!";
        } else {
            saudacao = "Boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

 */

/*
 int soma = 0;

        for (int i = 0; i <= 10; i++ ){
            for (int x = 0; x <= 10; x++){
                System.out.println( i + " x " + x + " = " + x * i);
            }
        }
 */

/*

       //Array de Números

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Array de Letras
        String[] letras = new String[5];

        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        //Outra forma de arrays
        String[] letras2 = {"A", "B", "C", "D"};
        for (int i = 0; i<letras2.length; i++){
            System.out.println(letras2[i]);
        }
        System.out.println(Arrays.toString((letras2)));
 */
