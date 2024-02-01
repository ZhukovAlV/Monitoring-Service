package service.impl;

import dao.MeterDao;
import dao.impl.MeterDaoImpl;
import entity.Answer;
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
    public Answer getAnswer() {
        while (true) {
            try {
                System.out.println("1. Ввести показания");
                System.out.println("2. Посмотреть актуальные показания");
                System.out.println("3. Посмотреть показания за месяц");
                System.out.println("3. Посмотреть историю показаний");
                int input = Integer.parseInt(reader.readLine());
                if (input == 1) {
                    return Answer.INPUT_METER;
                } else if (input == 2) {
                    return Answer.SHOW_LAST_METER;
                } else if (input == 3) {
                    return Answer.SHOW_METER_BY_DATA;
                } else if (input == 4) {
                    return Answer.SHOW_HISTORY_METER;
                } else {
                    return Answer.UNKNOWN;
                }
            } catch (Exception e) {
                System.out.println("Введен некорректный номер. Введите еще раз.");
            }
        }
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
