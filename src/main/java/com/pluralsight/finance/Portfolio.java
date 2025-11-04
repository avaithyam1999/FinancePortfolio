package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (Valuable valuable : assets) {
            total += valuable.getValue();
        }
        return total;
    }
}
