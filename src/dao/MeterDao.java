package dao;

import entity.meter.Meter;

import java.util.List;

/**
 * DAO для работы с измерениями
 *
 * @author Alexey Zhukov
 */
public interface MeterDao {

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

}
