public class For_study {

    public static void printSeparator() {
        System.out.println("++++++++++++++++++++++");
        System.out.println("----------------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] issueByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issueByMonths.length; i++) {
            printIssues(issueByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        printIssues(sum(issueByMonths));
    }
}