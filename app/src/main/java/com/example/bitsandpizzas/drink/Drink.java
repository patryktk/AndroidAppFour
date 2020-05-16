package com.example.bitsandpizzas.drink;

import com.example.bitsandpizzas.R;

public class Drink {
    private String name;
    private String description;
    private int imgsource;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    public Drink(String name, String description, int imgsource) {
        this.name = name;
        this.description = description;
        this.imgsource = imgsource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImgsource() {
        return imgsource;
    }


    public String toString() {
        return this.name;
    }
}