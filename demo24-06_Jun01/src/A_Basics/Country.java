package A_Basics;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private ArrayList cityList;

    public Country(String countryName, String cityName, ArrayList cityList) {
        this.countryName = countryName;
        this.cityList = cityList;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList cityList) {
        this.cityList = cityList;
    }


}
