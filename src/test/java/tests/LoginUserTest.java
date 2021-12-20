package tests;

import adapters.UserAdapter;
import objects.RegisterAndAuthorizationUser;
import org.testng.annotations.Test;

public class LoginUserTest {

    @Test
    public void registerUserTest() {
        RegisterAndAuthorizationUser registerUser = RegisterAndAuthorizationUser.builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();
        new UserAdapter().login(registerUser);
    }

    @Test
    public void unsuccessfulRegisterUserTest() {
        RegisterAndAuthorizationUser registerUser = RegisterAndAuthorizationUser.builder()
                .email("eve.holt@reqres.in")
                .build();
        new UserAdapter().login(registerUser);
    }
}
