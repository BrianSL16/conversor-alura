import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ConsultCurrency consult = new ConsultCurrency();


       Currency currency = consult.searchCurrency("USD");


       System.out.println(currency);

        Scanner scanner = new Scanner(System.in);



        int option = 1;

        while(option > 0 && option < 6){


            System.out.println("******************************************************");
            System.out.println("   Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("******************************************************");
            System.out.println();
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println();
            System.out.print("Elija una opción válida: ");
            System.out.println("******************************************************");

            option = scanner.nextInt();

            System.out.println("Su opcion es: " + option);


            



        }





        scanner.close();

    }
}