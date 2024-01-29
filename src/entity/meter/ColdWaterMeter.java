package entity.meter;

import java.time.Instant;

/**
 * Показание счетчика холодной воды
 *
 * @author Alexey Zhukov
 */
public class ColdWaterMeter extends WaterMeter {

    public ColdWaterMeter(Instant date, DataMeter dataMeter) {
        super(date, dataMeter);
    }

    @Override
    public void add() {

    }

}
