package objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateAndUpdateUser {

    String name;
    String job;
}
