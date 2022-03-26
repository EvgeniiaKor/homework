package hw6.task1;

public class Mountain {
    // название ( не менее 4 символов)
    // страна ( не менее 4 символов)
    // высота ( не менее 100м)

    private String mName;
    private String country;
    private int high;


    public void setmName(String mName) {
        if (mName == null || mName.length() < 4) {
            throw new IllegalArgumentException("Значение mName от 4 символов");
        }
        this.mName = mName;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Значение country от 4 символов");
        }
        this.country = country;
    }

    public void setHigh(int high) {
        if (high < 100) {
            throw new IllegalArgumentException("Значение high от 100 метров");
        }
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    public String getmName() {
        return mName;
    }

    public String getCountry() {
        return country;
    }

    public Mountain(String mName, String country, int high) {
        setmName(mName);
        setCountry(country);
        setHigh(high);
    }
}