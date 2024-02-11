import jp.ac.uryukyu.ie.e235759.*;

public class Main {
    public static void main(String[] args){
        Warrior hero = new Warrior("勇者", 10, 10);
        Enemy enemy = new Enemy("スライム", 3, 2);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attackWithWeponSkill(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}