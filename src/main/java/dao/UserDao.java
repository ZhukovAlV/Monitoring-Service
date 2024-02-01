package dao;

import entity.User;

import java.util.Optional;

/**
 * DAO для работы с пользователем
 *
 * @author Alexey Zhukov
 */
public interface UserDao {

    /**
     * Получение пользователя по имени и паролю
     * @return пользователь или empty
     */
    Optional<User> getUser(String name, String password);

    /**
     * Проверка имени на наличие в БД
     * @return имеется ли данный пользователь в БД
     */
    boolean isNameExist(String name);

}
