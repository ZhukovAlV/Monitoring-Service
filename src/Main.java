import endpoint.UserEndpoint;
import entity.User;

import java.util.Optional;

/**
 * Класс приложения с точкой входа
 *
 * @author Alexey Zhukov
 */
public class Main {

    private static final UserEndpoint USER_ENDPOINT = new UserEndpoint();

    public static void main(String[] args) {

        // Вход в приложение
        int input = USER_ENDPOINT.login();
        if (input == 1) {
            Optional<User> userOpt = USER_ENDPOINT.authentification();
        } else {

        }

    }
}