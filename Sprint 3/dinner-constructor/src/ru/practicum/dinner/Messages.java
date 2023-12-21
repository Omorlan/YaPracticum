package ru.practicum.dinner;

import java.util.List;

public class Messages {
    //Menu
    public static final String MENU ="Выберите команду:";
    public static final String MENU1 ="1 - Добавить новое блюдо";
    public static final String MENU2 ="2 - Сгенерировать комбинации блюд";
    public static final String MENU3 ="3 - Выход";
    public static final String ADD_NEW_DISH_COMMAND = "1";
    public static final String GENERATE_DISH_COMBO_COMMAND = "2";
    public static final String EXIT_COMMAND = "3";
    public static final String EXIT = "Завершение работы.";
    public static final String UNKNOWN_COMMAND = "Неизвестная команда.";

    //addNewDish
    public static final String ENTER_TYPE="Введите тип блюда:";
    public static final String ENTER_NAME="Введите название блюда:";
    public static final String ADDED_TO_MENU = "В меню добавлена новая позиция в категории: %s - %s.";

    public static String getAddedToMenuMessage(String type, String name) {
        return String.format(ADDED_TO_MENU, type, name);
    }

    //generateDishCombo()
    public static final String COMBO = "Конструктор бизнес-ланча.";
    public static final String ENTER_NUM_TO_GENERATE = "Введите количество наборов, которые нужно сгенерировать:";
    public static final String ENTER_TYPE_TO_GENERATE = "Вводите желаемые типы блюда" +
            "(Первое/Второе/Салат/Десерт/Напиток), разделяя символом переноса строки (enter).\n" +
            "Для завершения ввода введите пустую строку.";
    public static final String ERR_NUM_TO_GENERATE = "Количество наборов не может быть %d,введите значение больше ноля.";
    public static final String ERR_WRONG_TYPE = "%s - данный тип блюд не готовят в данном заведении.";
    public static final String ERR_INVALID_INPUT ="Необходимо ввести число.";
    public static String getErrWrongType(String type) {
        return String.format(ERR_WRONG_TYPE, type);
    }
    public static String getErrNumToGenerate(int num) {
        return String.format(ERR_NUM_TO_GENERATE, num);
    }
    public static String getDishSetMessage(int setNumber, List<String> combo) {
        return String.format("Бизнес-ланч #%d: %s", setNumber, combo);
    }
}
