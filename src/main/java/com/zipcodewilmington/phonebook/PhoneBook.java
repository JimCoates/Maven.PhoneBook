package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, Contact> contactList;
    private TreeMap<String, String> mapBook;

    public PhoneBook() {
        mapBook = new TreeMap<String, String>();
        contactList = new HashMap<String, Contact>();

    }

    public void add(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        contactList.put(name,newContact);
    }

    public String lookup(String name) {
        return mapBook.get(name);
    }

    public void clear() {
        mapBook.clear();
    }

    public void remove(String name) {
        mapBook.remove(name);
    }

    public String reverseLookUp(String phoneNumber) {
        String answer = "";

        for (String name : mapBook.keySet()) {
            if (mapBook.get(name).equals(phoneNumber)) {
                answer += name;
            }
        }
        return answer;
    }

    public Map<String , Contact> getContactList(){

        return contactList;
    }

    public void display() {

        Set<String> nameSet = mapBook.keySet();

         for(String names : nameSet){
           System.out.print(names + ": " + mapBook.get(names) + "\n");
        }
    }
}
