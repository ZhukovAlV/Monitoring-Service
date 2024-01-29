package db.impl;

import db.MeterDao;
import entity.meter.Meter;

import java.util.List;

/**
 * Реализация DAO для работы с измерениями
 *
 * @author Alexey Zhukov
 */
public class MeterDaoImpl implements MeterDao {

    @Override
    public void addMeter(Long idUser, Meter meter) {

    }

    @Override
    public List<Meter> getListMeterByUserId(Long idUser) {
        return null;
    }

}
