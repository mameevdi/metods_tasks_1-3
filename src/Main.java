public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        year(2000);
        System.out.println("Задача 2");
        inputParameters(0, 2023);
        printCountDays(19);
    }
    public static void year(int currentYear) { //Задача 1
        //метод получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль
        if (((currentYear % 4 == 0) && (currentYear % 100 != 0)) || (currentYear % 400 == 0)) {
            System.out.println(currentYear + " это високосный год");
        } else {
            System.out.println(currentYear + " это невисокосный год");
        }
        System.out.println();
    }
    public static void inputParameters( int clientOS, int clientDeviceYear) { //Задача 2
        // напишите метод, куда подаются два параметра: тип операционной системы (0— iOS, 1— Android) и год выпуска устройства.
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке https://apps.apple.com/ru/app/skypro-онлайн-университет/id1568515479");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке https://play.google.com/store/apps/details?id=skyeng.words.prod&hl=ru&gl=US");
        }
        if (clientDeviceYear >= 2015 && clientDeviceYear < 2022) {
            System.out.println("Установите приложение");
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();
    }
    public static int calculateDeliveryDays(int  deliveryDistance) { //Задача 3
        System.out.println("Задача 3");
        if ( deliveryDistance < 20) {
            return 1;
        } else if ( deliveryDistance <= 60) {
            return 2;
        } else if ( deliveryDistance <= 100) {
            return 3;
        } else if ( deliveryDistance <= 100) {
            return 4;
        } else {
            return 0;
        }
    }
    public static void printCountDays(int  deliveryDistance){
        if (deliveryDistance > 100){
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            System.out.println("Для доставки на расстояние " +deliveryDistance+ " км потребуется дней: " + calculateDeliveryDays(deliveryDistance));
        }

    }
}
