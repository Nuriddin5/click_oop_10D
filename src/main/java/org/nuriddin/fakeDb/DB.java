package org.nuriddin.fakeDb;

import org.nuriddin.enums.Role;
import org.nuriddin.model.User;

import java.util.ArrayList;

/**
 * User:t.me/supermatematikuz
 * Date:23.02.2024 11:38
 */
public class DB {
    public static ArrayList<User> userList = new ArrayList<>(){{
        add(new User(1L,"Nuriddin Aliy",99890114423L,11111,0, Role.ADMIN));
        add(new User(2L,"Usmon",99890114422L,55555,0, Role.USER));
    }};


}
