public class Game {
    public static void main(String[] args) {

        System.out.println("射手");
        Charate Shooter = new Charate(15,10 ,30);
        Shooter.getCurrentStatus();
        //Shooter.ShoutMyName();
        System.out.println("----------------------------");

        System.out.println("戰士");

        Charate Warrior = new Charate(20,5,15);
        Warrior.getCurrentStatus();
       // Warrior.ShoutMyName();
        System.out.println("----------------------------");

        System.out.println("魔法師");
        Charate Magician = new Charate(10,30,40);
        Magician.getCurrentStatus();
        Magician.ShoutMyName();
    }
}
