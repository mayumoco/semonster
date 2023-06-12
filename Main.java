public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");
    //Monster monster = new Monster();
    Player monster = new Player();
    System.out.println(monster.toString());
    monster.drawMonsters();
    monster.showDeck();
  }
}
