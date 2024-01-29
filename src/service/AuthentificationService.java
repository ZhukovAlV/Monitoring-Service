package service;

import db.DataBase;
import entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Optional;

/**
 * Аутентификация пользователя
 *
 * @author Alexey Zhukov
 */
public class AuthentificationService {

    /**
     * Вход в приложение
     */
    public int login(BufferedReader reader) {
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
    public Optional<User> getUser(BufferedReader reader, DataBase dataBase) {
        try {
            System.out.println("Введите имя пользователя:");
            String name = reader.readLine();
            System.out.println("Введите пароль:");
            String password = reader.readLine();

            return dataBase.getUser(name, password);
        } catch (IOException e) {
            System.out.println("Ошибка ввода данных");
        }

        return Optional.empty();
    }

}
