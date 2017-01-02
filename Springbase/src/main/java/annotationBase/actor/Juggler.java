package annotationBase.actor;

import annotationBase.Performer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fangxue on 16/12/19.
 */

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {}

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("Juggler   " + beanBags + "   beanBags");
    }

}
