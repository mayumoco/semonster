public class Main {
  public static void main(String[] args) {
//<<<<<<< HEAD
    //System.out.println("SEMonster!");
    //Monster monster = new Monster();
    //Player monster = new Player();
//=======
    //System.out.println("SEMonster!");
    System.out.println("SEMONSTER GAME");
    System.out.println("Show a new monster!");
    Monster monster = new Monster();
//>>>>>>> main
    System.out.println(monster.toString());
    monster.drawMonsters();
    monster.showDeck();
  }
}
