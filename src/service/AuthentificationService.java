package service;

import entity.Answer;
import entity.User;

import java.util.Optional;

/**
 * Аутентификация пользователя
 *
 * @author Alexey Zhukov
 */
public interface AuthentificationService {

    /**
     * Вход в приложение
     */
    Answer login();

    /**
     * Получение пользователя
     */
    Optional<User> getUser();


}
