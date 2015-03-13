package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {

	public static Payment createPayment(ClientData client, Money amount) {
		Payment payment = new Payment(Id.generate(), client, amount);
		return payment;
	}
}
