package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.Answer;
import entity.User;
import service.AuthentificationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * Реализация аутентификации пользователя
 *
 * @author Alexey Zhukov
 */
public class AuthentificationServiceImpl implements AuthentificationService {

    /**
     * Считыватель данных
     */
    private final BufferedReader reader;

    /**
     * DAO для работы с пользователем
     */
    private final UserDao userDao;

    public AuthentificationServiceImpl() {
        this.userDao = new UserDaoImpl();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public Answer login() {
        while (true) {
            try {
                System.out.println("1. Войти");
                System.out.println("2. Зарегистрироваться");
                int input = Integer.parseInt(reader.readLine());
                if (input == 1) {
                    return Answer.SIGNIN;
                } else if (input == 2) {
                    return Answer.REGISTER;
                } else {
                    return Answer.UNKNOWN;
                }
            } catch (Exception e) {
                System.out.println("Введен некорректный номер. Введите еще раз.");
            }
        }
    }

    @Override
    public Optional<User> getUser() {
        try {
            System.out.println("Введите имя пользователя:");
            String name = reader.readLine();
            System.out.println("Введите пароль:");
            String password = reader.readLine();

            return userDao.getUser(name, password);
        } catch (IOException e) {
            System.out.println("Ошибка ввода данных");
        }

        return Optional.empty();
    }

}
