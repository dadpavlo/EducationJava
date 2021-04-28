public class Main {
    public static void main(String args []) {
        TankDestroyer FV4005 = new TankDestroyer("FV4005 STAGE II", "FV4005 STAGE II", "FV4005 STAGE II");
        FV4005.shoot();
        FV4005.tankDestroy();
    }
}

class tank implements ActionTank{
    private String track, turret, gun;

    public tank(String track, String turret, String gun) {
        this.track = track;
        this.turret = turret;
        this.gun = gun;
    }

    public void shoot() {
        System.out.println("The tank fired a shot");
    }

    public void drive() {
        System.out.println("The tank started moving");
    }


}

interface ActionTank {
    void shoot();
    void drive();

}

class TankDestroyer extends tank {

    public void tankDestroy() {
        System.out.println("tank destroy");
    }
    public TankDestroyer(String track, String turret, String gun) {
        super(track, turret, gun);
    }
}
