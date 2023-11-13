import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        ArrayList<String> shoppingList = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Список доступных команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");
            System.out.print("Введите номер требуемой команды:");

            int actionNumber = scanner.nextInt();

            System.out.println(""); // Добавил чтобы текст в консоли не превращался в кашу
            if (actionNumber == 1) {
                System.out.print("Введите название товара, который Вы хотите добавить в список покупок:");
                String newProduct = scanner.next();
                if (shoppingList.contains(newProduct)) {
                    System.out.println("Товар " + newProduct + " уже есть в списке покупок.");
                } else {
                    shoppingList.add(newProduct);
                    System.out.println("Товар " + newProduct + " успешно добавлен в список покупок.");
                }
            } else if (actionNumber == 2) {
                System.out.println("Список покупок:");
                if (shoppingList.isEmpty()){
                    System.out.println("Список покупок пуст.");
                } else {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i+1) + ". " + shoppingList.get(i));
                    }
                }
            } else if (actionNumber == 3) {
                if (shoppingList.isEmpty()) {
                    System.out.println("Список покупок пуст.");
                } else {
                    System.out.println("Вы собираетесь очистить список покупок.");
                    System.out.println("Список доступных команд:");
                    System.out.println("1. Подтвердить действие.");
                    System.out.println("2. Возврат в меню.");
                    System.out.print("Введите номер требуемой команды:");

                    while (true) {
                        int deleteAction = scanner.nextInt();

                        if (deleteAction == 1) {
                            shoppingList.clear();
                            System.out.println("Список покупок очищен.");
                            break;
                        } else if (deleteAction == 2) {
                            System.out.println("Возврат в меню.");
                            break;
                        } else {
                            System.out.println("Неизвестная команда!");
                            System.out.println("Список доступных команд:");
                            System.out.println("1. Подтвердить действие.");
                            System.out.println("2. Возврат в меню.");
                        }
                    }
                }
            } else if (actionNumber == 4) {
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}