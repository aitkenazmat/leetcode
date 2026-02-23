package algorithms.serializable.example0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

  private long id;
  private LocalDate dateBirth;



  private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
    is.defaultReadObject();
    dateBirth = (LocalDate) is.readObject();
    id =  is.readLong();
  }

  private void writeObject(ObjectOutputStream os) throws IOException {
    os.defaultWriteObject();
    os.writeObject(dateBirth);
    os.writeLong(id);
  }
}
