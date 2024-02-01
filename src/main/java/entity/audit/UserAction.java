package entity.audit;

/**
 * Действие пользователя
 *
 * @author Alexey Zhukov
 */
public enum UserAction {

    AUTHORIZATION("Авторизация"),
    COMPLETION_OF_WORK("Завершение работы"),
    FILING_OF_METER("Подача показаний"),
    GET_HISTORY_OF_METER("Получение истории подачи показаний");

    private String value;

    UserAction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
