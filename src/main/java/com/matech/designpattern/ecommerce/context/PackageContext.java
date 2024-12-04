package com.matech.designpattern.ecommerce.context;


import com.matech.designpattern.ecommerce.concrete.OrderReceivedState;
import com.matech.designpattern.ecommerce.concrete.PaymentState;
import com.matech.designpattern.ecommerce.state.PackageState;

import java.time.LocalDateTime;

public class PackageContext {
    //Reference to our state interface
    private PackageState state;


    public PackageContext() {
        PaymentState payment = new PaymentState(true);
        if (payment.confirmPayment()) {
            this.state = new OrderReceivedState();
        }
        else{
            throw new IllegalStateException("Payment is not confirmed. Cannot proceed to the next state.");
        }
    }

    public void setState(PackageState state) {
        //looking for previous state before setting new
        String previousState = this.state.getStatus();
        //setting current state
        this.state = state;
        logStateTransition(previousState,state.getStatus());
    }

    public String getStatus() {
        return state.getStatus();
    }

    public void nextState(){
        state.next(this);
    }
    public void previousState(){
        state.previous(this);
    }
    public String notifyCustomer(){
        return state.notifyCustomer();
    }

    //logging purposes - used only when setting the state
    public void logStateTransition(String previousState, String nextState) {
        System.out.println("Transitioned from " + previousState + " to " + nextState + " at " + LocalDateTime.now());
    }



}
