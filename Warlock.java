public class Warlock extends Character{
    //Warlock constructor inherits character class
    Warlock(String name){
        super(name,0, 250, 700);
    }
    //spell attack 1
    public void sagemode(Character enemyCharacter){
        manaPoints -= 100;
        System.out.println("\n" + characterName + " attacks " + enemyCharacter.characterName + "  sagemode(Damage - 20)");
        int damagePoints = 200;
        damageTarget(enemyCharacter, damagePoints);
    }
    //spell attack 2
    public void sharingan(Character enemyCharacter){
        manaPoints -= 30;
        System.out.println("\n" + characterName + " attacks " + enemyCharacter.characterName + " sharingan (Damage - 80)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
    }

    //recovery spell
    public void lifeSupport(){
        System.out.println("\nSaruman used recovery spell used");
        System.out.println("+50 HP");
        System.out.println("+95 MP");
        healthPoints += 50;
        manaPoints += 95;
    }
}
