package com.nbicocchi.exercises.classes;

import java.time.LocalDate;

public class Person {
    String name;
    String lastname;
    LocalDate birthday;

    public Person(String name, String lastname, LocalDate birthday) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public String getFullName() {
        return name + " " + lastname;
    }

    public static void main(String[] args) {
        Person p1 = new Person(
                "John",
                "Doe",
                LocalDate.of(1990, 1, 1));
        Person p2 = new Person(
                "Mario",
                "Rossi",
                LocalDate.of(2000, 1, 1));

        System.out.println(p1.name + " " + p1.lastname);
        System.out.println(p2.getFullName());
    }
}
