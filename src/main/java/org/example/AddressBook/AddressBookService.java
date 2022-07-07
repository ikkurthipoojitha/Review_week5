package org.example.AddressBook;

import java.io.IOException;
import java.util.List;

public class AddressBookService {

    public enum IOService {
        FILE_IO,CONSOLE_IO
    }

    List<Person> contactList;

    public AddressBookService() {
    }

    public AddressBookService(List<Person> contactList) {
        this.contactList = contactList;
    }

    public boolean writeAddressBookData(IOService ioType) {
        AddressBookInterface addressBookInterface = null;
        if (IOService.FILE_IO.equals(ioType)) {
            addressBookInterface = new AddressBookDataIOService();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            addressBookInterface = new AddressBookDataIOService();
        }

        try {
            return addressBookInterface.writeDataToDestination(contactList);
        } catch (IOException e) {
            System.out.println("Exception Caught");
        }
        return false;
    }

    public void readAddressBookData(IOService ioType) {
        AddressBookInterface addressBookInterface = null;
        if (IOService.FILE_IO.equals(ioType)) {
            addressBookInterface = new AddressBookDataIOService();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            addressBookInterface = new AddressBookDataIOService();
        }
        try {
            addressBookInterface.readDataFromSource();
        } catch (IOException e) {
            System.out.println("Exception Caught");
        }

    }

}
