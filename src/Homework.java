public class Homework {
    public static void main(String[] args) {Task_1(); Task_2(); Task_3();

    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " not leap year");
        }
    }

    public static void setOs(int clientOS, int yearDevice) {

        if(clientOS == 0 && yearDevice <= 2015){
            System.out.println("Download light version of the app for Android");}
        else if (clientOS == 1 && yearDevice <= 2015){
            System.out.println("Download light version of the app for IOS");}
        else if (clientOS == 0 && yearDevice > 2015){
            System.out.println("Download app for Android");}
        else if (clientOS == 1 && yearDevice > 2015){
            System.out.println("Download app for IOS");}
        else {
            System.out.println("Choose between 0 or 1");}

    }

    public static void calculateDay(int deliveryDistance, int numberDay) {

        if (deliveryDistance <= 20){
            System.out.println("We need " + numberDay + " delivery days");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("We need " + (numberDay + 1) + " delivery days");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("We need " + (numberDay + 2) + " delivery days");
        }
        else{
            System.out.println("we can not delivery");
        }

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
        int yearDevice = 2016;
        setOs(clientOS, yearDevice);
        System.out.println();

    }

    public static void Task_3() {
        System.out.println("Task 3");
        int deliveryDistance = 99;
        int numberDay = 1;
        calculateDay(deliveryDistance, numberDay);

        System.out.println();

    }
}