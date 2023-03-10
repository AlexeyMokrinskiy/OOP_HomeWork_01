package final_project.comparators;

import java.util.Comparator;
import final_project.animals.Lion;

public class LionComparator implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        if (o1.getManeVolume() > o2.getManeVolume()) {
            return 1;
        } else if (o1.getManeVolume() < o2.getManeVolume()) {
            return -1;
        }
        return 0;
    }

}
