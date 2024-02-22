package org.nuriddin.model;

/**
 * User:t.me/supermatematikuz
 * Date:22.02.2024 11:45
 */
public class Transfer {
    private Long id;
    private Double amount;

    //manytoone
    private Card sender;

    //manytoone
    private Card receiver ;
}
