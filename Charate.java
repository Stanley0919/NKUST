public class Charate {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    String name;
    Charate getMyName;
    String Weapon;
    String Skill;
    String Att;

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
    String getMySkill() {
        return this.Skill;
    }

    void MySkill() {
        System.out.println("看招吧 " +  getMySkill().toString() + "!" );
    }

    String getMyWeapon () { return this.Weapon;}

    void Weapon() {System.out.println("我的武器是" + getMyWeapon().toString() + "!"  );}

    String getMyAtt(){ return this.Att; }

    void  Att() {System.out.println("嘿嘿用普攻偷摸你一下 " +getMyAtt().toString()  );}
}

