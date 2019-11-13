public class Unit {
    int hp;
    int mana;
    int age;
    public String name;
    public String weapon;
    public String defense;
    String [] quotes = new String [3];
    void attack() {
        double rand = Math.random();
        if (rand>0.3) {
            System.out.println(name + " attacks with " + weapon);
        } else System.out.println(name + "missed");
    };
    void defensing() {
        double rand = Math.random();
        if (rand>0.4) {
            System.out.println(name + " defences with " + defense);
        } else System.out.println(name + "can't defense himself.");
    };
    void tells() {
        int irand = (int) (Math.random()*quotes.length);
        System.out.println (name+" says "+ quotes[irand]);
    }
}
