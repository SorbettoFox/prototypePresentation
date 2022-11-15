package com.company;

import java.util.ArrayList;
import java.util.List;

/**@author :Timothy Fair
 * @version 1.0
 * Demonstrates the prototype design pattern by allowing cloning of an object which may otherwise have difficult to
 * retrieve data. Imagine for a moment the inventory is gotten from a database instead of a simple method.
 * Cloneable interface allows creation of field-for-field copy of an object, a deep copy.
 */
public class inventoryList implements Cloneable {
    private List<String> inventory;

    /**
     * Constructor
     */
    public inventoryList() {
        inventory = new ArrayList<String>();
    }

    /**
     *
     * @param newInv updated inventory via a List.
     */
    public inventoryList(List<String> newInv) {
        this.inventory = newInv;
    }

    /**
     * loads inventory from a theoretical database.
     */
    public void loadInventory() {
        inventory.add("Li-ion battery 10000Mah");
        inventory.add("Li-ion battery 13000Mah");
        inventory.add("Li-ion battery 20000Mah");
        inventory.add("Scented candle(Mulberry)");
        inventory.add("Scented candle(Cypress Forest)");
        inventory.add("Shower Fizzy(Tropical Mint)");

    }

    public List<String> getInv() {
        return this.inventory;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone(); // am not sure if we need this here
        return new ArrayList<>(this.inventory);
    }

    @Override
    public String toString() {
        return "inventoryList{" +
                "inventory=" + inventory +
                '}';
    }
}
