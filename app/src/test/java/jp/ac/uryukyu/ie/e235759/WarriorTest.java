package jp.ac.uryukyu.ie.e235759;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void WarriorTest(){
        for(int n = 0; n<3; n++){
            int defaultHeroHp = 100;
            Warrior demoAttack = new Warrior("demoHero", defaultHeroHp, 10); 
            Warrior slim = new Warrior("スライムもどき", defaultHeroHp, 10);
            demoAttack.attackWithWeponSkill(slim);
            assertEquals(demoAttack.getAttack()*1.5,defaultHeroHp - slim.getHitPoint());
        }
    }
}