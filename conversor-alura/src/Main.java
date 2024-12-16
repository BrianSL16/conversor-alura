import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Conversion conversion = new Conversion();

        int option = 1;
        double entryValue = 0;

        while(option > 0 && option < 7){



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

            if(option > 0 && option < 7 ){
                System.out.println("Ingrese el valor que desea convertir: ");
                entryValue = scanner.nextDouble();


                System.out.println(conversion.generateConversion(option, entryValue));

            }






        }




        scanner.close();

    }
}