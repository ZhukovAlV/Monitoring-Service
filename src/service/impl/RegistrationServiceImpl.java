package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.Role;
import entity.User;
import service.RegistrationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * Регистрация пользователя
 *
 * @author Alexey Zhukov
 */
public class RegistrationServiceImpl implements RegistrationService {

    /**
     * Считыватель данных
     */
    private final BufferedReader reader;

    /**
     * DAO для работы с пользователем
     */
    private final UserDao userDao;

    public RegistrationServiceImpl() {
        this.userDao = new UserDaoImpl();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public Optional<User> register() {

        Optional<String> nameOpt = inputName();
        if (nameOpt.isPresent() && userDao.isNameExist(nameOpt.get())) {
            Optional<String> passwordOpt = inputPassword();
            if (passwordOpt.isPresent()) {
                // TODO
                User user = new User(1L, nameOpt.get(), nameOpt.get(), passwordOpt.get(), new Role[]{Role.USER});
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    private Optional<String> inputName() {

        try {
            System.out.println("Введите имя пользователя");
            return Optional.of(reader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода имени. Попробуйте еще раз");
            inputName();
        }

        return Optional.empty();
    }

    private Optional<String> inputSecondName() {

        try {
            System.out.println("Введите фамилию пользователя");
            return Optional.of(reader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода фамилию. Попробуйте еще раз");
            inputSecondName();
        }

        return Optional.empty();
    }

    private Optional<String> inputPassword() {

        try {
            System.out.println("Введите пароль");
            String first = reader.readLine();
            System.out.println("Повторите пароль");
            String second = reader.readLine();
            if (first.equals(second)) {
                return Optional.of(first);
            } else {
                System.out.println("Пароли не совпадают. Попробуйте еще раз");
                inputPassword();
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода пароля. Попробуйте еще раз");
            inputPassword();
        }

        return Optional.empty();
    }

}
