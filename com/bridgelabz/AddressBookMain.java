package com.bridgelabz;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    ArrayList<ContactDetails> details =  new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addContact(){
        ContactDetails d1 = new ContactDetails();
        System.out.println("Enter FirstName");
        d1.setFirstName(sc.nextLine());
        System.out.println("Enter the LastName");
        d1.setLastName(sc.nextLine());
        System.out.println("Enter the Address");
        d1.setAddress(sc.nextLine());
        System.out.println("Enter a City");
        d1.setCity(sc.nextLine());
        System.out.println("Enter State");
        d1.setState(sc.nextLine());
        System.out.println("Enter Email");
        d1.setEmail(sc.nextLine());
        System.out.println("Enter Zip Code");
        d1.setZip(sc.nextInt());
        System.out.println("Enter Phone Number");
        d1.setPhoneNumber(sc.nextLong());
        details.add(d1);
    }

    public void show(){
        System.out.println(details);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");

            AddressBookMain a1 = new AddressBookMain();
            a1.addContact();
            a1.show();
    }
}
