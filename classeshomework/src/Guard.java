public class Guard extends Citizen {
    public Guard() {
        gender = "male";
        havehome = true;
        speciality = "Guard";
        money = 1000;
        quotes = new String[4];
        quotes[0] = "My cousins out fighting dragons, and what do I get? Guard duty.";
        quotes[1] = "I used to be an adventurer like you, then I took an arrow to the knee.";
        quotes[2] = "Stop right there, criminal scum.";
        quotes[3] = "Let me guess… someone stole your sweetroll?";
    }
    @Override
    void attack() {
        double rand = Math.random();
        if (rand>0.1) {
            System.out.println(name + " attacks with " + weapon);
        } else System.out.println(name + "missed");
    };
    void shieldpunch() {
        double rand = Math.random();
        if (rand>0.3) {
            System.out.println(name + " attacks with shield and stunned enemy");
        } else System.out.println(name + "missed");
    };
}
