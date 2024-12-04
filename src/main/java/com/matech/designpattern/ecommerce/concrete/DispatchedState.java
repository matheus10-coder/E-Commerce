package com.matech.designpattern.ecommerce.concrete;

import com.matech.designpattern.ecommerce.context.PackageContext;
import com.matech.designpattern.ecommerce.state.PackageState;

public class DispatchedState implements PackageState {
    @Override
    public void next(PackageContext context) {
        context.setState(new InTransitState());
    }

    @Override
    public void previous(PackageContext context) {
        context.setState(new OrderReceivedState());
    }

    @Override
    public String getStatus() {
        return "Dispatched!";
    }

    @Override
    public String notifyCustomer() {
        System.out.println("Notification to user: Your package has been dispatched");
        return "Notification to user: Your package has been dispatched";
    }
}
