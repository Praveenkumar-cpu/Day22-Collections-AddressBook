package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");

        ContactDetails con = new ContactDetails("Praveen","PGB","Bagalkot","Gld","Kar","praveen@gmail.com",587203,944978842);
        System.out.println("Contact Details are");
        System.out.println("First Name :"+con.getFirstName());
        System.out.println("Last Name :"+con.getLastName());
        System.out.println("Address : "+con.getAddress());
        System.out.println("City"+con.getCity());
        System.out.println("State:"+con.getState());
        System.out.println("Email:"+con.getEmail());
        System.out.println("PhoneNumber"+con.getPhoneNumber());
    }
}
