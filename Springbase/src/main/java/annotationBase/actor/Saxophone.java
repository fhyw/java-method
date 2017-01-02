package annotationBase.actor;

import annotationBase.Instrument;
import org.springframework.stereotype.Component;

/**
 * Created by fangxue on 16/12/22.
 */
@Component
public class Saxophone implements Instrument{
    public Saxophone() {}
    public void play() {
        System.out.println("Saxphone");
    }
}
