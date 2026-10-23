import java.util.Arrays;

public class DateChecker {
    //enum of all months in a year
    public enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    //list of months that have 31 days
    private DateChecker.Month[] has31Days = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
                                                Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month){
        if(month == null){
            throw new IllegalArgumentException("Cannot put null as input for has31Days");
        }
        return Arrays.asList(has31Days).contains(month);
    }
}
