package org.neoa.ch07.d.replacetempwithquery;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Order {
    private Integer quantity;
    private Item item;

    public  Order(Integer quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public double calculatePrice() {
        double basePrice = this.quantity * this.item.getPrice();
        double discountFactor = 0.98;
        if (basePrice > 1000) {
            discountFactor -= 0.3;
        }
        return basePrice * discountFactor;
    }
}
