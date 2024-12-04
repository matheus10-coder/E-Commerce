package com.matech.designpattern.ecommerce.controller;

import com.matech.designpattern.ecommerce.context.PackageContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("matech/package")
public class PackageController {
    //The final declaration is to avoid any changes in this packageContext object.
    // The only way to change is for another package to come in
    private final PackageContext packageContext = new PackageContext();

    @GetMapping("/status")
    public String getStatus(){
        return packageContext.getStatus();
    }

    @PostMapping("/next")
    public String nextState(){
        packageContext.nextState();
        return "Moved to next state: " + packageContext.getStatus();
    }

    @PostMapping("/previous")
    public String previousState(){
        packageContext.previousState();
        return "Moved to previous state: " + packageContext.getStatus();
    }

    @PostMapping("/notify")
    public String notifyCustomer() {
        return packageContext.notifyCustomer();
    }



}
