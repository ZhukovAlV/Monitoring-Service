package service;

import entity.User;

import java.util.Optional;

/**
 * Сервис регистрации пользователя
 *
 * @author Alexey Zhukov
 */
public interface RegistrationService {

    /**
     * Регистрация пользователя
     * @return зарегистрированный пользователь или empty
     */
    Optional<User> register();
}
