package good.stuff.webstore.model.payment;

public enum PaymentType {
    PAY_PALL,
    CASH_ON_DELIVERY,;

    public PaymentType getValue(String value) {return PaymentType.valueOf(value.toUpperCase());}
}
