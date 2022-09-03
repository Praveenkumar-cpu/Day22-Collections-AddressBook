package com.bridgelabz;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

            MultipleAddressBook mul = new MultipleAddressBook();

            int i=0;
            while (i==0){
                System.out.println("Welcome to AddressBook");
                System.out.println("Choose option 1: ADD  2: EDIT 3: SHOW 4: DELETE");
                int choose = sc1.nextInt();
                switch (choose){
                    case 1:
                        mul.addAddressBook();
                        break;
                    case 2:
                        mul.addContact();
                        break;
                    case 3:
                        mul.editContactInBook();
                        break;
                    case 4:
                        mul.deleteContactInBook();
                        break;
                    case 5:
                        mul.deleteAddressBook();
                    case 6:
                        mul.printBook();
                    case 7:
                        mul.printContactsInBook();
                    default:
                        System.out.println("Enter Correct Details");
                        break;
                }

            }

    }
}
