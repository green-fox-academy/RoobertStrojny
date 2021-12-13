package com.greenfoxacademy.reservations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
    private final String dow;
    private final String code;

    public Reservation() {
        this.dow = getDowBooking();
        this.code = getCodeBooking();
    }

    @Override
    public String getDowBooking() {
        String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        Random random = new Random();
        int day = random.nextInt(0, 7);
        return dow[day];
    }

    @Override
    public String getCodeBooking() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int randomChar = random.nextInt(48, 90);
            if (randomChar < 62 && randomChar > 57) {
                randomChar = random.nextInt(48, 57);
            }
            if (randomChar > 62 && randomChar < 65) {
                randomChar = random.nextInt(65, 90);
            }
            sb.append((char) randomChar);
        }

        return sb.toString();
    }

    public String getDow() {
        return dow;
    }

    public String getCode() {
        return code;
    }

    public static void main(String[] args) {
        List<Reservation> reservations = new ArrayList<>();
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());
        reservations.add(new Reservation());

        for (Reservation res : reservations) {
            System.out.println("Booking# " + res.getCode() + " for " + res.getDowBooking());
        }

    }
}
