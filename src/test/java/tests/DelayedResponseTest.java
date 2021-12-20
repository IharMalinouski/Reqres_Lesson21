package tests;

import adapters.BaseAdapter;
import org.testng.annotations.Test;

public class DelayedResponseTest {

    @Test
    public void delayedResponseTest(){
        new BaseAdapter().get("/users?delay=3");
    }
}
