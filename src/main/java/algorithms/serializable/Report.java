package algorithms.serializable;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@RequiredArgsConstructor
public class Report implements Serializable {

  private final Date formDate;

  private final Date toDate;

  private final DbOper dbOper;

  //private final String[] arr;



  @Serial
  private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    objectInputStream.defaultReadObject();

  }

}
