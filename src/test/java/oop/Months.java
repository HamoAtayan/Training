package oop;


/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public enum Months {
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    AUGUST("August");

    private String monthId;

     Months(String monthId) {
        this.monthId = monthId;
    }

    public String getMonthName() {
        return monthId;
    }
}
