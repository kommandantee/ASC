package com.example.android.xyztouristattractions.provider;

import android.os.AsyncTask;
import android.os.StrictMode;

import com.example.android.xyztouristattractions.provider.TouristAttractions;
import com.example.android.xyztouristattractions.provider.News;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jose on 07/03/2017.
 */

public class NewsRequest extends AsyncTask<Void, Void, List<News>> {

    private WeakReference<TouristAttractions> activity;

    static public String temp = null;

    public NewsRequest(TouristAttractions activity){
        this.activity = new WeakReference<>(activity);
    }



    @Override
    protected List<News> doInBackground(Void... params) {

        List<News> newses = new ArrayList<>();

        try {
            Document html = Jsoup.connect("https://www.atilim.edu.tr/tr/kultur/page/2497/ogrenci-topluluklari").get();

            //    Elements category = html.select("ul.list-fol li section a");
            //  Elements time     = html.select("ul.list-fol li time");
            Elements summary  = html.select("table tr td");
            for (int i = 0; i < summary.size()-3; i+=3) {
                News news = new News();

                //    news.setCategoryNews(category.get(i).text());
                //  news.setTimeNews(time.get(i).text());
                news.setToplulukismi(summary.get(i).text());
                newses.add(news);
                temp = summary.get(i).text();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newses;
    }
/*
    @Override
    protected void onPostExecute(List<News> newsList) {
        super.onPostExecute(newsList);

        if (activity.get() != null) {
            activity.get().updateLista(newsList);
        }
    }*/
}
