package com.example.inclass07;


import java.io.Serializable;

public class TrackDetails implements Serializable {
    String track_name, album_name, artist_name, updated_time, track_share_url;

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getTrack_share_url() {
        return track_share_url;
    }

    public void setTrack_share_url(String track_share_url) {
        this.track_share_url = track_share_url;
    }
}
