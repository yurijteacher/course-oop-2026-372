package ua.com.kisit.unit_3;

import java.util.Arrays;

public class MyString {

    static void main() {

        String text = "Hello";
        System.out.println(text.hashCode() +", " + text);

        text = text + ", Student!!";
        System.out.println(text.hashCode() + ", " + text);

        String text1 = "Hello";
        String text2 = "Hello";

        System.out.println(text1.hashCode() +","+ text2.hashCode());

        System.out.println(text1 == text2);

        String text3 = new String("Hello");
        System.out.println(text3.hashCode());

        System.out.println(text1 == text3);

        System.out.println(text1.equals(text3)); // !!

        char[] arr = text3.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String text4 = new String(arr);
        System.out.println(text4);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode());
        sb = sb.append(", Student!!");

        System.out.println(sb.hashCode() + ", " + sb);

        StringBuffer stringBuffer = new StringBuffer("Hello!");
        System.out.println(stringBuffer.hashCode() + ", " + stringBuffer);
        stringBuffer = stringBuffer.append(", Student!!");
        System.out.println(stringBuffer.hashCode() + ", " + stringBuffer);


        String text5 = "\n \t \r \f I study Java with my Teacher!!\n \f \r";

        System.out.print("\t" + text5.trim()+"\n");

        System.out.println(text5.toUpperCase().trim());
        System.out.println(text5.toLowerCase().trim().startsWith("i study"));

        System.out.println(text5.toLowerCase().trim().endsWith("!!"));

        System.out.println(text5.trim().replace('i', 'I'));

        System.out.println(text5.trim().replace("st", "__"));

        String text6 = "I study.Java,with.my Teacher!!";

        String[] arrays = text6.split("[\\.|\\,| ]");
        System.out.println(Arrays.toString(arrays));

        String text7 = new String(text6.toCharArray(), 2, 10);
        System.out.println(text7);



    }
}
