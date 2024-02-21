package org.nuriddin.model;

import org.nuriddin.enums.CardType;
import org.nuriddin.enums.Month;

/**
 * User:t.me/supermatematikuz
 * Date:21.02.2024 11:17
 */
public class Card {
    private Long id;
    private String number;
    private Integer year;
    private Month month;

    private CardType type;
}