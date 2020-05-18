package me.wiput.adapter;

public class MegamanAdapter implements Rockman {

  private ConcreteMegaman megaman;

  public MegamanAdapter(ConcreteMegaman megaman) {
    this.megaman = megaman;
  }

  @Override
  public void shoot() {
    megaman.fire();
  }

  @Override
  public void slide() {
    megaman.sprint();
  }
}
