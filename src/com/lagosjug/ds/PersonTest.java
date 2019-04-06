package com.lagosjug.ds;

public class PersonTest {

    public static void main(String... args) {
        Person person1 = new Person("Peter","Stone",25);
        Person person2 = new Person("Peter","Edwards",27);

        System.out.println(person1.compareTo(person2));

    }
}
