package com.timetracker.timetracking.controllers;

import com.timetracker.timetracking.dto.TimeSheetResponse;
import com.timetracker.timetracking.models.TimeSheet;
import com.timetracker.timetracking.repository.TimeSheetRepository;
import com.timetracker.timetracking.services.TimeSheetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class TimeSheetController {
    @Autowired
    private TimeSheetRepository timeSheetRepository;
    @Autowired
    private TimeSheetService timeSheetService;

    @GetMapping("/ts/{id}")
    public TimeSheet getTimeSheetById(@PathVariable Long id){
        log.info("inside the get method");
        return timeSheetService.getTimeSheetById(id);
    }

    @PostMapping("/ts/create1")
    public TimeSheet createTimeSheet1(@RequestBody TimeSheet timeSheet) {

        log.info("inside the dummy method");
        return new TimeSheet();
    }
    @PostMapping("/ts/create")
    public TimeSheet createtimesheet(@RequestBody TimeSheet timeSheet){
        log.info("Inside the create end point");

        timeSheetService.saveTimeSheet(timeSheet);
    return timeSheet;


    }

    @GetMapping("ts/emp/{empId}")
    public List<TimeSheetResponse> getTimeSheetEntries(@PathVariable Long empId) {
        return timeSheetService.getTimeSheetEntriesByEmpId(empId);
    }


}
