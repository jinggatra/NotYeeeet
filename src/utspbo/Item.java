package utspbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class Item {
    protected String name;
    protected float price;
    protected int amount;

    public Item() {
    }

    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    public float getTotalPrice(){
        float total = 0;
        total = (amount * price) - (price * amount);
        return total;
    }
    
    @Override
    public String toString(){
        return
    }
}
