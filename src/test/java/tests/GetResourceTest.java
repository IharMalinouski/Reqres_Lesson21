package tests;

import adapters.BaseAdapter;
import org.testng.annotations.Test;

public class GetResourceTest {

    @Test
    public void getResourceListTest(){
        new BaseAdapter().get("/unknown");
    }

    @Test
    public void getSingleResourceListTest(){
        new BaseAdapter().get("/unknown/2");

    }

    @Test
    public void getSingleResourceNotFoundListTest(){
        new BaseAdapter().get("/unknown/23");
    }
}
