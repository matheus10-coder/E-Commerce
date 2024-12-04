package com.matech.designpattern.ecommerce.concrete;

import com.matech.designpattern.ecommerce.context.PackageContext;
import com.matech.designpattern.ecommerce.state.PackageState;
/**
 * Represents the state where the package is waiting for payment confirmation.
 */
public class PaymentState implements PackageState {
    private final boolean isPaymentConfirmed;

    /**
     * Constructor for PaymentState.
     *
     * @param isPaymentConfirmed Indicates if the payment is already confirmed.
     */
    public PaymentState(boolean isPaymentConfirmed) {
        this.isPaymentConfirmed = isPaymentConfirmed;
    }

    @Override
    public void next(PackageContext context) {
        if (isPaymentConfirmed) {
            context.setState(new DispatchedState());
        } else {
            throw new IllegalStateException("Payment is not confirmed. Cannot proceed to the next state.");
        }
    }
    /**
     * Transitions back to the OrderReceivedState.
     *
     * @param context The package context.
     */
    @Override
    public void previous(PackageContext context) {
        context.setState(new OrderReceivedState());
    }

    @Override
    public String getStatus() {
        return isPaymentConfirmed ? "Payment has been accepted successfully!" : "Awaiting Payment Confirmation...";
    }

    @Override
    public String notifyCustomer() {
        System.out.println("Notification ot user: Payment has been confirmed!");
        return "Notification to user: Payment has been confirmed!";
    }
    /**
     * Default setter: indicates the payment is already confirmed.
     */
    public boolean confirmPayment() {
        return isPaymentConfirmed;
        //This logic will change if when checking future db(s) or api we would change it here

    }


}
