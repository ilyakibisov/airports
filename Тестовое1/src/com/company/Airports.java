package com.company;

public class Airports  {

    private int id;
    private String name;
    private String town;
    private String country;
    private String codeA;
    private String codeB;
    private String coordinateA;
    private String coordinateB;
    private String coordinateC;
    private String coordinateD;
    private String Side;
    private String location;
    private String airport;
    private String our;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCodeA() {
        return codeA;
    }

    public void setCodeA(String codeA) {
        this.codeA = codeA;
    }

    public String getCodeB() {
        return codeB;
    }

    public void setCodeB(String codeB) {
        this.codeB = codeB;
    }

    public String getCoordinateA() {
        return coordinateA;
    }

    public void setCoordinateA(String coordinateA) {
        this.coordinateA = coordinateA;
    }

    public String getCoordinateB() {
        return coordinateB;
    }

    public void setCoordinateB(String coordinateB) {
        this.coordinateB = coordinateB;
    }

    public String getCoordinateC() {
        return coordinateC;
    }

    public void setCoordinateC(String coordinateC) {
        this.coordinateC = coordinateC;
    }

    public String getCoordinateD() {
        return coordinateD;
    }

    public void setCoordinateD(String coordinateD) {
        this.coordinateD = coordinateD;
    }

    public String getSide() {
        return Side;
    }

    public void setSide(String side) {
        Side = side;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getOur() {
        return our;
    }

    public void setOur(String our) {
        this.our = our;
    }

    public String toString(){
        return getName()+  " " + getId() + " " +  getTown() + " " + getCountry() + " " + getCodeA() + " " + getCodeB() + " " + getCoordinateA() + " " + getCoordinateB() + " " + getCoordinateC() + " " + getCoordinateD() + " " + getSide() + " " + getLocation() + " " + getAirport() + " " + getOur();
    }

}
