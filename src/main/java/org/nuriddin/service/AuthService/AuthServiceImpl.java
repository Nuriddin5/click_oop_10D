package org.nuriddin.service.AuthService;

import org.nuriddin.service.VerificationService.VerificationServiceImpl;

import java.util.Scanner;

/**
 * User:t.me/supermatematikuz
 * Date:20.02.2024 11:39
 */
public class AuthServiceImpl implements AuthService {

    VerificationServiceImpl verificationService = new VerificationServiceImpl();

    @Override
    public void register() {
        String fullName = getAnswer("Ism familyangizni kiriting: ");
        String email = getAnswer("Email kiriting: ");
        Long phoneNumber = getAnswer("Telefon nomeringizni kiriting: ", 0L);
        verificationService.verificate(phoneNumber);

    }


    @Override
    public void login() {
        //todo login
    }

    private String getAnswer(String question) {
        System.out.println(question);
        String answer = (new Scanner(System.in)).nextLine();
        return answer;
    }

    private Long getAnswer(String question, Long baseLong) {
        System.out.println(question);
        Long answer = (new Scanner(System.in)).nextLong();
        return answer;
    }
}
