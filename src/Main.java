import java.lang.reflect.Array;

public class Main {
    public static void main(String args []) {
        TankDestroyer FV4005 = new TankDestroyer("183 MM L4", "FV4005 STAGE II", 1850, 1750);
        FV4005.getInfo();
        FV4005.drive();
        Car kiaRio = new Car("Kia Rio", 2000);
        kiaRio.stop();

    }
}

class Tank implements machine{
    private String gun, name;
    private Integer headPoint, damage;

    public Tank(String gun, String name, Integer headPoint, Integer damage) {
        this.gun = gun;
        this.name = name;
        this.headPoint = headPoint;
        this.damage = damage;
    }

    public void shoot() {
        System.out.println("The tank fired a shot");
    }
    public void getInfo()  {
        System.out.println("Name of the tank : " + name +"\n"
                            + "his gun : " + gun + "\n");
    }


    @Override
    public void drive() {
        System.out.println(name + " started moving");
    }

    @Override
    public void stop() {
        System.out.println(name + " stopped moving");
    }
}
interface machine {
    void drive();
    void stop();
}

class TankDestroyer extends Tank {

    public void tankDestroy() {
        System.out.println("tank destroy");
    }
    public TankDestroyer(String gun, String name, Integer headPoint, Integer damage) {
        super(gun, name, headPoint, damage);
    }
}
class Car implements machine {
    private String name;
    private Integer yearOfCreation;

    public Car(String name, Integer yearOfCreation) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public void drive() {
        System.out.println(name + " started moving");
    }

    @Override
    public void stop() {
        System.out.println(name + " stopped of moving");
    }
}