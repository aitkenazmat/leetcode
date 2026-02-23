package algorithms.serializable;

import lombok.RequiredArgsConstructor;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;


public class RepoerHacking {

  private Report report;
  DbOper dbOper;

  public RepoerHacking(FileInputStream bos) throws IOException, ClassNotFoundException {
    ObjectInputStream os = new ObjectInputStream(bos);
    report = (Report) os.readObject();
    dbOper = (DbOper) os.readObject();

  }


  public void doSome() {
    dbOper.dropDatabase();
  }

}
