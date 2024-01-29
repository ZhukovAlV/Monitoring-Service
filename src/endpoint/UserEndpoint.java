package endpoint;

import entity.Answer;
import entity.User;

import java.util.Optional;

/**
 * Интерфейс Endpoint для работы с пользователем
 */
public interface UserEndpoint {

    /**
     * Вход в приложение
     * @return выбранный пользователем ответ
     */
    Answer login();

    Optional<User> authentification();

    boolean authorization();

    boolean registration();

}
