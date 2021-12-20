package tests;

import adapters.BaseAdapter;
import adapters.UserAdapter;
import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;
import responseParametrs.UserList;

public class GetUserTest {


    @Test
    public void getUserListTest() {
        new BaseAdapter().get("/users?page=2");

//        UserList userList = new UserList();
//        Assert.assertEquals(userList.getData().get(0).getId(), 555);
        UserList userList = new UserList();
        int getId = userList.getData().get(0).getId();
        System.out.println(getId);
//        UserList userList = new Gson().fromJson(BaseAdapter., UserList.class);
//        System.out.println("2222-------"+ userList);
      //  Assert.assertEquals(userList.getData().get(0));
    }

    @Test
    public void getSingleUserTest() {
        new BaseAdapter().get("/unknown");
     //   UserAdapter.getList(Response);
//        UserList userList = new UserList();
//        Assert.assertEquals(userList.getData().get(1).getId(), 5555);
       // new UserAdapter().getList().g;
//        UserList userList = new UserList();
//        Assert.assertEquals(userList.getData().get(0).getId(), 5555);

    }

    @Test
    public void getSingleUserNotFoundTest() {
        new BaseAdapter().get("/users/23");
    }
}
