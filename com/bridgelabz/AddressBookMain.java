package com.bridgelabz;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {

    ArrayList<ContactDetails> details =  new ArrayList<>();
  static Scanner sc = new Scanner(System.in);
 static  Scanner sc1 = new Scanner(System.in);
    static  Scanner sc2 = new Scanner(System.in);

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
        d1.setZip(sc1.nextInt());
        System.out.println("Enter Phone Number");
        d1.setPhoneNumber(sc1.nextLong());
        details.add(d1);
    }


    public void editContact() {

        System.out.println("Enter FirstName to edit");
        String name = sc2.next();
        for (int i = 0; i < details.size(); i++) {
            if (details.get(i).getFirstName().equalsIgnoreCase(name)) {
                addContact();
            } else {
                System.out.println("Entered name is not match");
                editContact();

            }

        }

    }

    public void show(){
        System.out.println(details);
    }

    public static void main(String[] args) {

            AddressBookMain a1 = new AddressBookMain();

            int i=0;
            while (i==0){
                System.out.println("Welcome to AddressBook");
                System.out.println("Choose option 1: ADD  2: EDIT 3: SHOW");
                int choose = sc1.nextInt();
                switch (choose){
                    case 1:
                        a1.addContact();
                        break;
                    case 2:
                        a1.editContact();
                        break;
                    case 3:
                        a1.show();
                        break;
                    default:
                        System.out.println("Enter Correct Details");
                        break;
                }

            }

    }
}
