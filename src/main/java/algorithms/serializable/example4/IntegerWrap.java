package algorithms.serializable.example4;


import java.io.Serializable;

public class IntegerWrap implements Serializable {

  public int value;

  public IntegerWrap(int i) {
    value = i;
  }
}
