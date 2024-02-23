package org.nuriddin.model;

import org.nuriddin.enums.CardType;
import org.nuriddin.enums.Month;

import java.util.ArrayList;
import java.util.List;

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

    //manyToOne
    User holder;

    public Card() {
    }

    public Card(Long id, String number, Integer year, Month month, CardType type, User holder) {
        this.id = id;
        this.number = number;
        this.year = year;
        this.month = month;
        this.type = type;
        this.holder = holder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", type=" + type +
                ", holder=" + holder +
                '}';
    }
}
