public class MyDate {

    int month;
    int day;
    int year;

    public MyDate() {
    }

    {
        this.month = 6;
        this.day = 1;
        this.year = 2000;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate(int month,int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString(){
        return this.month + "/" + this.day + "/" + this.year;
    }
}
