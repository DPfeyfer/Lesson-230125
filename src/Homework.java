public class Homework {

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " not leap year");
        }
    }

    public static void main(String[] args) {
//        task 1
        System.out.println("Task 1");
        int year = 2021;
        checkYear(year);

        System.out.println();
    }
}