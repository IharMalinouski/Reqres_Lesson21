package tests;

import adapters.UserAdapter;
import objects.CreateAndUpdateUser;
import org.testng.annotations.Test;

public class UpdateUserTest {

    @Test
    public void updateUserTest(){
        CreateAndUpdateUser createUser = CreateAndUpdateUser.builder()
                .name("Vova")
                .job("Developer")
                .build();
        new UserAdapter().update(createUser);

    }
}
