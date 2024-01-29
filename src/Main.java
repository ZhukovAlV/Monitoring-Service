import endpoint.MeterEndpoint;
import endpoint.UserEndpoint;
import endpoint.impl.MeterEndpointImpl;
import endpoint.impl.UserEndpointImpl;
import entity.User;

import java.util.Optional;

/**
 * Класс приложения с точкой входа
 *
 * @author Alexey Zhukov
 */
public class Main {

    /**
     * Инициализируем необходимые эндпойнты
     */
    private final static UserEndpoint USER_ENDPOINT = new UserEndpointImpl();
    private final static MeterEndpoint METER_ENDPOINT = new MeterEndpointImpl();

    public static void main(String[] args) {

        // Вход в приложение
        int input = USER_ENDPOINT.login();
        if (input == 1) {
            Optional<User> userOpt = USER_ENDPOINT.authentification();
        } else {

        }

    }
}