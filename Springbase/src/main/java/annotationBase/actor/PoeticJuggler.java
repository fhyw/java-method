package annotationBase.actor;

import annotationBase.Poem;

/**
 * Created by fangxue on 16/12/21.
 */
public class PoeticJuggler extends Juggler{

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        poem.recite();
    }
}
