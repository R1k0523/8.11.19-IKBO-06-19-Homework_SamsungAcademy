public class Orc extends Unit {
    String rank;
    String color;
    @Override
    void attack() {
            System.out.println(name + " attacks with " + weapon);
    };
    void rage() {
        System.out.println("Orc "+name+" in rage and attacks twice.");
        attack();
        attack();
    }
}
