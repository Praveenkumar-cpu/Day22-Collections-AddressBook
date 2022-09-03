package com.bridgelabz;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

            AddressBook address = new AddressBook();

            int i=0;
            while (i==0){
                System.out.println("Welcome to AddressBook");
                System.out.println("Choose option 1: ADD  2: EDIT 3: SHOW 4: DELETE");
                int choose = sc1.nextInt();
                switch (choose){
                    case 1:
                        address.addContact();
                        break;
                    case 2:
                        address.editContact();
                        break;
                    case 3:
                        address.show();
                        break;
                    case 4:
                        address.deleteDetails();
                        break;
                    default:
                        System.out.println("Enter Correct Details");
                        break;
                }

            }

    }
}
