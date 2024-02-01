package entity.meter;

import java.time.Instant;

/**
 * Показание счетчика горячей воды
 *
 * @author Alexey Zhukov
 */
public class HotWaterMeter extends WaterMeter {

    public HotWaterMeter(Instant date, DataMeter dataMeter) {
        super(date, dataMeter);
    }

    @Override
    public void add() {

    }

}
