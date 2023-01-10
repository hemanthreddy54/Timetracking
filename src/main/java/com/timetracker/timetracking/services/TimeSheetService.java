package com.timetracker.timetracking.services;

import com.timetracker.timetracking.models.TimeSheet;
import com.timetracker.timetracking.models.TimeSheetResponse;
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

    public List<TimeSheet> getTimeSheetEntriesByEmpId(Long empId) {
        return timeSheetRepository.findAllTimeSheetsByEmpId(empId);
    }

}
