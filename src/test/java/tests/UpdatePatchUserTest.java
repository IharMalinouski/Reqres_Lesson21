package tests;

import adapters.UserAdapter;
import objects.CreateAndUpdateUser;
import org.testng.annotations.Test;

public class UpdatePatchUserTest {

    @Test
    public void updatePathUserTest() {
        CreateAndUpdateUser createUser = CreateAndUpdateUser.builder()
                .name("Vovaaa")
                .job("DevOps")
                .build();
        new UserAdapter().updatePatch(createUser);
    }
}
