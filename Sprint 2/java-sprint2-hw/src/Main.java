import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int cmd = scanner.nextInt();

            switch (cmd) {
                case 1:
                    tracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    tracker.changeStepGoal();
                    break;
                case 3:
                    tracker.printStatistic();
                    break;
                case 4:
                    return;
                default:
                    System.out.println(cmd + Messages.INVALID_CMD);
            }

        }
    }

    static void printMenu() {
        System.out.println(Messages.MENU1);
        System.out.println(Messages.MENU2);
        System.out.println(Messages.MENU_OPTION1);
        System.out.println(Messages.MENU_OPTION2);
        System.out.println(Messages.MENU_OPTION3);
        System.out.println(Messages.MENU_OPTION4);
    }
}
