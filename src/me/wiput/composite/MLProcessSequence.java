package me.wiput.composite;

import java.util.ArrayList;

public class MLProcessSequence extends MLProcess {

  private ArrayList<MLProcess> mlProcessesCollection;

  public MLProcessSequence() {
    this.mlProcessesCollection = new ArrayList<MLProcess>();
  }

  @Override
  public void execute() {
    for (MLProcess mlProcess : mlProcessesCollection) {
      mlProcess.execute();
    }
  }

  public void addProcess(MLProcess mlProcess) {
    this.mlProcessesCollection.add(mlProcess);
  }

  public void removeProcess(MLProcess mlProcess) {
    this.mlProcessesCollection.remove(mlProcess);
  }

  public ArrayList<MLProcess> getChild() {
    return this.mlProcessesCollection;
  }
}
