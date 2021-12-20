package tests;

import adapters.UserAdapter;
import objects.RegisterAndAuthorizationUser;
import org.testng.annotations.Test;

public class RegisterTest {

    @Test
    public void registerUserTest() {
        RegisterAndAuthorizationUser registerUser = RegisterAndAuthorizationUser.builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        new UserAdapter().register(registerUser);
    }

    @Test
    public void unsuccessfulRegisterUserTest() {
        RegisterAndAuthorizationUser registerUser = RegisterAndAuthorizationUser.builder()
                .email("sydney@fife")
                .build();
        new UserAdapter().unsuccessfulRegister(registerUser);
    }
}

