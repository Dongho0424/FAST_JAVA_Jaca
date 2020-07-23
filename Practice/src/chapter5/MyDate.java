package chapter5;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;
    private boolean isLeapYear = false;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setYear(int newYear) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }
        this.year = newYear;
    }

    public MyDate(int year, int month, int day) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String isValid() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 0 || day > 31) {
                    isValid = false;
                }
                break;
            case 2:
                if (isLeapYear) {
                    if (day < 0 || day > 29) {
                        isValid = false;
                    }
                } else {
                    if (day < 0 || day > 28) {
                        isValid = false;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 0 || day > 30) {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }
        if (isValid) {
            return "valid little boy";

        } else {
            return "sucks";
        }
    }

}
