public class Main {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setName("Rudolf");
        dog.setWeight(28);

        System.out.println(dog);
        dog.bark();
        System.out.println();

        Puppy puppy=new Puppy();
        puppy.setName("Fluffy");
        puppy.setWeight(8.9);

        System.out.println(puppy);
        puppy.bark();
    }
}
