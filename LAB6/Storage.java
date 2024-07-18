package LAB6;

import java.io.IOException;

public interface Storage {
    void save(String key, String value) throws IOException;
    String load(String key) throws IOException;
    void delete(String key) throws IOException;
}

