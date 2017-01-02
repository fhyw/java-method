package util;

import IO.*;
import org.testng.annotations.Test;

/**
 * Created by fangxue on 16/12/16.
 */
public class WormTest {
    public static void main(String[] args) {
        PPrint.pformat(Drictory.walk(".").dirs);
    }

    @Test
    public void test_01_testDirctory() throws Exception{
        System.out.println("hello");
        PPrint.pformat(Drictory.walk("~/javaTest").dirs);
    }
}
