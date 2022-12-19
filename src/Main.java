public class Main {
    public static void year(int currentYear) {
        if (((currentYear % 4 == 0) && (currentYear % 100 != 0)) || (currentYear % 400 == 0)) {
            System.out.println(currentYear + " это високосный год");
        } else {
            System.out.println(currentYear + " это невисокосный год");
        }
    }
    public static void main(String[] args) {
        year(2023);
    }
}