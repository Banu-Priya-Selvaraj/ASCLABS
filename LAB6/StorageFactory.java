package LAB6;

import java.io.IOException;

public class StorageFactory {

    public static StorageFileImpl getFileStorage(String filePath) throws IOException {
        return new StorageFileImpl(filePath);
    }

    public static void main(String[] args) {
        try {
            Storage storage = StorageFactory.getFileStorage("storage.txt");
            storage.save("key1", "value1");
            System.out.println("Loaded key1: " + storage.load("key1"));
            storage.delete("key1");
            System.out.println("Loaded key1 after deletion: " + storage.load("key1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

