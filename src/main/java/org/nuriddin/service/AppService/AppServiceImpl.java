package org.nuriddin.service.AppService;

import org.nuriddin.service.AuthService.AuthServiceImpl;

import java.util.Scanner;

/**
 * User:t.me/supermatematikuz
 * Date:26.02.2024 11:07
 */
public class AppServiceImpl implements AppService {

    AuthServiceImpl authService = new AuthServiceImpl();

    @Override
    public void start() {
        while (true) {
            System.out.println("""
                    Assalomu alaykum Click ilovasiga xush kelibsiz!
                    1.Ro'yhattan o'tish
                    2.Hisobga kirish
                    0.Chiqish
                    """);
            int menuRaqam = (new Scanner(System.in)).nextInt();
            if (menuRaqam == 0) break;
            else if (menuRaqam == 1) {
                authService.register();
            } else if (menuRaqam == 2) {
                authService.login();
            }
        }
    }
}
