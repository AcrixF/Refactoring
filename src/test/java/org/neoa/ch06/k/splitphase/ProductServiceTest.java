package org.neoa.ch06.k.splitphase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    void setup() {
        this.productService = new ProductService();
    }

    @Test
    void priceOrderReturnsCorrectValueWhenNoErrorsOccurs() {
        Product product = new Product()
                .setBasePrice(10)
                .setDiscountRate(15)
                .setDiscountThreshold(10);

        ShippingMethod shippingMethod = new ShippingMethod()
                .setFeePerCase(10)
                .setDiscountedFee(3)
                .setDiscountThreshold(5);

        double result = productService.priceOrder(product, 50, shippingMethod);

        assertThat(result).isNotZero();

    }

}
