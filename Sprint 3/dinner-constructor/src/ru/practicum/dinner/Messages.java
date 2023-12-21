package ru.practicum.dinner;

import java.util.List;

public class Messages {
    //Menu
    public static final String MENU ="�������� �������:";
    public static final String MENU1 ="1 - �������� ����� �����";
    public static final String MENU2 ="2 - ������������� ���������� ����";
    public static final String MENU3 ="3 - �����";
    public static final String ADD_NEW_DISH_COMMAND = "1";
    public static final String GENERATE_DISH_COMBO_COMMAND = "2";
    public static final String EXIT_COMMAND = "3";
    public static final String EXIT = "���������� ������.";
    public static final String UNKNOWN_COMMAND = "����������� �������.";

    //addNewDish
    public static final String ENTER_TYPE="������� ��� �����:";
    public static final String ENTER_NAME="������� �������� �����:";
    public static final String ADDED_TO_MENU = "� ���� ��������� ����� ������� � ���������: %s - %s.";

    public static String getAddedToMenuMessage(String type, String name) {
        return String.format(ADDED_TO_MENU, type, name);
    }

    //generateDishCombo()
    public static final String COMBO = "����������� ������-�����.";
    public static final String ENTER_NUM_TO_GENERATE = "������� ���������� �������, ������� ����� �������������:";
    public static final String ENTER_TYPE_TO_GENERATE = "������� �������� ���� �����" +
            "(������/������/�����/������/�������), �������� �������� �������� ������ (enter).\n" +
            "��� ���������� ����� ������� ������ ������.";
    public static final String ERR_NUM_TO_GENERATE = "���������� ������� �� ����� ���� %d,������� �������� ������ ����.";
    public static final String ERR_WRONG_TYPE = "%s - ������ ��� ���� �� ������� � ������ ���������.";
    public static final String ERR_INVALID_INPUT ="���������� ������ �����.";
    public static String getErrWrongType(String type) {
        return String.format(ERR_WRONG_TYPE, type);
    }
    public static String getErrNumToGenerate(int num) {
        return String.format(ERR_NUM_TO_GENERATE, num);
    }
    public static String getDishSetMessage(int setNumber, List<String> combo) {
        return String.format("������-���� #%d: %s", setNumber, combo);
    }
}
