package service;

import entity.Answer;
import entity.meter.Meter;

import java.util.Optional;

public interface MeterService {

    /**
     * Сервис отображения вопросов пользователю по показаниям
     * @return выбранный ответ
     */
    Answer getAnswer();

    /**
     * Сервис подачи показаний
     * @return добавлены данные или нет
     */
    boolean add(long idUser, Meter meter);

    /**
     * Сервис для получения актуальных показаний счетчиков
     * @return актуальные показания
     */
    Optional<Meter> getLast(long idUser);

    /**
     * Сервис просмотра показаний за конкретный месяц
     * @return показания за конкретный месяц
     */
    Optional<Meter> getByMonth(long idUser, int year, int month);

    /**
     * Сервис просмотра истории подачи показаний
     * @return все показания пользователя
     */
    Optional<Meter> getHistory(long idUser);
    
}
