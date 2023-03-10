package final_project.comparators;

import java.util.Comparator;
import final_project.animals.Snake;

public class SnakeComparator implements Comparator<Snake>{
    @Override
    public int compare(Snake o1, Snake o2) {
        if (o1.getBodyLength() > o2.getBodyLength()) {
            return 1;
        } else if (o1.getBodyLength() < o2.getBodyLength()) {
            return -1;
        }
        return 0;
    }
}
