package endpoint.impl;

import endpoint.MeterEndpoint;
import entity.meter.Meter;
import service.MeterService;
import service.impl.MeterServiceImpl;

import java.util.Optional;

/**
 * Endpoint для работы с измерениями
 */
public class MeterEndpointImpl implements MeterEndpoint {

    private final MeterService meterService;

    public MeterEndpointImpl() {
        this.meterService = new MeterServiceImpl();
    }

    @Override
    public boolean add(long idUser, Meter meter) {
        return meterService.add(idUser, meter);
    }

    @Override
    public Optional<Meter> getLast(long idUser) {
        return meterService.getLast(idUser);
    }

    @Override
    public Optional<Meter> getByMonth(long idUser, int year, int month) {
        return meterService.getByMonth(idUser, year, month);
    }

    @Override
    public Optional<Meter> getHistory(long idUser) {
        return meterService.getHistory(idUser);
    }

}
