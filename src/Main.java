public class Main {
    public static void main(String[] args) {

        int cost = 13_686; // переменная для ввода стоимости билета.
        int sale = 20; // кол-во бонусных мил за 1 руб.
        int yourSale = cost / sale;

        System.out.println("Вам начисленно : " + yourSale + " бонусных миль");
    }
}