package Models;

import java.util.Date;
import Models.Enums.PaymentMode;
import Models.Enums.PaymentStatus;

public class Payment extends BaseModel {
    private PaymentMode paymentMode;
    private boolean isPaymentSuccessful;
    private double amount;
    private String referenceNumber;
    private Date date;
    private PaymentStatus status;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }

    public void setPaymentSuccessful(boolean paymentSuccessful) {
        isPaymentSuccessful = paymentSuccessful;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
