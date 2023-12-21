package ru.practicum.dinner;

import java.util.*;

public class DinnerConstructor {
    Map<String, ArrayList<String>> dishesMap = new HashMap<>();

    public void addDishToList(String type, String name) {
        dishesMap.computeIfAbsent(type, key -> new ArrayList<>()).add(name);
        System.out.println(Messages.getAddedToMenuMessage(type, name));
    }

    public List<String> generateComboDishes(List<String> dishesTypes) {
        Random random = new Random();
        List<String> selectedDishes = new ArrayList<>();

        for (String type : dishesTypes) {
            if (dishesMap.containsKey(type)) {
                List<String> typeDishes = dishesMap.get(type);

                int randomIndex = random.nextInt(typeDishes.size());
                String selectedDish = typeDishes.get(randomIndex);
                selectedDishes.add(selectedDish);
            }
        }

        return selectedDishes;
    }
}