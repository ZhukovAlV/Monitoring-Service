package service.impl;

import dao.MeterDao;
import dao.impl.MeterDaoImpl;
import entity.meter.Meter;
import service.MeterService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class MeterServiceImpl implements MeterService {

    /**
     * Считыватель данных
     */
    private final BufferedReader reader;

    /**
     * DAO для работы с показаниями
     */
    private final MeterDao meterDao;

    public MeterServiceImpl() {
        this.meterDao = new MeterDaoImpl();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public boolean add(long idUser, Meter meter) {
        return false;
    }

    @Override
    public Optional<Meter> getLast(long idUser) {
        return Optional.empty();
    }

    @Override
    public Optional<Meter> getByMonth(long idUser, int year, int month) {
        return Optional.empty();
    }

    @Override
    public Optional<Meter> getHistory(long idUser) {
        return Optional.empty();
    }

}
