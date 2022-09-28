public class CatRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class "blueprint"
        Cat cat1 = new Cat("Sparky", 7, 6.3);
        cat1.introduce();  // calling a method on the object
        cat1.printCatInfo();

        Cat cat2 = new Cat("Junior", 3, 5.4);
        cat2.introduce();  // calling a method on the object
        cat2.printCatInfo();
    }
}