/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author J I N G G A
 * next by Taufik
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(float discount, String name, float price, int amount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    
}
