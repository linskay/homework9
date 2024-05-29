public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");
        System.out.println("Task 1");
        int[] pay = new int[5];
        pay[0] = 13_000;
        pay[1] = 15_000;
        pay[2] = 11_500;
        pay[3] = 16_500;
        pay[4] = 5_000;
        int sumPay = 0;
        for (int i = 0; i < pay.length; i++) {
            sumPay += pay[i];
        }
        {
            System.out.printf("Сумма трат за месяц составила %s рублей.\n", sumPay);
        }
        System.out.println("Task 2");
        int minPay = 999999;
        int maxPay = -1;
        for (int i = 0; i < pay.length; i++) {
            if (pay[i] < minPay)
                minPay = pay[i];
        }
        for (int i = 0; i < pay.length; i++) {
            if (maxPay < pay[i])
                maxPay = pay[i];
        }
        {
            System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сума трат за неделю составила %s рублей.\n", minPay, maxPay);
        }
        System.out.println("Task 3");
        double averageMonth = sumPay / pay.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", averageMonth);
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);


        }


    }

}