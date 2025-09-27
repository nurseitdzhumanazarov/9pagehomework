import java.util.Random;

public class FourthPage {
    public static void main(String[] args) {
        int energy = 20;
        int lap = 0;
        Random rand = new Random();

        while (energy > 0) {
            lap++;
            int loss = 1 + rand.nextInt(3);
            energy -= loss;
            System.out.println("Lap " + lap + " | -" + loss + " energy | Energy left: " + energy);

            if (lap % 5 == 0) {
                energy += 2;
                System.out.println("Lap " + lap + " | Adrenaline boost! +2 energy | Energy left: " + energy);
            }
        }
    }
}
