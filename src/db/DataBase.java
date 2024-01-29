package db;

import entity.User;
import entity.meter.Meter;

import java.util.List;
import java.util.Optional;

/**
 * База данных без реализации
 *
 * @author Alexey Zhukov
 */
public interface DataBase {

    /**
     * Добавление показания счетчика по ID пользователя
     * @param idUser ID пользователя
     * @param meter показание счетчика
     */
    void addMeter(Long idUser, Meter meter);

    /**
     * Получение списка показаний по ID пользователя
     * @param idUser ID пользователя
     * @return список показаний по ID пользователя
     */
    List<Meter> getListMeterByUserId(Long idUser);

    /**
     * Получение пользователя по имени и паролю
     * @return
     */
    Optional<User> getUser(String name, String password);
}
