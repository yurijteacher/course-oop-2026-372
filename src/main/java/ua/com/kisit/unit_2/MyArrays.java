package ua.com.kisit.unit_2;

import java.util.Arrays;

public class MyArrays {

    static void main(String[] args) {

        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 1;
        array[1][1] = 1;
        array[1][2] = 1;

        array[2][0] = 3;
        array[2][1] = 2;
        array[2][2] = 1;

        array[3][0] = 5;

        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }

    }

}
