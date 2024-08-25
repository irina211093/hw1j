import game.hero.Elf;

public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf();
        elf1.setId(1);
        int elfId = elf1.getId();
        System.out.println("Id of Elf: " + elfId);
    }

}
