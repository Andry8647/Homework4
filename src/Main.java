public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Такого не существует");
        }
        System.out.println("Задание 1, Вариант 2");
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такого не существует");

        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2016;
        int clientOS1 = 1;
        if (clientOS1 == 0 && clientDeviceYear >=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS1 == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Такого не существует");
        }
        System.out.println("Задание 3");
        int year = 1999;
        if (year % 4 == 0 && year % 100 != 0 ){
            System.out.println("Год високосный!");
        }else if (year % 400 ==0){
            System.out.println("Год високосный!");
        }else {
            System.out.println("Год не високосный!");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1 );
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2 );
        }else if (deliveryDistance >60 && deliveryDistance <=100 ){
            System.out.println("Потребуется дней: " + 3 );
        }else {
            System.out.println("Мы туда не доставляем(");
        }
        System.out.println("Задание 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}