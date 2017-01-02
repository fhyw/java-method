package annotationBase.actor;

import annotationBase.Instrument;
import annotationBase.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by fangxue on 16/12/22.
 */
@Component
public class Instrumentalist implements Performer{
    public Instrumentalist() {}
    public void perform() {
        System.out.println("kenny");
        instrument.play();
    }
    private String song;

    @Autowired
    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
