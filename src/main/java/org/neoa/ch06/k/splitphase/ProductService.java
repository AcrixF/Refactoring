package org.neoa.ch06.k.splitphase;

public class ProductService {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        double basePrice = product.getBasePrice() * quantity;
        double discount = Math.max(quantity - product.getDiscountThreshold(), 0) * product.getBasePrice() * product.getDiscountRate();

        PriceData priceData = new PriceData()
                .setBasePrice(basePrice)
                .setQuantity(quantity);

        return applyShipping(priceData, shippingMethod, discount);
    }

    private double applyShipping(PriceData priceData, ShippingMethod shippingMethod, double discount) {
        double shippingPerCase = (priceData.getBasePrice() > shippingMethod.getDiscountThreshold()) ? shippingMethod.getDiscountedFee() : shippingMethod.getFeePerCase();
        double shippingCost = priceData.getQuantity() * shippingPerCase;

        return priceData.getBasePrice() - discount + shippingCost;
    }

}
