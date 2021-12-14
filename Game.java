public class Game {
    public static void main(String[] args) {
        Charate Shooter = new Charate(15,10 ,30);
        Shooter.getCurrentStatus();
        System.out.println("----------------------------");
        Charate Warrior = new Charate(20,5,15);
        Warrior.getCurrentStatus();
        System.out.println("----------------------------");
        Charate Magician = new Charate(10,30,40);
        Magician.getCurrentStatus();
    }
}
