import java.util.Scanner;

class questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Entrada da temperatura em Celsius
        System.out.println("36,0°C:");
        double Celsius = input.nextDouble();

        //Conversões
        double fahrenheit = (Celsius * 9/5) + 32;
        double kelvin = Celsius + 273.15;

        //Saída formatada
        System.out.println("Temperatura em Celsius: %.2f°C\n" + Celsius);
        System.out.println("Temperatura em Fahrenheit: %.2f°F\n" + fahrenheit);
        System.out.println("Temperatura em Kelvin: %.2f K\n" + kelvin);

        input.close();
    }
}