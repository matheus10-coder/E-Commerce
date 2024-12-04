package com.matech.designpattern.ecommerce.state;

import com.matech.designpattern.ecommerce.context.PackageContext;

/**
 * Interface representing the state of a package in the shipment lifecycle.
 *  Each state must implement methods to define specific behavior
 *  and transitions to the next and previous states.
 */
public interface PackageState {
    // Moves to the next state
    void next(PackageContext context);
    // Moves to the previous state
    void previous(PackageContext context);
    // Returns the name of the current state
    String getStatus();
    String notifyCustomer();

}
