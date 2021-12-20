package adapters;

import io.restassured.response.ResponseBody;
import objects.*;
import responseParametrs.UserList;

public class UserAdapter extends BaseAdapter {

    public static final String CREATE_URI = "/users";
    public static final String REGISTER_URI = "/register";
    public static final String LOGIN_URI = "/login";
    public static final String UPDATE_URI = "/users/2";
    public static final String UPDATE_URI2 = "/api/users?page=2";

    public String create(CreateAndUpdateUser createUser) {
        return post(CREATE_URI, converter.toJson(createUser)).body().path("name");
    }

    public int register(RegisterAndAuthorizationUser registerUser) {
        return post(REGISTER_URI, converter.toJson(registerUser)).body().path("id");
    }

    public String unsuccessfulRegister(RegisterAndAuthorizationUser registerUser) {
        return post(REGISTER_URI, converter.toJson(registerUser)).body().path("error");
    }

    public String login(RegisterAndAuthorizationUser registerUser) {
        return post(LOGIN_URI, converter.toJson(registerUser)).body().path("token");
    }

    public String update(CreateAndUpdateUser createUser) {
        return put(UPDATE_URI, converter.toJson(createUser)).body().path("name");
    }

    public String updatePatch(CreateAndUpdateUser createUser) {
        return patch(UPDATE_URI, converter.toJson(createUser)).body().path("name");
    }

//    public String getList(UserList userList) {
//        return get(UPDATE_URI2, converter.toJson(userList)).body();
//    }
}
