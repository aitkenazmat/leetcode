package algorithms.serializable.example4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class IntegerDivider implements Serializable {
  private final Integer a;
  private IntegerWrap b;

  public IntegerDivider(int a, IntegerWrap b) {
    this.a = a;
    this.b = b;

    validate();
  }

  public int divide() {
    return a/b.value;
  }


  private void readObject(ObjectInputStream os) throws IOException, ClassNotFoundException {
    os.defaultReadObject();

    this.b = new IntegerWrap(b.value);

    validate();
  }


  private void validate() {
    if (b!= null && b.value ==0 ) {
      throw new RuntimeException("на ноль нельзя делить");
    }
  }

  @Override
  public String toString() {
    return a + " " + b;
  }



}
