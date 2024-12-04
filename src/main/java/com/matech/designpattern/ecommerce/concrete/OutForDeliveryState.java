package com.matech.designpattern.ecommerce.concrete;

import com.matech.designpattern.ecommerce.context.PackageContext;
import com.matech.designpattern.ecommerce.state.PackageState;

public class OutForDeliveryState implements PackageState {
    @Override
    public void next(PackageContext context) {
        System.out.println("The package has already been delivered. No further state");
    }

    @Override
    public void previous(PackageContext context) {
        context.setState(new OutForDeliveryState());
    }

    @Override
    public String getStatus() {
        return "Delivered!";
    }

    @Override
    public String notifyCustomer() {
        System.out.println("Notification to user: Your package has been delivered. Thank you for shopping with us!");
        return "Notification to user: Your package has been delivered. Thank you for shopping with us!";
    }
}
