package me.wiput.composite;

import java.util.ArrayList;

public class AdvertSequence extends MediaClip {

  private ArrayList<MediaClip> mediaClipCollection;

  public AdvertSequence() {
    this.mediaClipCollection = new ArrayList<MediaClip>();
  }

  public ArrayList<MediaClip> getChild() {
    return mediaClipCollection;
  }

  public void addClip(MediaClip mediaClip) {
    this.mediaClipCollection.add(mediaClip);
  }

  public void removeClip(MediaClip mediaClip) {
    this.mediaClipCollection.remove(mediaClip);
  }

  public void play() {
    for (MediaClip mediaClip : mediaClipCollection) {
      mediaClip.play();
    }
  }
}
