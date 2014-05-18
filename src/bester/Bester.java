package bester;

import java.util.List;

/**
 * Created by yyan on 5/15/14.
 */
public class Bester {
    public Bestable best(List<Bestable> bestables) {
        if (bestables.size() == 1) {
            return bestables.get(0);
        }

        Bestable best = bestables.get(0);
        for (Bestable bestable : bestables) {
            if (bestable.isBetterThan(best)) {
                best = bestable;
            }
        }
        return best;
    }
}
