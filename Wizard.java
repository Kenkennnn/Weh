public class Wizard extends Character{

    //calls the constructor of the base class
    Wizard(String name){
        super(name, 0, 250, 300);
    }

    //spell attack 1
    public void haduken(Character enemyCharacter){
        manaPoints -= 20;
        System.out.println("\n" + characterName + " attacks " + enemyCharacter.characterName + " with haduken (Damage - 50)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
    }

    //spell attack 2
    public void Bankai(Character enemyCharacter){
        manaPoints -= 50;
        System.out.println("\n" + characterName + " attacks " + enemyCharacter.characterName + " Bankai(Damage - 90)");
        int damagePoints = 90;
        damageTarget(enemyCharacter, damagePoints);
    }

    //recovery spell
    public void Healing(){
        System.out.println("\nMerlin used recovery spell");
        System.out.println("+70 HP");
        System.out.println("+50 MP");
        healthPoints += 70;
        manaPoints += 50;
    }

}
