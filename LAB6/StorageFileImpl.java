package LAB6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StorageFileImpl implements Storage {
    private final File file;
    private Map<String, String> dataMap;

    public StorageFileImpl(String filePath) throws IOException {
        this.file = new File(filePath);
        this.dataMap = new HashMap<>();
        if (file.exists()) {
            loadFromFile();
        }
    }

    @Override
    public void save(String key, String value) throws IOException {
        dataMap.put(key, value);
        saveToFile();
    }

    @Override
    public String load(String key) throws IOException {
        return dataMap.get(key);
    }

    @Override
    public void delete(String key) throws IOException {
        dataMap.remove(key);
        saveToFile();
    }

    private void loadFromFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    dataMap.put(key, value);
                }
            }
        }
    }

    private void saveToFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Storage storage = new StorageFileImpl("storage.txt");
            storage.save("key1", "value1");
            System.out.println("Loaded key1: " + storage.load("key1"));
            storage.delete("key1");
            System.out.println("Loaded key1 after deletion: " + storage.load("key1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

