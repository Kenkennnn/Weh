public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;


    //**
    // two Constructors
    //1 Non-Parameterized Constructor
    //2 Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    Character(String Name, int lvl, int Healthave, int Mana) {
        characterName = Name;
        level = lvl;
        healthPoints = Healthave;
        manaPoints = Mana;
    }

    // Method that displays the Name of the Character
    public void displaycharacterName() {
        System.out.println("Character Initialized : " + characterName);
    }

    // Method Damage Target
    public void damageTarget(Character enemyCharacter, int damagePoints) {


        //Display the remaining health of the enemy
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);


        //Level up Method (when the enemycharacter hp fell to zero)
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            levelUp();

        }

    }
    // +10 Level Up Character
    private void levelUp() {
        level+=10;
        System.out.println("characterName + " + " Level Up ");
    }

    //displays the character details
    public void displaydetails(){
        System.out.println("Wizard : " + characterName);
        System.out.println("HealthPoints : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");

    }

}
