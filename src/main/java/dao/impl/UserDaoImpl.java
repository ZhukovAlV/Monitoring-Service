package dao.impl;

import db.DataBase;
import dao.UserDao;
import entity.User;

import java.util.Optional;

/**
 * Реализация DAO для работы с пользователем
 *
 * @author Alexey Zhukov
 */
public class UserDaoImpl implements UserDao {

    @Override
    public Optional<User> getUser(String name, String password) {
        return DataBase.getDb().getUsers().stream()
                .filter(user -> user.getName().equals(name))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();
    }

    @Override
    public boolean isNameExist(String name) {
        return DataBase.getDb().getUsers().stream()
                .anyMatch(user -> user.getName().equals(name));
    }

}
