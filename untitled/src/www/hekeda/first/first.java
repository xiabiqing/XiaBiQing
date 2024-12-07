package www.hekeda.first;

public class first {
    public static void main(String[] args) {


        String price="票价为";
        double price1=calculate(1000.0,5,"头等舱");
        System.out.println(price+price1);
    }




public static double calculate(double price,int month,String type) {
    if (month >= 4 && month <= 10) {
        switch (type) {

            case ("头等舱"):
                price *= 0.9;
                break;

            case ("经济舱"):
                price *= 0.8;
                break;



        }
    } else {
        switch (type) {

            case ("头等舱"):
                price *= 0.7;
                break;

            case ("经济舱"):
                price *= 0.6;
                break;


        }
    }
    return price;
}}





