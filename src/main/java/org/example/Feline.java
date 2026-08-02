package org.example;

import java.util.List;

public class Feline implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return List.of("Животные", "Птицы", "Рыба");
    }

    public String getFamily() {
        return "Кошачьи";
    }

    public int getCount() {
        return getCount(1);
    }

    public int getCount(int kittensCount) {
        return kittensCount;
    }
}