package com.example.people;

import com.example.people.identification.Passport;

public class Person {
    //zde to, co nemá být vidět z venčí -> před definici dáme "private"
 private String givenName;
 private String surname;
 private String dateOfBirth;

 public Person (String givenName, String surname) {
     //když nedefinuji co vrací, tak je to constructor
     this.givenName = givenName;
     //dateOfBirth = "Neznám" nefunguje
 }

    public Person (String givenName, String surname, String dateOfBirth) {
        //druhy konstruktor má více argumentů
     this.givenName = givenName;
     this.surname = surname;
     this.dateOfBirth = dateOfBirth;
    }


    //void nevrací hodnotu

 public void setGivenName(String givenName) {
     this.givenName = givenName;
 }
 public String getGivenName() {
     return givenName;
 }

 //alt + insert


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void obtainPassport () {
     this.passport = new Passport(111);
    }

    @Override
    public String toString() {
        return "Person{" +
                "givenName='" + givenName + '\'' +
                '}';
    }
}

