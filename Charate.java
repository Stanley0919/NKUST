import java.util.Locale;

public class Charate {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    String name;
    Charate getMyName;



    Charate(int roleHP, int roleMP, int roleATTACK) {
        HP = roleHP;
        MP = roleMP;
        ATTACK = roleATTACK;
    }
    void getCurrentStatus() {
        System.out.println("HP:" + HP);
        System.out.println("MP:" + MP);
        System.out.println("ATTACK:" + ATTACK);


    }
    String getMyName() {
        return this.name;
    }

    void ShoutMyName() {
        System.out.println("MY NAME IS "+ getMyName().toUpperCase() + "!" );
    }
}
