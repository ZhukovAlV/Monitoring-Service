package db;

import entity.Role;
import entity.User;
import entity.meter.Meter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * База данных показаний счетчиков
 *
 * @author Alexey Zhukov
 */
public class DataBase {

    /**
     * Синглтон базы данных
     */
    private static DataBase base;

    /**
     * Словарь (ключ ID пользователя, VALUE - список показаний данного пользователя)
     */
    private final Map<Long,List<Meter>> meters;

    private final List<User> users;

    private DataBase() {
        meters = new HashMap<>();
        users = new ArrayList<>();
        // тестовые данные
        users.add(new User(1L, "Test", "Test",
                "Test", new Role[]{Role.USER}));
    }

    /**
     * Получение объекта базы данных
     * @return объект базы данных
     */
    public static DataBase getDb() {
        if (base == null){
            base = new DataBase();
        }
        return base;
    }

    public Map<Long, List<Meter>> getMeters() {
        return meters;
    }

    public List<User> getUsers() {
        return users;
    }

}
