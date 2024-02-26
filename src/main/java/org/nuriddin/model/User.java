package org.nuriddin.model;

import lombok.*;
import org.nuriddin.enums.Role;

/**
 * User:t.me/supermatematikuz
 * Date:20.02.2024 11:25
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String fullName;
    private Long phoneNumber;
    private Integer pinCode;
    private Integer smsCode;
    private Role role;

    //oneToMany
//    Card[] cards; kerak emas, arxitektura bo'yicha noto'g'ri
}
