class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("John", 1);
        Worker waiter = new Waiter("Mike", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}