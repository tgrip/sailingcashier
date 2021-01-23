package com.example.sailingcashier;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Trip {

    private LocalDate start;
    private LocalDate end;

    public Trip(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }
}
