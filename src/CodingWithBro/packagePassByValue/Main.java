package packagePassByValue;

public class Main {
    public static void main(String[] args) {
        Cheese myCheese = new Cheese();
        myCheese.setLevelOfStinkiness(10);

        increaseStinkiness(myCheese);

        System.out.println(myCheese.getLevelOfStinkiness());
    }
    // Cheese cheese is object being initialized in parameter
    private static void increaseStinkiness(Cheese cheese) {

        // value is still 10, why?
        // cheese is creating a new object with a different address in memory
        // new cheese object is pointing to a different object, not myCheese
        cheese = new Cheese();
        // has no impact on the myCheese variable that was passed in hence the output is 10 still
        cheese.setLevelOfStinkiness(123123);

        //cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 1);
    }


}
