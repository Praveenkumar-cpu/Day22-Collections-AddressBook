package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<ContactDetails> details =  new ArrayList<ContactDetails>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter the number of contacts you want to enter");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the contact details of person ");
            mulContact();
        }
    }

    public void mulContact() {
        ContactDetails person = new ContactDetails();
        System.out.println("Enter First Name : ");
        String firstName = sc.next();
        System.out.println("Enter Last Name : ");
        String lastName = sc.next();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter City : ");
        String city = sc.next();
        System.out.println("Enter State : ");
        String state = sc.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = sc.nextInt();
        System.out.println("Enter Mobile Number : ");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter EmailId : ");
        String email = sc.next();
        person = new ContactDetails(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        details.add(person);
        show();
    }

    public void show(){
        System.out.println(details);
        for (int i=0; i<details.size();i++){
            System.out.println("Contact Details");
            System.out.println("Name         : " +details.get(i).getFirstName() + " "
                    + details.get(i).getLastName() + "\n" + "Address      : "
                    + details.get(i).getAddress() + "\n" + "City         : "
                    + details.get(i).getCity() + "\n" + "State        : "
                    + details.get(i).getState() + "\n" + "ZipCode      : "
                    + details.get(i).getZip() + "\n" + "MobileNumber : "
                    + details.get(i).getEmail() + "\n" + "EmailId      : "
                    + details.get(i).getPhoneNumber() + "\n");
        }
    }


    public void deleteDetails(){
        System.out.println("Enter firstName to delete");
        String name = sc.next();
        for (int i=0; i<details.size(); i++){
            if(details.get(i).getFirstName().equalsIgnoreCase(name)){
                details.remove(i);
                System.out.println("Deleted "+ details);
            }else {
                System.out.println("Enter valid name");
            }
        }
    }

    public void editContact() {

        System.out.println("Enter FirstName to edit");
        String name = sc.next();
        for (int i = 0; i < details.size(); i++) {
            if (details.get(i).getFirstName().equalsIgnoreCase(name)) {
                addContact();
            } else {
                System.out.println("Entered name is not match");
                editContact();

            }

        }

    }
}
