package org.example.AddressBook;

import java.util.List;

public class AddressBookConsoleIOService<T> implements AddressBookInterface<T> {


    public boolean writeDataToDestination(List<T> sourceDataList) {
        return false;
    }

    @Override
    public void readDataFromSource() {

    }
}