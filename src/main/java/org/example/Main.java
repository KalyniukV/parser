package org.example;

import org.example.service.ApplicationService;

public class Main {

    public static void main(String[] args) {
        ApplicationService applicationService = new ApplicationService();
        applicationService.init();
    }
}