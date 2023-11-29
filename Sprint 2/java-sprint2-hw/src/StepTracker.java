import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    int goalByStepsPerDay = 10000;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.print(Messages.ENTER_MONTH);
        int numMonth = scanner.nextInt();

        if (numMonth < 1 || numMonth > 12) {
            System.out.println(Messages.INVALID_MONTH);
            return;
        }
        System.out.print(Messages.ENTER_DAY);
        int numDay = scanner.nextInt();
        if (numDay < 1 || numDay > 30) {
            System.out.println(Messages.INVALID_DAY);
            return;
        }
        System.out.print(Messages.ENTER_STEPS);
        int numberOfSteps = scanner.nextInt();
        if (numberOfSteps < 0) {
            System.out.println(Messages.INVALID_STEP);
            return;
        }
        MonthData monthData = monthToData[numMonth - 1];
        monthData.days[numDay - 1] = numberOfSteps;
    }

    void printStatistic() {
        System.out.print(Messages.ENTER_MONTH);
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println(Messages.INVALID_MONTH);
            return;
        }

        MonthData monthData = monthToData[month - 1];
        System.out.println(Messages.STAT_BY_DAY);
        monthData.printDaysAndStepsFromMonth();
        System.out.print(Messages.STAT_SUM);
        System.out.println(monthData.sumStepsFromMonth());
        System.out.print(Messages.STAT_MAX);
        System.out.println(monthData.maxSteps());
        System.out.print(Messages.STAT_AVG);
        System.out.println(monthData.sumStepsFromMonth() / 30);
        System.out.print(Messages.STAT_KM);
        System.out.println(converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.print(Messages.STAT_KC);
        System.out.println(converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()));
        System.out.print(Messages.STAT_BEST_SER);
        System.out.println(monthData.bestSeries(goalByStepsPerDay));
        System.out.println();
    }

    void changeStepGoal() {
        System.out.print(Messages.ENTER_NEW_GOAL);
        goalByStepsPerDay = scanner.nextInt();
    }
}
