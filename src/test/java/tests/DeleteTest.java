package tests;

import adapters.BaseAdapter;
import org.testng.annotations.Test;

public class DeleteTest {

    @Test
    public void deleteTest(){
        new BaseAdapter().delete("/users/2", 204);
    }
}
