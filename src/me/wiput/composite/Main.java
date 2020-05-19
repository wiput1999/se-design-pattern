package me.wiput.composite;

public class Main {

  public static void main(String[] args) {
    System.out.println("=== Advert Sequence Composite ===");
    AdvertSequence advertSequence = new AdvertSequence();

    advertSequence.addClip(new VideoClip());
    advertSequence.addClip(new AudioClip());
    advertSequence.addClip(new AudioClip());
    advertSequence.addClip(new VideoClip());

    advertSequence.play();

    System.out.println(advertSequence.getChild());

    System.out.println("=== MLProcess Sequence Composite ===");
    MLProcessSequence mlProcessSequence = new MLProcessSequence();

    mlProcessSequence.addProcess(new SmallMLProcess());
    mlProcessSequence.addProcess(new MediumMLProcess());
    mlProcessSequence.addProcess(new LargeMLProcess());
    mlProcessSequence.addProcess(new MediumMLProcess());
    mlProcessSequence.addProcess(new SmallMLProcess());

    mlProcessSequence.execute();

    System.out.println(mlProcessSequence.getChild());
  }

}
