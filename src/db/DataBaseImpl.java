package db;

import entity.User;
import entity.meter.Meter;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * База данных показаний счетчиков
 *
 * @author Alexey Zhukov
 */
public class DataBaseImpl implements DataBase {

    /**
     * Словарь (ключ ID пользователя, VALUE - список показаний данного пользователя)
     */
    private final Map<Long,List<Meter>> meters;

    private final List<User> users;

    public DataBaseImpl(Map<Long, List<Meter>> meters, List<User> users) {
        this.meters = meters;
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBaseImpl dataBaseMeterImpl = (DataBaseImpl) o;
        return Objects.equals(meters, dataBaseMeterImpl.meters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meters);
    }

    @Override
    public String toString() {
        return "DBMeter{" +
                "meters=" + meters +
                '}';
    }

    @Override
    public void addMeter(Long idUser, Meter meter) {

    }

    @Override
    public List<Meter> getListMeterByUserId(Long idUser) {
        return null;
    }

    @Override
    public Optional<User> getUser(String name, String password) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();
    }

}
