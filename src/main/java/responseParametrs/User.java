package responseParametrs;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    int id;
    String email;
    @SerializedName("first_name")
    String firstName;
    @SerializedName("last_name")
    String lastName;
    String avatar;
}
