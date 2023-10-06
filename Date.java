public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String addDate(){
        String todate = String.format("%d/%d/%d",day,month,year);
        return todate;
    }
    public Date recentDate(Date d1,Date d2){
        if (d1.getYear()> d2.getYear()){
            return d1;
        }
        else if (d1.getMonth() > d2.getMonth()){
            return d1;
        }
        else if (d1.getDay() > d2.getDay()){
            return d1;
        }
        else {
            return d2;
        }
    }
}
