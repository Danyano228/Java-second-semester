package classes;

import java.util.Scanner;

public class Store {
    String inn = "936501492767";

    public Store() {
        Scanner in = new Scanner(System.in);
        String inn = in.nextLine();
        try {
            if (!this.inn.equals(inn)) throw new WrongInnException("Entered a wrong inn");
            else System.out.println("You have bought a slave");
        } catch (WrongInnException e) {
            System.out.println(e.getMessage());
        }
    }
}
