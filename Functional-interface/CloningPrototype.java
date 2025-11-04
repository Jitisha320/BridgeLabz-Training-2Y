class Prototype implements Cloneable {
    int id;
    Prototype(int id) { this.id = id; }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype obj1 = new Prototype(101);
        Prototype obj2 = (Prototype) obj1.clone();
        System.out.println("Cloned object ID: " + obj2.id);
    }
}