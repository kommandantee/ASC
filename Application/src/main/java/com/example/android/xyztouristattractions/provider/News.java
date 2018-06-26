package com.example.android.xyztouristattractions.provider;

/**
 * Created by jose on 05/03/2017.
 */

public class News {

    private String categoryNews;
    private String timeNews;
    private String toplulukismi;
    private String hakkindabilgi;


    public News(String categoryNews, String timeNews, String summaryNews, String hakkindabilgi){
        this.categoryNews = categoryNews;
        this.timeNews     = timeNews;
        this.toplulukismi  = summaryNews;
        this.hakkindabilgi = hakkindabilgi;
    }

    public News(){

    }



    public String getCategoryNews() {
        return categoryNews;
    }

    public void setCategoryNews(String categoryNews) {
        this.categoryNews = categoryNews;
    }

    public String getTimeNews() {
        return timeNews;
    }

    public void setTimeNews(String timeNews) {
        this.timeNews = timeNews;
    }

    public void setHakkindabilgi(String hakkindabilgi) {
        this.hakkindabilgi = hakkindabilgi;
    }

    public String getHakkindabilgi() {
        return hakkindabilgi;
    }

    public String getToplulukismi() {
        return toplulukismi;
    }

    public void setToplulukismi(String summaryNews) {
        this.toplulukismi = summaryNews;
    }
}
