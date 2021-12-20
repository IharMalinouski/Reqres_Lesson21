package objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterAndAuthorizationUser {

    String email;
    String password;
}
