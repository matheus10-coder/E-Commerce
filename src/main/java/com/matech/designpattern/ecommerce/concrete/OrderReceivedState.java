package com.matech.designpattern.ecommerce.concrete;

import com.matech.designpattern.ecommerce.context.PackageContext;
import com.matech.designpattern.ecommerce.state.PackageState;

public class OrderReceivedState implements PackageState {

    @Override
    public void next(PackageContext context) {
        context.setState(new DispatchedState());
    }

    @Override
    public void previous(PackageContext context) {
        System.out.println("Order is in the initial state. No previous state available.");
    }

    @Override
    public String getStatus() {
        return "Order Received!";
    }

    @Override
    public String notifyCustomer() {
        System.out.println("Notification to user: Your order has been received and is being prepared for shipment.");
        return "Notification to user: Your order has been received and is being prepared for shipment.";

    }
}
