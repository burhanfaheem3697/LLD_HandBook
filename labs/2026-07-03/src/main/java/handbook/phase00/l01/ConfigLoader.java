package handbook.phase00.l01;

import java.util.*;

public class ConfigLoader {

    private Map<String, String> configs = new HashMap<>();

    public void setConfig(String key, String value) {
        configs.put(key, value);
    }

    public String getConfig(String key) {
        String value = configs.get(key);
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Missing required config : " + key);
        }

        return value;

    }

}
