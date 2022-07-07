package org.example.AddressBook;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

    @Test
    void givenPersonsWhenWrittenToFileShouldMatchPersonEntries() {
        Person addressBookData1 = new Person("a","b","abc@gmail.com","AndhraPradesh","Vij");
        Person addressBookData2 = new Person("bc","last","last@gmail.com","Telangana","Hyd");
        Person addressBookData3 = new Person("First","name","first@gmail.com","Telangana","Hyderabad");

        List<Person> contact = new ArrayList<>();
        contact.add(addressBookData1);
        contact.add(addressBookData2);
        contact.add(addressBookData3);

        AddressBookService addressBookService = new AddressBookService(contact);
        addressBookService.writeAddressBookData(AddressBookService.IOService.FILE_IO);
        addressBookService.readAddressBookData(AddressBookService.IOService.FILE_IO);

    }
}
