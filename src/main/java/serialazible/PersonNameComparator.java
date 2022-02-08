package serialazible;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Homonym.Person> {
    @Override
    public int compare(Homonym.Person o1, Homonym.Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
