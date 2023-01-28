public class Lion extends Predator implements Huntable {

    public Lion(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Lion"+getName()+" "+getAge()+" "+getColor();
    }

    @Override
    public void hunt() {
        System.out.println("Lion is big cat");
    }
}
