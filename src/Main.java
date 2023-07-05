public class Main {
    public static void main(String[] args) {

        int coast = 13_686; // переменная для ввода стоимости билета.
        int sale = 20; // кол-во бонусных мил за 1 руб.
        int your_sale = coast / sale;

        System.out.println("Вам начисленно : " + your_sale + " бонусных миль");
    }
}