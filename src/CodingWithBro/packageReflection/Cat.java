package packageReflection;
// reflection = where code can look at itself to examine and change any element of any java class
//              right in the middle of a running program.

public class Cat {

    private final String name;
    private int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void meow() {
        System.out.println("Meow");
    }
    private void heyThisIsPrivate(){
        System.out.println("How did you call this??");
    }
    public static void thisIsAPublicMethod() {
        System.out.println("I am public and static");
    }
    private static void thisIsAPrivateMethod() {
        System.out.println("Hey, I am private and static");
    }
}

