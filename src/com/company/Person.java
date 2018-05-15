package com.company;

public class Person {
    static int counter ;
    String firstName  ;
    String lastName ;
    String address ;
    int dateOfBirth ;
    String nationality;
    String city ;
    int weight;
    int height ;
    boolean isMale ;

    public Person() {
        counter++;
    }

    public Person(String firstName,String lastName,String address,int dateOfBirth,String nationality,String city,int weight,int height,boolean isMale) {
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return 2018 - dateOfBirth;
    }

    public double getHeightInFeet() {
        return (height/30.48);
    }

    public String eating() {
        return "I’m eating!";
    }

    public String getInfo() {
        return "Name: " + this.getFullName() + "\nAdress: " + address +
                "\nAge: " + this.getAge() + "\nNationality: " + nationality +
                "\nCity: " + city + "\nWeight: " + weight + "\nHeight: " + height;
    }
}
