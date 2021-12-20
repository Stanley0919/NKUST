public class Game {
    public static int chooseCareer;

    public static void main(String[] args) {

        System.out.println("射手");
        Charate Shooter = new Charate(15,10 ,30);
        Shooter.Skill = "霹靂卡霹靂拉拉貝貝魯多" ;
        Shooter.Weapon = "弓箭";
        Shooter.Att = "射進你的心";
        Shooter.getCurrentStatus();
        Shooter.Weapon();
        Shooter.Att();
        Shooter.MySkill();

        System.out.println("----------------------------");

        System.out.println("戰士");
        Charate Warrior = new Charate(20,5,15);
        Warrior.Skill = "萬屎光芒";
        Warrior.Weapon = "大劍";
        Warrior.Att = "我一個大刀闊斧";
        Warrior.getCurrentStatus();
        Warrior.Weapon();
        Warrior.Att();
        Warrior.MySkill();

        System.out.println("----------------------------");

        System.out.println("魔法師");
        Charate Magician = new Charate(10,30,40);
        Magician.Skill = "動感光波";
        Magician.Weapon = "法杖";
        Magician.Att = "吃我火球";
        Magician.getCurrentStatus();
        Magician.Weapon();
        Magician.Att();
        Magician.MySkill();

    }
}
