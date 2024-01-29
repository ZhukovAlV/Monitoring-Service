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
     * @return
     */
    Optional<User> getUser(String name, String password);

}
