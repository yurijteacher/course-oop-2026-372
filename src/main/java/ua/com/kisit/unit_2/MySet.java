package ua.com.kisit.unit_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet {

    static void main() {

        Users user1 = new Users();
        user1.setId(1L);
        user1.setFirstName("Vasya");
        user1.setLastName("Pypkin");
        user1.setAge(25);


        Users user2 = new Users(2L, "Iva", "Pypkina", 18);
        Users user3 = new Users(3L, "Ivanna", "Pypkina", 20);

        Set<Users> usersSet = new HashSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user3);

        System.out.println(usersSet);

        Users user4 = new Users(4L, "Ivanna", "Pypkina", 20);

        usersSet.add(user4);
        System.out.println(usersSet);



    }
}
