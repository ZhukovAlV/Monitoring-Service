package entity.meter;

import java.util.Objects;

/**
 * Данные показания
 *
 * @author Alexey Zhukov
 */
public abstract class DataMeter {

    private double value;
    private UnitMeter unitMeter;

    public DataMeter(double value, UnitMeter unitMeter) {
        this.value = value;
        this.unitMeter = unitMeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataMeter dataMeter = (DataMeter) o;
        return Double.compare(value, dataMeter.value) == 0 && unitMeter == dataMeter.unitMeter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unitMeter);
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                ", unitMeter=" + unitMeter +
                '}';
    }

    public double getValue() {
        return value;
    }

    public UnitMeter getUnitMeter() {
        return unitMeter;
    }

}
