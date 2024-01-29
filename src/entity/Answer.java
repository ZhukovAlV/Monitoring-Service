package entity;

/**
 * Спиок возможного выбора пользователя
 *
 * @author Alexey Zhukov
 */
public enum Answer {
    SIGNIN("Войти"),
    REGISTER("Зарегистрироваться"),
    INPUT_METER("Ввести измерение"),
    SHOW_LAST_METER("Посмотреть актуальное измерение"),
    SHOW_METER_BY_DATA("Посмотреть измерение на нужную дату"),
    SHOW_HISTORY_METER("Посмотреть историю измерений"),
    UNKNOWN("Неизвестное значение");

    private String value;

    Answer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
