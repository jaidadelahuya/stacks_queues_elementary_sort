package com.lagosjug.ds;

public class Person implements Comparable<Person>{


    String firstName,lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        //compare first name of this person with first name of another person
        int value = firstName.compareTo(o.firstName);
        //check if the first names are equal
        if(value == 0) {
            //compare the last name of this persoon with last name of the other person
           value = lastName.compareTo(o.lastName);
        }
        return value;
    }
}
