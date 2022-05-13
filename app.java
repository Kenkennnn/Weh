public class App {
    public static void main(String[] args) {
        System.out.println("Wizards and Warlocks");

        Wizard ken = new Wizard("ken");
        ken.displaycharacterName();
        Warlock pacman = new Warlock("pacman");
        pacman.displaycharacterName();
        ken.haduken(pacman);
        pacman.sagemode(ken);
        ken.displaydetails();
        pacman.displaydetails();
        ken.Bankai(pacman);
        pacman.sharingan(ken);
        ken.displaydetails();
        pacman.displaydetails();
        ken.Healing();
        ken.Bankai(pacman);
        ken.displaydetails();
    }
}
