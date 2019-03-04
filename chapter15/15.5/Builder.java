public interface Builder{
    public abstract void buildTitle();
    public abstract boolean buildWeekTitle();
    public abstract boolean buildCalendar(int year,int month);
    public abstract void buildDayOfMonth();
    public abstract CalendarProduct getCalendarProduct();
}
