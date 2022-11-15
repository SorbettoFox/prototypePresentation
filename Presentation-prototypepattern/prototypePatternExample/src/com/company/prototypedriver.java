package com.company;

import java.util.List;

/**
 * The idea for a prototype pattern is to clone an object that is otherwise costly to create, avoiding use of the new
 * keyword. For example, we want to load data from a database and modify it in our program but we'd have to
 * make multiple calls to the database normally to do this, so we can avoid this resource waste by creating a clone
 * of an object and modifying that instead.
 */
public class prototypedriver {

    public static void main (String[] args) throws CloneNotSupportedException {
        inventoryList firstInventory = new inventoryList();
        firstInventory.loadInventory();
        inventoryList secondInventory = (inventoryList) firstInventory.clone();
        List<String> list = secondInventory.getInv();
        list.add("Bath Fizzy (White Strawberry)");
        list.add("Shower Gel(Cool Moon)");
        list.remove("Scented candle(Cypress Forest)");
        System.out.println("Original inventory: " + secondInventory);
        System.out.println("Locally updated inventory: " + list);
    }
}


//source: https://www.digitalocean.com/community/tutorials/prototype-design-pattern-in-java