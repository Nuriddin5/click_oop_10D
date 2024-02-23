package org.nuriddin.model;

import lombok.*;

/**
 * User:t.me/supermatematikuz
 * Date:22.02.2024 11:08
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SubCategory {
    private Long id;
    private String name;

    //manyToOne
    private Category fCategory;

}
