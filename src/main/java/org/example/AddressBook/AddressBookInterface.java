package org.example.AddressBook;

import java.io.IOException;
import java.util.List;

public interface AddressBookInterface<T> {
    boolean writeDataToDestination(List<T> sourceDataList) throws IOException;
    void readDataFromSource() throws IOException;
}
