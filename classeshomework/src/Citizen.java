public class Citizen extends Unit {
    String gender;
    String kingdom;
    boolean havehome;
    String speciality;
    int money;
    public Citizen() {
        money = 15;
        mana =0;
    }
    @Override
    void defensing() {
        double rand = Math.random();
        if (rand>0.9) {
            System.out.println(name + " defences with improvised tools");
        } else System.out.println(name + "can't defense himself ");
    };
    void getinf() {
        System.out.println("Name: "+name+" Gender: "+gender+". Citizen of "+kingdom+" kingdom. Owns a house: "+havehome+". Speciality: "+speciality);
    };
}
