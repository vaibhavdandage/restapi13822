package project.vpd.java12feb2022.validation;

public enum BusinessRulesValidationError {

	EMAIL_ADDRESS_ALREADY_USED("Email address already used.", true),
	PHONE_NUMBER_ALREADY_USED("Phone number already used.", true), WRONG_OLD_PASSWORD("Old password is wrong.", true),
	CLIENT_CART_CACLULATION_INVALID("Calculation of cart items and price done by client is invalid.", true),
	CLIENT_COUPON_INVALID("Coupon invalid.", true),
	CLIENT_COUPON_ALREADY_USED_BY_USER("Coupon already used for this user.", true),
	CLIENT_OFFER_INVALID("Offer invalid.", false),
	CLIENT_PRODUCT_INVALID("Product details provided by client are invalid.", false),
	CLIENT_PRODUCT_PRICE_NOT_CORRECT("Product price provided by client not correct.", true),
	PRODUCT_STOCK_NOT_AVAILABLE("Product stock not available.", true),
	COD_NOT_ALLOWED_FOR_USER("Cash on delivery allowed only for registered users.", true),
	BUSINESS_BRANCH_INVALID("Branch selected is not valid.", true),
	DELIVERY_WINDOW_NOT_AVAILABLE("Delivery window not available.", true);

	private final Object[] values;

	BusinessRulesValidationError(Object... vals) {
		values = vals;
	}

	public String errorDescription() {
		return (String) values[0];
	}

	public boolean sendBackToUser() {
		return  (Boolean) values[1];
	}

	
}
