package utils;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class User {
    private String login;
    private String password;
    private final String userDataPath = "src/main/java/utils/user_data.json";

    public User userData () throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(userDataPath));
        User user = gson.fromJson(reader, User.class);
        return user;
    }
    public String getLogin() throws IOException {
        return userData().login;
    }
    public String getPassword() throws IOException {
        return userData().password;
    }
}
