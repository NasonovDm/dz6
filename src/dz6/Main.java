package dz6;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cat: ");
        Animal Agata = new Cat(200,2,2);
        Agata.run(1450);
        Agata.swim(1);
        Agata.jump(2);

        System.out.println("Dog: ");
        Animal Bobik = new Dog(500,3,2);
        Bobik.run(400);
        Bobik.swim(2);
        Bobik.jump(5);




    }
}




