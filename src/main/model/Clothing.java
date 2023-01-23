package model;

import ui.Printer;

import java.util.ArrayList;
import java.util.List;

public class Clothing extends Wearable {
    private List<Wearable> wearables;

    public Clothing(String name) {
        super(name);
        wearables = new ArrayList<>();
    }

    public void add(Wearable wearable) {
        wearables.add(wearable);
    }

    // EFFECTS: displays the result of placing this wearable on top of an item named onTopOf
    @Override
    public void display(String onTopOf) {
        Printer.print(onTopOf, name);

        for (Wearable wearable : wearables) {
            wearable.display(this.name);
        }
    }
}

