package serialazible;

import java.util.Comparator;

public class PersonIdComparator implements Comparator<Homonym.Person> {
    @Override
    public int compare(Homonym.Person o1, Homonym.Person o2) {
        if(o1.id> o2.id)
            return 1;
        else if(o1.id< o2.id)
            return -1;
        else
            return 0;
    }
}
