package com.timetracker.timetracking.services;

import com.timetracker.timetracking.dto.TimeSheetResponse;
import com.timetracker.timetracking.models.TimeSheet;
import com.timetracker.timetracking.repository.TimeSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeSheetService {
    @Autowired
    private TimeSheetRepository timeSheetRepository;

    public TimeSheet getTimeSheetById(Long id){
        return timeSheetRepository.findById(id).get();
    }
    public void saveTimeSheet(TimeSheet timeSheet){
        timeSheetRepository.save(timeSheet);
    }

    public List<TimeSheetResponse> getTimeSheetEntriesByEmpId(Long empId) {
        List<TimeSheet> timeSheets =  timeSheetRepository.findAllTimeSheetsByEmpId(empId);
       return timeSheets.stream().map(it -> new TimeSheetResponse(it.getEmployee().getName(),
                it.getEmployee().getEmail(),
                it.getDate(),
                it.getTask(),
                it.getHours())).toList();
    }

}
