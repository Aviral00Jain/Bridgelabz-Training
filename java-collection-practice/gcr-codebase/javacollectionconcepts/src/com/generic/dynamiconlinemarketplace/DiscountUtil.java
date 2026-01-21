package com.generic.dynamiconlinemarketplace;

public class DiscountUtil {
	public static <T extends Product<?>> void applyDiscount(T product, double percent) {
		double discountedPrice = product.getPrice() - (product.getPrice() * percent/100);
		product.setPrice(discountedPrice);
	}
}