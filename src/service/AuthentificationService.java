package service;

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
    int login();

    /**
     * Получение пользователя
     */
    Optional<User> getUser();


}
