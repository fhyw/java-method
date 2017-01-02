package annotationBase.actor;

import annotationBase.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * Created by fangxue on 16/12/19.
 */
@Component
public class springTest {

    @Autowired
    private Instrumentalist instrumentalist;

    private void play() {
        instrumentalist.perform();
    }

}