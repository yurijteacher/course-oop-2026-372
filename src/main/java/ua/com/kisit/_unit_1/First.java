package ua.com.kisit._unit_1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class First {

    static void main() {
        System.out.println("Hello Student!!");

        byte b = 127;
        short s = 12;
        int i = 0;
        long l = 5L;
        float f = 5f;
        double d = 10.22;
        char ch = 'a';
        boolean logic = true;

        System.out.println(b + ", " + s + ",");

        String st = "Hello!!";
        System.out.println(st.hashCode());

        st = st + " Student!";
        System.out.println(st.hashCode());

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        char ch1 = 'a';

        char[] array = {'H', 'E', 'L', 'L', 'O', '!'};

        System.out.println(array);

        String text = "Hello Student!";

        char[] array2 = text.toCharArray();
        String text2 = new String(array2);
        System.out.println(text2);

        int y = 0;
        y = y + 1;
        y++;

        for (int j = 0; j < array2.length; j++) {
            System.out.println(array2[j]);
        }

        int j = 0;
        while (j < array2.length) {
            System.out.println(array2[j]);
            j++;
        }

        j = 0;
        for (j = 0; j < 10; j++) {
            System.out.println(j);
        }

        j = 0;
        for (; j < 10; ) {
            System.out.println(j);
            j++;
        }

        //        for ( ; true ; ) {
        //            System.out.println(j);
        //            j++;
        //        }

        // v.1

        /*

        v.1
        author: Lozovyk
         */

        j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        int[] arr = {1, 2, 3, 4, 5, 65};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

        int k = 0;
        while (k < arr.length) {
            System.out.println(arr[k]);
            k++;
        }

        k = 0;
        do {
            System.out.println(arr[k]);
            k++;
        } while (k < arr.length);

        Stream
                .of(arr)
                .forEach(System.out::println);

        int[][] array3 = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};

        for (int m = 0; m < array3.length; m++) {
            System.out.println(Arrays.toString(array3[m]));
        }

        for (int m = 0; m < array3.length; m++) {
            for (int n = 0; n < array3[m].length; n++) {
                System.out.print(array3[m][n] + ",");
            }
            System.out.println();
        }

        Stream.of(array3).forEach(e -> Stream.of(e).forEach(e1 -> System.out.println(e1)));

        String[] array_text = {"Iva", "Ivan", "Ivanka"};

        Stream
                .of(array_text)
                .map(e -> e + ", Hello!")
                .forEach(e -> System.out.println(e));

        int age = 17;
        if (age < 17) {
            System.out.println("Мрлоод");
        } else if (age<20) {
            System.out.println("asdas");
        } else {
            System.out.println("asdas");
        }

        String operator = "div";

        switch (operator){
            case ("mul"):
                System.out.println(5*6);
                break;
            case ("div"):
                System.out.println(5/6);
                break;
            case ("add"):
                System.out.println(5+6);
                break;
            case ("sub"):
                System.out.println(5-6);
                break;
        }

        for (int m = 0; m < 10; m++) {
            if(m<5){
                System.out.println(m);
            }
        }


    }
}


