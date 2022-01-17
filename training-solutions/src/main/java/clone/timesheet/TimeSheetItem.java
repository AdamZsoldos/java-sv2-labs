package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {

    private final String employee;
    private final String project;
    private final LocalDateTime from;
    private final LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem timeSheetItem) {
        this.employee = timeSheetItem.employee;
        this.project = timeSheetItem.project;
        this.from = timeSheetItem.from;
        this.to = timeSheetItem.to;
    }

    public static TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee) {
        return new TimeSheetItem(new TimeSheetItem(newEmployee, timeSheetItem.project, timeSheetItem.from,timeSheetItem.to));
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
