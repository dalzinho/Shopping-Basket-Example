package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by user on 17/03/2017.
 */

public class Basket {

    private ArrayList<Item> basketContents;
    private Customer customer;

    public Basket(Customer customer) {
        this.basketContents = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Item> getBasketContents() {
        return basketContents;
    }

    public int countItems() {
        return basketContents.size();
    }

    public void addItem(Item item) {
        basketContents.add(item);
    }

    public void removeLastItem(){
        basketContents.remove(basketContents.size() - 1);
    }

    public void removeOneBySKU(String sku){
        for (Item item : basketContents){
            if (item.getSku().equals(sku)){
                basketContents.remove(item);
                break;
            }
        }
    }

    public void removeAllBySKU(String sku){

        // I did this similarly to the above 'removeOne' method and got a concurrent modification error!
        // Thanks to the good people on this thread: http://stackoverflow.com/questions/18448671/how-to-avoid-concurrentmodificationexception-while-removing-elements-from-arr
        //for their help and support!

        Iterator<Item> iterator = basketContents.iterator();

        while(iterator.hasNext()){
            Item item = iterator.next();

            if(item.getSku().equals(sku)){
                iterator.remove();
            }
        }
    }

    public void empty() {
        basketContents.clear();
    }

    public HashMap<String, Integer> itemsMap(){
        HashMap<String, Integer> items = new HashMap<>();
        for (Item item : basketContents){
            if (items.containsKey(item.getSku())){
                int itemCount = items.get(item.getSku());
                items.put(item.getSku(), itemCount + 1);
            } else {
                items.put(item.getSku(), 1);
            }
        }
        return items;
    }

    public float getPriceBySku(String sku){
        for (Item item : basketContents){
            if(item.getSku().equals(sku)){
                return item.getPrice();
            }
        }
        return 0;
    }
}
