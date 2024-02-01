package endpoint;

import entity.Answer;
import entity.meter.Meter;

import java.util.Optional;

/**
 * Интерфейс Endpoint для работы с измерениями
 */
public interface MeterEndpoint {

    /**
     * Эндпоинт стартового окна вопросов
     * @return выбранный ответ
     */
    Answer getAnswer();

    /**
     * Эндпоинт подачи показаний
     * @return добавлены данные или нет
     */
    boolean add(long idUser, Meter meter);

    /**
     * Эндпоинт для получения актуальных показаний счетчиков
     * @return актуальные показания
     */
    Optional<Meter> getLast(long idUser);

    /**
     * Эндпоинт просмотра показаний за конкретный месяц
     * @return показания за конкретный месяц
     */
    Optional<Meter> getByMonth(long idUser, int year, int month);

    /**
     * Эндпоинт просмотра истории подачи показаний
     * @return все показания пользователя
     */
    Optional<Meter> getHistory(long idUser);

}
