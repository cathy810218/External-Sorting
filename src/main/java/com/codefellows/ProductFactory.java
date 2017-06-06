package com.codefellows;

/**
 * Created by cathyoun on 6/5/17.
 */
public class ProductFactory {

    public Product getProduct(ProductType productType) {
        if (productType == ProductType.TYPE1) {
            return new TypeOneProduct();
        }
        return null;
    }

}
