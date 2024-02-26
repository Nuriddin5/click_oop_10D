package org.nuriddin;

import org.nuriddin.service.AppService.AppServiceImpl;

public class Main {
    public static void main(String[] args) {
        AppServiceImpl appService = new AppServiceImpl();
        appService.start();
    }
}