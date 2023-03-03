package com.example.myapplication;


public class TourismAreaList {

    private int idTour;
    private String titleTour, locationTour;
    private int imageTour;

    public TourismAreaList(int idTour, String titleTour, String locationTour, int imageTour) {
        this.idTour = idTour;
        this.titleTour = titleTour;
        this.locationTour = locationTour;
        this.imageTour = imageTour;
    }

    public int getIdTour() {
        return idTour;
    }

    public String getTitleTour() {
        return titleTour;
    }

    public String getLocationTour() {
        return locationTour;
    }

    public int getImageTour() {
        return imageTour;
    }
}
