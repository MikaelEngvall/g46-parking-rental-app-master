package se.lexicon.data.impl;

import se.lexicon.data.ReservationDao;
import se.lexicon.model.Reservation;

import java.util.Optional;

public class ReservationDaoImpl implements ReservationDao {

    //todo: implement singleton design pattern

    @Override
    public Reservation create(Reservation reservation) {
        return null;
    }

    @Override
    public Optional<Reservation> find(String s) {
        return Optional.empty();
    }
}
