package org.example.AddressBook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AddressBookDataIOService<T> implements AddressBookInterface<T> {

    public static final String FILE_PATH = "C:\\Users\\Poojitha\\IdeaProjects\\Review5\\src\\main\\java\\org\\example\\AddressBook\\datafile.txt";

    @Override
    public boolean writeDataToDestination(List<T> sourceDataList) throws IOException {
        StringBuffer empBuffer = new StringBuffer();
        sourceDataList.forEach(empData -> {
            String empString = empData.toString().concat("\n");
            empBuffer.append(empString);
        });
        Path path = Files.write(Paths.get(FILE_PATH), empBuffer.toString().getBytes());
        return path != null ? true : false;
    }

    @Override
    public void readDataFromSource() throws IOException {

        Files.lines(new File(FILE_PATH).toPath()).forEach(empData -> System.out.println(empData));

    }
}
