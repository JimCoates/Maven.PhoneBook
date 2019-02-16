package com.zipcodewilmington.phonebook;
import java.util.ArrayList;

//Eugene walked us through the process of creating a contact list

public class Contact {
    private ArrayList<String> phoneNumbers;
    private ArrayList<String> contactName;

    //Created default contructor
    public Contact(){
        phoneNumbers = new ArrayList<String>();
        contactName = new ArrayList<String>();

    }
    //created a constructor for passing in arguments of name and number
    public Contact(String initialName, String initialNumber){

        phoneNumbers = new ArrayList<String>();
        contactName = new ArrayList<String>();

        contactName.add(initialName);
        phoneNumbers.add(initialNumber);
    }
//setter for contact name
    public void setContactNames(ArrayList contactName){

        this.contactName = contactName;
    }
//setter for phone number
    public void setPhoneNumbers(ArrayList phoneNumbers){

        this.phoneNumbers = phoneNumbers;
    }
//getter for phone number
    public  ArrayList<String> getPhoneNBumbers(){

        return phoneNumbers;
    }
//setter for phone number
    public ArrayList<String> getContactName(){

        return contactName;
    }
//method for adding name
    public void addContactName(String name){

        contactName.add(name);
    }
//method for adding number
    public void addContactNumber(String number){

        phoneNumbers.add(number);
    }
}
