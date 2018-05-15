package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person();
        p.firstName = "Ahmad";
        p.lastName = "Alyaaqba";
        p.address = "Amman";
        p.dateOfBirth = 1991;
        p.nationality = "Jordan";
        p.city = "Amman";
        p.weight = 89;
        p.height = 174;
        System.out.println(p.getInfo());
        System.out.println(p.getHeightInFeet());

//        Person a[];
        Person[] arr = new Person[4];

    }
}
