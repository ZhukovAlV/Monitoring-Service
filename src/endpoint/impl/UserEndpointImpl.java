package endpoint.impl;

import endpoint.UserEndpoint;
import entity.User;
import service.AuthentificationService;
import service.RegistrationService;
import service.impl.AuthentificationServiceImpl;
import service.impl.RegistrationServiceImpl;

import java.util.Optional;

/**
 * Endpoint для работы с пользователем
 */
public class UserEndpointImpl implements UserEndpoint {

    /**
     * Аутентификация пользователя
     */
    private final AuthentificationService authentificationService;

    /**
     * Регистрация пользователя
     */
    private final RegistrationService registrationService;

    public UserEndpointImpl() {
        this.authentificationService = new AuthentificationServiceImpl();
        this.registrationService = new RegistrationServiceImpl();
    }

    @Override
    public int login() {
        return authentificationService.login();
    }

    @Override
    public Optional<User> authentification() {
        return authentificationService.getUser();
    }

    @Override
    public boolean authorization() {
        return false;
    }

    @Override
    public boolean registration() {
        return false;
    }

}
