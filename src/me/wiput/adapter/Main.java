package me.wiput.adapter;

public class Main {

  public static void main(String[] args) {

//    SquarePeg to RoundPeg adapter
    System.out.println("=== SquarePeg to RoundPeg Adapter ===");
    RoundHole roundHole = new RoundHole(5);
    RoundPeg roundPeg = new RoundPeg(5);

    if (roundHole.isFit(roundPeg)) {
      System.out.println("peg fit the hole");
    }

    SquarePeg smallSquarePeg = new SquarePeg(2);
    SquarePeg largeSquarePeg = new SquarePeg(20);

    SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
    SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

    if (roundHole.isFit(smallSquarePegAdapter)) {
      System.out.println("small sq peg fit the hole");
    }

    if (!roundHole.isFit(largeSquarePegAdapter)) {
      System.out.println("large sq peg not fit the hole");
    }

//    Megaman to Rockman Adapter
    System.out.println("=== Megaman to Rockman Adapter ===");
    ConcreteMegaman megaMan = new ConcreteMegaman();
    MegamanAdapter megaManAdapter = new MegamanAdapter(megaMan);

    CapComGame game = new CapComGame(megaManAdapter);

    game.play();
  }
}
