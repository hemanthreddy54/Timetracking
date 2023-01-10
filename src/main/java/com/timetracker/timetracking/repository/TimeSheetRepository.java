package com.timetracker.timetracking.repository;

import com.timetracker.timetracking.models.TimeSheet;
import com.timetracker.timetracking.models.TimeSheetResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long> {

    @Query("""
            select   ts
            from Employee e
            join TimeSheet ts
            where e.Id = :empId
            """)
    public List<TimeSheet> findAllTimeSheetsByEmpId(Long empId);

}
