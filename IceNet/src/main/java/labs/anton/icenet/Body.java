package labs.anton.icenet;

import java.util.HashMap;

/**
 * Created by anton on 10/17/14.
 */
public class Body {
    private final HashMap<String, Object> body;

    public Body(Builder builder) {
        this.body = builder.body;
    }

    HashMap<String, Object> getBody() {
        return body;
    }

    public static class Builder {
        private String key;
        private String value;
        private HashMap<String, Object> body = new HashMap<String, Object>();

        public Builder add(String key, Object value) {
            body.put(key, value);
            return this;
        }

        public Body build() {
            return new Body(this);
        }
    }
}
