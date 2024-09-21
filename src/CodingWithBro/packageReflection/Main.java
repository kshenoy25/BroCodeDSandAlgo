package packageReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Fiona", 2);
        // window for reflection capabilities
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                // the reflection concept at work
                field.setAccessible(true);
                field.set(myCat, "Nona");
            }
        }
        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for (Method method : catMethods) {
            if (method.getName().equals("thisIsAPrivateMethod")) {
                method.setAccessible(true);
                method.invoke(null);
                //method.invoke(myCat);
                //myCat.meow();
            }
            //System.out.println(method.getName());
        }

        //System.out.println(myCat.getName());
    }
}
