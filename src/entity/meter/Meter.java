package entity.meter;

import java.time.Instant;

/**
 * Показание счетчика
 *
 * @author Alexey Zhukov
 */
public abstract class Meter {

    /**
     * Дата предоставления показания
     */
    private Instant date;

    /**
     * Данные показания
     */
    private DataMeter dataMeter;

    public Meter(Instant date, DataMeter dataMeter) {
        this.date = date;
        this.dataMeter = dataMeter;
    }

    /**
     * Добавление нового показания
     */
    public abstract void add();

    public Instant getDate() {
        return date;
    }

    public DataMeter getDataMeter() {
        return dataMeter;
    }

}
