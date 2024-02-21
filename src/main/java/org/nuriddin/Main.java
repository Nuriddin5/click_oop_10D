package org.nuriddin;

import org.nuriddin.service.AuthService.AuthService;
import org.nuriddin.service.AuthService.AuthServiceImpl;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        AuthServiceImpl authService = new AuthServiceImpl();




        System.out.println("Assalomu alaykum tanlang\n" +
                "1.Login\n" +
                "2.Register\n");
        int menuRaqam = (new Scanner(System.in)).nextInt();
        switch (menuRaqam) {
            case 1:
                authService.login();
                break;
            case 2:
                authService.register();
                break;
            default:
                System.out.println("Bunday menu yo'q");
        }

    }
}