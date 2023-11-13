import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("��� ������������ ������ �������!");

        ArrayList<String> shoppingList = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("������ ��������� ������:");
            System.out.println("1. �������� ����� � ������");
            System.out.println("2. �������� ������");
            System.out.println("3. �������� ������");
            System.out.println("4. ��������� ������");
            System.out.print("������� ����� ��������� �������:");

            int actionNumber = scanner.nextInt();

            System.out.println(""); // ������� ����� ����� � ������� �� ����������� � ����
            if (actionNumber == 1) {
                System.out.print("������� �������� ������, ������� �� ������ �������� � ������ �������:");
                String newProduct = scanner.next();
                if (shoppingList.contains(newProduct)) {
                    System.out.println("����� " + newProduct + " ��� ���� � ������ �������.");
                } else {
                    shoppingList.add(newProduct);
                    System.out.println("����� " + newProduct + " ������� �������� � ������ �������.");
                }
            } else if (actionNumber == 2) {
                System.out.println("������ �������:");
                if (shoppingList.isEmpty()){
                    System.out.println("������ ������� ����.");
                } else {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i+1) + ". " + shoppingList.get(i));
                    }
                }
            } else if (actionNumber == 3) {
                if (shoppingList.isEmpty()) {
                    System.out.println("������ ������� ����.");
                } else {
                    System.out.println("�� ����������� �������� ������ �������.");
                    System.out.println("������ ��������� ������:");
                    System.out.println("1. ����������� ��������.");
                    System.out.println("2. ������� � ����.");
                    System.out.print("������� ����� ��������� �������:");

                    while (true) {
                        int deleteAction = scanner.nextInt();

                        if (deleteAction == 1) {
                            shoppingList.clear();
                            System.out.println("������ ������� ������.");
                            break;
                        } else if (deleteAction == 2) {
                            System.out.println("������� � ����.");
                            break;
                        } else {
                            System.out.println("����������� �������!");
                            System.out.println("������ ��������� ������:");
                            System.out.println("1. ����������� ��������.");
                            System.out.println("2. ������� � ����.");
                        }
                    }
                }
            } else if (actionNumber == 4) {
                break;
            } else {
                System.out.println("����������� �������!");
            }
        }
    }
}