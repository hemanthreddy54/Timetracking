package com.timetracker.timetracking.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TimeSheetResponse {
    private String name;
    private LocalDate date;
    private String task;
    private int hours;
}
