package com.timetracker.timetracking.dto;

import java.time.LocalDate;

public record TimeSheetResponse(String name, String email, LocalDate date,String task,int hours) {
}
