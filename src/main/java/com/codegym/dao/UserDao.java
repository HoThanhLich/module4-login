package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
         User u1 = new User("john", "12346", "John", "john@codegym.vn", 20);
         User u2 = new User("bell", "123789", "Bell", "bell@codegym.vn", 20);
         User u3 = new User("lich", "123654", "John", "john@codegym.vn", 20);
         User u4 = new User("býcbjy", "12346", "John", "john@codegym.vn", 20);
         users.add(u1);
         users.add(u2);
         users.add(u3);
         users.add(u4);
    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
