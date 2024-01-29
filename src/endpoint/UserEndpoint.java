package endpoint;

import entity.User;
import service.AuthentificationService;
import service.RegistrationService;

import java.util.Optional;

/**
 * Endpoint для работы с пользователем
 */
public class UserEndpoint {

    /**
     * Аутентификация пользователя
     */
    private final AuthentificationService authentificationService;

    /**
     * Регистрация пользователя
     */
    private final RegistrationService registrationService;

    public UserEndpoint() {
        authentificationService = new AuthentificationService();
        registrationService = new RegistrationService();
    }

    /**
     * Вход в приложение
     * @return выбранный пользователем ответ
     */
    public int login() {
        return authentificationService.login();
    }

    public Optional<User> authentification() {
        return authentificationService.getUser();
    }

    public boolean authorization() {
        return false;
    }

    public boolean registration() {
        return false;
    }

}
