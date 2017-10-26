package com.teamtreehouse.model;

public class SongRequest {
    private String mSingerName;
    private Song mSong;

    public SongRequest(String singerName, Song song) {
        mSingerName = singerName;
        mSong = song;
    }

    public void setSingerName(String singerName) {
        mSingerName = singerName;
    }

    public void setSong(Song song) {
        mSong = song;
    }

    public String getSingerName() {

        return mSingerName;
    }
    public Song getSong() {
        return mSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongRequest that = (SongRequest) o;

        if (!this.mSingerName.equals(that.mSingerName)) return false;
        return this.mSong.equals(that.mSong);

    }

    @Override
    public int hashCode() {
        int result = mSingerName.hashCode();
        result = 31 * result + this.mSong.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SongRequest{" +
                "mSingerName='" + mSingerName + '\'' +
                ", mSong=" + mSong +
                '}';
    }

}
