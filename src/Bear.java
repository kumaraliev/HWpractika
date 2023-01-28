public class Bear extends Predator implements Huntable {

    public Bear(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Bear"+getName()+" "+getAge()+" "+getColor();
    }

    @Override
    public void hunt() {
        System.out.println("Bear is a wild animal");
    }
}
