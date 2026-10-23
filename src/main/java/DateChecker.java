public class DateChecker {
    //enum of all months in a year
    enum Month{
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

    public boolean Has31Days(Month month){
        return false;
    }
}
