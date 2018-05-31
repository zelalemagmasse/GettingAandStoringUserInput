package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input= new Scanner(System.in );
        String firstInitial;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city;

        System.out.println("please Enter your First name,last Name,House number,StreetName,StreetType and City");
        firstInitial=input.nextLine();
           lastName = input.nextLine();
        houseNumber = input.nextInt();
         streetName = input.nextLine();
          streetType = input.nextLine();
               city = input.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}
