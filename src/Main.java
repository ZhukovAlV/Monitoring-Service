import db.DataBase;
import db.DataBaseImpl;
import entity.User;
import service.AuthentificationService;
import service.RegistrationService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/**
 * Класс приложения с точкой входа
 *
 * @author Alexey Zhukov
 */
public class Main {

    // Считыватель данных
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    // БД показаний счетчиков и пользователей
    private static final DataBase DATA_BASE = new DataBaseImpl(new HashMap<>(), new ArrayList<>());

    // Аутентификация пользователя
    private static final AuthentificationService AUTHENTIFICATION_SERVICE = new AuthentificationService();

    // Регистрация пользователя
    private static final RegistrationService REGISTRATION_SERVICE = new RegistrationService();

    public static void main(String[] args) {

        // Вход в приложение
        int input = AUTHENTIFICATION_SERVICE.login(READER);
        if (input == 1) {
            Optional<User> userOpt = AUTHENTIFICATION_SERVICE.getUser(READER, DATA_BASE);
        } else {

        }

    }
}