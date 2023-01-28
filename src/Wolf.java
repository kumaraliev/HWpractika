public class Wolf extends Predator implements Huntable {

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void hunt() {
        System.out.println("Wolf is wild beast");
    }

    }

