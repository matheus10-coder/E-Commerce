package com.matech.designpattern.ecommerce.concrete;

import com.matech.designpattern.ecommerce.context.PackageContext;
import com.matech.designpattern.ecommerce.state.PackageState;

public class InTransitState implements PackageState {
    @Override
    public void next(PackageContext context) {
        context.setState(new OutForDeliveryState());
    }

    @Override
    public void previous(PackageContext context) {
        context.setState(new DispatchedState());
    }

    @Override
    public String getStatus() {
        return "In Transit!";
    }

    @Override
    public String notifyCustomer() {
        System.out.println("Notification to user: Your package is in transit.");
        return "Notification to user: Your package is in transit.";
    }
}
