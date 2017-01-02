
import annotationBase.Instrument;
import annotationBase.actor.Instrumentalist;
import base.baseTest;
import dataSource.jdbc.DataManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

/**
 * Created by fangxue on 16/12/19.
 */

@ContextConfiguration(locations = "classpath:spring-config.xml")
public class test extends baseTest {

    @Autowired
    private Instrumentalist instrumentalist;
    @Autowired
    private Instrument instrument;

    @Autowired
    private DataManage dataManage;


    @Test
    public void test_01 () {
        instrument.play();
        instrumentalist.perform();
    }

    @Test
    public void test_02() {
        dataManage.connect();
    }

    @Test
    public void test_03() {
        dataManage.connect_auto();
    }

}
