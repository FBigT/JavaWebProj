package good.stuff.webstore.utils;

import java.lang.reflect.Field;

public class EntityUtils {

    private EntityUtils() {
    }

    public static <T> void copyNonNullProperties(T source, T target) {
        Field[] fields = source.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(source);
                if (value != null) {
                    field.set(target, value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to copy properties", e);
            }
        }
    }
}
