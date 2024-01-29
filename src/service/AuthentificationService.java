package service;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * Аутентификация пользователя
 *
 * @author Alexey Zhukov
 */
public class AuthentificationService {

    /**
     * Считыватель данных
     */
    private final BufferedReader reader;

    /**
     * DAO для работы с пользователем
     */
    private final UserDao userDao;

    public AuthentificationService() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        userDao = new UserDaoImpl();
    }

    /**
     * Сервис входа в приложение
     */
    public int login() {
        while (true) {
            try {
                System.out.println("1. Войти");
                System.out.println("2. Зарегистрироваться");
                int input = Integer.parseInt(reader.readLine());
                if (input == 1 || input == 2) {
                    return input;
                } else {
                    System.out.println("Введите число из списка.");
                }
            } catch (Exception e) {
                System.out.println("Введен некорректный номер. Введите еще раз.");
            }
        }
    }

    /**
     * Получение пользователя
     */
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
