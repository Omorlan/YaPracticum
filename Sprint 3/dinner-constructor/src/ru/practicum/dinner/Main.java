package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    //¬от такое у нас суровое и серьезное заведение по типу жричедали
    private static final List<String> AVAILABLE_DISH_TYPES =
            Arrays.asList("первое", "второе", "десерт", "салат", "напиток");
    static DinnerConstructor dc;
    static Scanner scanner;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);
        TestDataHelper.addTestDishes(dc); //создаем некоторое количество блюд автоматически
        menu();
    }

    private static void menu() {
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case Messages.ADD_NEW_DISH_COMMAND:
                    addNewDish();
                    break;
                case Messages.GENERATE_DISH_COMBO_COMMAND:
                    generateDishCombo();
                    break;
                case Messages.EXIT_COMMAND:
                    System.out.println(Messages.EXIT);
                    return;
                default:
                    System.out.println(Messages.UNKNOWN_COMMAND);
            }
        }
    }

    private static void printMenu() {
        System.out.println(Messages.MENU);
        System.out.println(Messages.MENU1);
        System.out.println(Messages.MENU2);
        System.out.println(Messages.MENU3);
    }

    private static void addNewDish() {
        System.out.println(Messages.ENTER_TYPE);
        String dishType = scanner.nextLine().toLowerCase();
        if (AVAILABLE_DISH_TYPES.contains(dishType)) {
            System.out.println(Messages.ENTER_NAME);
            String dishName = scanner.nextLine();
            dc.addDishToList(dishType, dishName);
        } else {
            System.out.println(Messages.getErrWrongType(dishType));
        }

    }

    private static void generateDishCombo() {
        System.out.println(Messages.COMBO);
        while (true) {
            System.out.println(Messages.ENTER_NUM_TO_GENERATE);
            // —табильно вводил название блюда вместо числа при проверке, поэтому добавил hasNextInt()
           // Ќе стал оборачивать в try-catch, мне кажетс€ тут вполне хватит такой обработки без генерации исключений
            if (scanner.hasNextInt()) {
                int numberOfCombos = scanner.nextInt();

                if (numberOfCombos <= 0) {
                    System.out.println(Messages.getErrNumToGenerate(numberOfCombos));
                } else {
                    scanner.nextLine();
                    System.out.println(Messages.ENTER_TYPE_TO_GENERATE);

                    List<String> dishTypes = new ArrayList<>();

                    String nextItem;
                    while (!(nextItem = scanner.nextLine().toLowerCase()).isEmpty()) {
                        if (AVAILABLE_DISH_TYPES.contains(nextItem)) {
                            dishTypes.add(nextItem);
                        } else {
                            System.out.println(Messages.getErrWrongType(nextItem));
                        }
                    }

                    for (int i = 0; i < numberOfCombos; i++) {
                        List<String> combo = dc.generateComboDishes(dishTypes);
                        System.out.println(Messages.getDishSetMessage(i + 1, combo));
                    }
                    break;
                }
            } else {
                scanner.nextLine();
                System.out.println(Messages.ERR_INVALID_INPUT);
            }
        }
    }
}