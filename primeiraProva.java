import java.io.PrintStream;
import java.util.Scanner;

public class primeiraProva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double nota1 = 7.0;
       double nota2 = 6.5;
       double media1bimestre = (nota1 + nota2)/2;

       double nota3 = 8.0;
       double nota4 = 8.5;
       double media2bimestre = (nota3 + nota4)/2;

       double media1semestre = (media1bimestre + media2bimestre)/2;

       double nota5 = 6.5;
       double nota6 = 7.5;
       double media3bimestre = (nota5 + nota6)/2;

       double nota7 = 8.5;
       double nota8 = 7.5;
       double media4bimestre = (nota7 + nota8)/2;

       double media2semestre = (media3bimestre + media4bimestre)/2;

       double  mediaFinal = (media1semestre + media2semestre)/2;

        System.out.println("1 bimestre:" + media1bimestre);

        System.out.println("2 bimestre:" + media2bimestre);

        System.out.println("1 semestre:" + media1semestre);

        System.out.println("=====================");

        System.out.println("3 bimestre:" + media3bimestre);

        System.out.println("4 bimestre:" + media4bimestre);

        System.out.println("2 semestre:" + media2semestre);

        System.out.println("=====================");

        System.out.println("Média Final:" + mediaFinal);






    }
}
