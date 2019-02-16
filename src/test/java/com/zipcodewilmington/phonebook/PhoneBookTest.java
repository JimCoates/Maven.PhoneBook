package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    private PhoneBook myBook;

    @Before
    public void setup() {
        myBook = new PhoneBook();
    }

    @After
    public void tearDown() {
        myBook.clear();
    }



    @Test
    public void removeTest() {
        //Given
        myBook.add("Sean", "222-111-1111");
        myBook.remove("Sean");
        String expected = null;

        //When
        String actual = myBook.lookup("Sean");

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testReverseLookUp(){
        myBook.add("Mike", "333-333-3333");
        String expected = "";
        String actual = myBook.reverseLookUp("333-333-3333");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDisplay(){
        myBook.add("Neela","222-222-2222");
        myBook.add("Cara","333-444-5555");

        myBook.display();
    }

    @Test
    public void addContactTest(){
        String contactName = "Eugene";
        String contactNumber = "44405050505";
        myBook.add(contactName, contactNumber);
        Contact newlyAddedContact = myBook.getContactList().get("Eugene");

        Assert.assertEquals(newlyAddedContact.getPhoneNBumbers().contains(contactNumber), true);
        Assert.assertEquals(newlyAddedContact.getContactName().contains(contactName), true);
    }
}
