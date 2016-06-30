package com.example.android.montrealtourguide;

public class Attraction {
    private String name;
    private String street = NO_STREET;
    private String city = NO_CITY; //Montreal has several small cities on its territory
    private String postalCode = NO_POSTAL_CODE;
    private String dates = NO_DATES;
    private int ImageResourceID = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private static final String NO_STREET ="No street";
    private static final String NO_CITY = "No city";
    private static final String NO_POSTAL_CODE = "No postal code";
    private static final String NO_DATES = "No dates";

    Attraction (String name, String street, String city, String postalCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    Attraction (String name, String street, String city, String postalCode, int ImageResourceID) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.ImageResourceID = ImageResourceID;
    }

    Attraction (String name, String dates) {
        this.name = name;
        this.dates = dates;
    }

    String getName(){
        return name;
    }

    String getStreet(){
        return street;
    }
    String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public String getDates() {
        return dates;
    }

    void setName(String name){
        this.name = name;
    }

    void setStreet(String street){
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public boolean hasImage() {
        return (ImageResourceID != NO_IMAGE);
    }

    public boolean hasStreet(){
        return (!street.equals(NO_STREET));
    }

    public boolean hasCity(){
        return(!city.equals(NO_CITY));
    }

    public boolean hasPostalCode(){
        return(!postalCode.equals(NO_POSTAL_CODE));
    }

    public boolean hasDates(){
        return(!dates.equals(NO_DATES));
    }
}
