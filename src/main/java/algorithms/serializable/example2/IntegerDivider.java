package algorithms.serializable.example2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class IntegerDivider implements Serializable {
  private final int a;
  private final int b;

  public IntegerDivider(int a, int b) {
    this.a = a;
    this.b = b;

    validate();
  }

  public int divide() {
    return a/b;
  }


  private void readObject(ObjectInputStream os) throws IOException, ClassNotFoundException {
    os.defaultReadObject();
    validate();
  }


  private void validate() {
    if (b == 0 ) {
      throw new RuntimeException("на ноль нельзя делить");
    }
  }

  @Override
  public String toString() {
    return a + " " + b;
  }



}
