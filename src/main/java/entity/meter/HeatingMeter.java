package entity.meter;

import java.time.Instant;

/**
 * Показание счетчика отопления
 *
 * @author Alexey Zhukov
 */
public class HeatingMeter extends Meter {

    public HeatingMeter(Instant date, DataMeter dataMeter) {
        super(date, dataMeter);
    }

    @Override
    public void add() {

    }

}
