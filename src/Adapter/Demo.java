package Adapter;

import Adapter.Round.RoundImpl.RoundHole;
import Adapter.Round.RoundImpl.RoundPeg;
import Adapter.Square.adapters.SquarePegAdapter;

public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg1 = new RoundPeg(9);
        RoundPeg roundPeg2 = new RoundPeg(11);
        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(5);
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(15);

        System.out.println("roundPeg1 insert into roundHole - " + roundHole.insert(roundPeg1));
        System.out.println("roundPeg2 insert into roundHole - " + roundHole.insert(roundPeg2));
        System.out.println("squarePegAdapter1 insert into roundHole - " + roundHole.insert(squarePegAdapter1));
        System.out.println("squarePegAdapter2 insert into roundHole - " + roundHole.insert(squarePegAdapter2));
    }
}