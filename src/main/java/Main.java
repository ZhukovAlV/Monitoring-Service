import endpoint.MeterEndpoint;
import endpoint.UserEndpoint;
import endpoint.impl.MeterEndpointImpl;
import endpoint.impl.UserEndpointImpl;
import entity.User;

import java.util.Optional;

/**
 * Точка входа в приложение
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
        login();
    }

    /**
     * Окно входа
     */
    private static void login() {
        switch (USER_ENDPOINT.login()) {
            case SIGNIN -> {
                Optional<User> userOpt = USER_ENDPOINT.authentification();
                if (userOpt.isEmpty()) {
                    System.out.println("Пользователь не найден. " +
                            "Будет произведен переход на начальное окно.");
                    login();
                } else {
                    startMeter(userOpt.get());
                }
            }
            case REGISTER -> {
                Optional<User> userOpt = USER_ENDPOINT.registration();
                if (userOpt.isEmpty()) {
                    System.out.println("Пользователь не был зарегистрирован. " +
                            "Будет произведен переход на начальное окно.");
                    login();
                } else {
                    startMeter(userOpt.get());
                }
            }
            default -> System.out.println("Не был выбран ни один из допустимых ответов. " +
                    "Программа будет завершена.");
        }
    }

    /**
     * Окно ввода и просмотра показаний
     */
    private static void startMeter(User user) {
        switch (METER_ENDPOINT.getAnswer()) {
            case INPUT_METER -> {
                //METER_ENDPOINT.add(user);
            }
            case SHOW_LAST_METER -> {

            }
            case SHOW_METER_BY_DATA -> {

            }
            case SHOW_HISTORY_METER -> {

            }
            default -> System.out.println("Не был выбран ни один из допустимых ответов. " +
                    "Программа будет завершена.");
        }
    }
}