package org.nuriddin.model;

import lombok.*;

/**
 * User:t.me/supermatematikuz
 * Date:22.02.2024 11:45
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Payment {
    private Long id;
    private Double amount;

    //manytoone
    private Xizmat xizmat;

    //manytoone
    private Card card;
}
