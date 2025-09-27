public class SixthPage {
    public static void main(String[] args) {
        Hero hero = new Hero("Alex", 20, 10);
        hero.run();
        hero.work();
        hero.rest();
        hero.buy("Potion", 12);
        hero.printStatus();
    }
}
