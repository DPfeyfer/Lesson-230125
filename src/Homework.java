import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {Task_1(); Task_2(); Task_3(); Add_Task();

    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " not leap year");
        }
    }

    public static void setOs(int clientOS, int yearDevice) {
        int currentYear = LocalDate.now().getYear();

        if(clientOS == 0 && yearDevice < currentYear){
            System.out.println("Download light version of the app for Android");}
        else if (clientOS == 1 && yearDevice < currentYear){
            System.out.println("Download light version of the app for IOS");
        }
        else if (clientOS == 0 && yearDevice >= currentYear){
            System.out.println("Download app for Android");
        }
        else if (clientOS == 1 && yearDevice >= currentYear){
            System.out.println("Download app for IOS");
        }
        else {
            System.out.println("Choose between 0 or 1");
        }

    }

    public static void calculateDay(int deliveryDistance) {
        int numberDay = 1;

        if (deliveryDistance <= 20) {
            System.out.println("We need " + numberDay + " delivery days");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("We need " + (numberDay + 1) + " delivery days");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("We need " + (numberDay + 2) + " delivery days");
        } else {
            System.out.println("we can not delivery");
        }
    }

    public static void printDay(int day) {
        System.out.println("We need " + day + " delivery days");

    }
    public static void calculateDay1(int deliveryDistance) {
        int numberDay = 1;
        if (deliveryDistance > 20) {
            numberDay += 1;
        }
        if (deliveryDistance > 60) {
            numberDay += 1;
        }
        printDay(numberDay);
    }

    public static void Task_1() {
        System.out.println("Task 1");
        int year = 2021;
        checkYear(year);

        System.out.println();
    }

    public static void Task_2() {
        System.out.println("Task 2");

        int clientOS = 1;
        int yearDevice = 2022;
        setOs(clientOS, yearDevice);

        System.out.println();

    }

    public static void Task_3() {
        System.out.println("Task 3");
        int deliveryDistance = 101;

        calculateDay(deliveryDistance);

        System.out.println();

    }

    public static void Add_Task() {
        System.out.println("Add Task");
        int deliveryDistance = 101;
        calculateDay1(deliveryDistance);

        System.out.println();

    }
}