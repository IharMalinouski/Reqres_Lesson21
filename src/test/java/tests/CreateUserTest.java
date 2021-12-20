package tests;

import adapters.UserAdapter;
import objects.CreateAndUpdateUser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest {

    @Test
    public void createUserTest() {
        CreateAndUpdateUser createUser = CreateAndUpdateUser.builder()
                .name("Ihar")
                .job("QA")
                .build();
        new UserAdapter().create(createUser);
        Assert.assertEquals(createUser.getName(), "Ihar");
        Assert.assertEquals(createUser.getJob(), "QA");
        System.out.println("zasdasdasdasdasd");
    }
}
