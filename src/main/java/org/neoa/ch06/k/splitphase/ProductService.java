package org.neoa.ch06.k.splitphase;

public class ProductService {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        double basePrice = product.getBasePrice() * quantity;
        double discount = Math.max(quantity - product.getDiscountThreshold(), 0) * product.getBasePrice() * product.getDiscountRate();

        PriceData priceData = new PriceData()
                .setBasePrice(basePrice)
                .setQuantity(quantity);

        double price = applyShipping(priceData, shippingMethod, discount);

        return price;
    }

    private double applyShipping(PriceData priceData, ShippingMethod shippingMethod, double discount) {
        double shippingPerCase = (priceData.getBasePrice() > shippingMethod.getDiscountThreshold()) ? shippingMethod.getDiscountedFee() : shippingMethod.getFeePerCase();
        double shippingCost = priceData.getQuantity() * shippingPerCase;

        double price = priceData.getBasePrice() - discount + shippingCost;
        return price;
    }

}
