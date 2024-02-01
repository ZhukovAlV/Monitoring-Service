package entity.meter;

import java.time.Instant;

/**
 * Показание счетчика воды
 *
 * @author Alexey Zhukov
 */
public abstract class WaterMeter extends Meter {

    public WaterMeter(Instant date, DataMeter dataMeter) {
        super(date, dataMeter);
    }

}
