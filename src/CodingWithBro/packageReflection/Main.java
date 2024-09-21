package packageReflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Fiona", 2);
        // window for reflection capabilities
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Nona");
            }
        }
    }
}
