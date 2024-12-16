import java.text.DecimalFormat;
import java.util.Map;

public class Conversion {



    String generateConversion(int option, double conversionValue){


        ConsultCurrency consult = new ConsultCurrency();


        String baseCurrency = "USD";
        String conversionCurrency = "USD";

        double value = 0;


        switch (option){

            case 1:
                conversionCurrency = "ARS";
                break;

            case 2:
                baseCurrency = "ARS";
                break;

            case 3:
                conversionCurrency = "BRL";
                break;
            case 4:
                baseCurrency = "BRL";
                break;
            case 5:
                conversionCurrency = "COP";
                break;
            case 6:
                baseCurrency = "COP";
                break;
            default:
                System.out.println("No valido");

        }


        Currency currency = consult.searchCurrency(baseCurrency);
        //System.out.println(currency.conversion_rates().get(conversionCurrency));

        value = (conversionValue * currency.conversion_rates().get(conversionCurrency));

        DecimalFormat formato = new DecimalFormat("#.####################");

        String finalValue = formato.format(value);


        System.out.println(finalValue);




        return "El valor " + conversionValue + "[" +baseCurrency
                + "] corresponde al valor final de =>>> " + finalValue
                + "[" + conversionCurrency + "]";

    }













}
