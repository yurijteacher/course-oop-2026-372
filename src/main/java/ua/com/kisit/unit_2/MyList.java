package ua.com.kisit.unit_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList {

    static void main() {

        List<Integer> listInteger = List.of(1,2,3,4,5);
        System.out.println(listInteger);
        // listInteger.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        list2.add(4);
        System.out.println(list2);

        list2.set(1, 10);
        System.out.println(list2);
        list2.add(1, 100);
        System.out.println(list2);

        list2.remove(2);
        System.out.println(list2);

        list2.clear();
        System.out.println(list2);

        List<String> stringList = new ArrayList<>();
        stringList.add("C++");
        stringList.add("Java");
        stringList.add("C#");
        System.out.println(stringList);

        Users user1 = new Users();
        user1.setId(1L);
        user1.setFirstName("Vasya");
        user1.setLastName("Pypkin");
        user1.setAge(25);

        System.out.println(user1);

        Users user2 = new Users(2L, "Iva", "Pypkina", 18);
        Users user3 = new Users(3L, "Ivanna", "Pypkina", 20);

        List<Users> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(users);

        List<Users> sortedUserByAge = users
                                            .stream()
                                            .sorted(Comparator.comparing(Users::getAge))
                                            .toList();

        Integer min_age = users
                                .stream()
                                        .min(Comparator.comparing(Users::getAge))
                                        .get()
                                        .getAge();

        System.out.println(min_age);

        System.out.println(sortedUserByAge);

        List<Users> sortedUserByAge2 = users
                                            .parallelStream()
                                            .sorted(Comparator.comparing(Users::getAge))
                                            .toList();

        System.out.println(sortedUserByAge2);

        List<String> userString = users.parallelStream().map(e-> e.getFirstName() + " "+ e.getLastName() + ", Hello!!").toList();
        System.out.println(userString);

        users.add(user3);
        System.out.println(users);

    }
}
