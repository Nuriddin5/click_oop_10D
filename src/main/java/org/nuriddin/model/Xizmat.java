package org.nuriddin.model;

/**
 * User:t.me/supermatematikuz
 * Date:22.02.2024 11:41
 */
public class Xizmat {
    private Long id;
    private String name;
    private Double cashbackInPercent;
    private Double xizmatHaqqi;
    private Double minTolov;

    //manyToOne
    private SubCategory subCategory;


}
