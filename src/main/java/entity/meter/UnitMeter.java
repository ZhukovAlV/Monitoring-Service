package entity.meter;

/**
 * Единица измерения показания
 *
 * @author Alexey Zhukov
 */
public enum UnitMeter {

    CUBIC_METER("Кубометр"),
    GIGACALORY("Гигакалория");

    private String value;

    UnitMeter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
