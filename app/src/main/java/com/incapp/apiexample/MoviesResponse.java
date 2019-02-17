package com.incapp.apiexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("status_message")
    @Expose
    private String statusMessage;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("@meta")
    @Expose
    private Meta meta;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public class Data {

        @SerializedName("movie_count")
        @Expose
        private long movieCount;
        @SerializedName("limit")
        @Expose
        private Long limit;
        @SerializedName("page_number")
        @Expose
        private Long pageNumber;
        @SerializedName("movies")
        @Expose
        private List<Movie> movies = null;

        public long getMovieCount() {
            return movieCount;
        }

        public void setMovieCount(long movieCount) {
            this.movieCount = movieCount;
        }

        public Long getLimit() {
            return limit;
        }

        public void setLimit(Long limit) {
            this.limit = limit;
        }

        public Long getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
        }

        public List<Movie> getMovies() {
            return movies;
        }

        public void setMovies(List<Movie> movies) {
            this.movies = movies;
        }

    }

    public class Meta {

        @SerializedName("server_time")
        @Expose
        private Long serverTime;
        @SerializedName("server_timezone")
        @Expose
        private String serverTimezone;
        @SerializedName("api_version")
        @Expose
        private Long apiVersion;
        @SerializedName("execution_time")
        @Expose
        private String executionTime;

        public Long getServerTime() {
            return serverTime;
        }

        public void setServerTime(Long serverTime) {
            this.serverTime = serverTime;
        }

        public String getServerTimezone() {
            return serverTimezone;
        }

        public void setServerTimezone(String serverTimezone) {
            this.serverTimezone = serverTimezone;
        }

        public Long getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(Long apiVersion) {
            this.apiVersion = apiVersion;
        }

        public String getExecutionTime() {
            return executionTime;
        }

        public void setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
        }

    }

    public class Movie {

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("imdb_code")
        @Expose
        private String imdbCode;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("title_english")
        @Expose
        private String titleEnglish;
        @SerializedName("title_long")
        @Expose
        private String titleLong;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("year")
        @Expose
        private Long year;
        @SerializedName("rating")
        @Expose
        private Double rating;
        @SerializedName("runtime")
        @Expose
        private Long runtime;
        @SerializedName("genres")
        @Expose
        private List<String> genres = null;
        @SerializedName("summary")
        @Expose
        private String summary;
        @SerializedName("description_full")
        @Expose
        private String descriptionFull;
        @SerializedName("synopsis")
        @Expose
        private String synopsis;
        @SerializedName("yt_trailer_code")
        @Expose
        private String ytTrailerCode;
        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("mpa_rating")
        @Expose
        private String mpaRating;
        @SerializedName("background_image")
        @Expose
        private String backgroundImage;
        @SerializedName("background_image_original")
        @Expose
        private String backgroundImageOriginal;
        @SerializedName("small_cover_image")
        @Expose
        private String smallCoverImage;
        @SerializedName("medium_cover_image")
        @Expose
        private String mediumCoverImage;
        @SerializedName("large_cover_image")
        @Expose
        private String largeCoverImage;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("torrents")
        @Expose
        private List<Torrent> torrents = null;
        @SerializedName("date_uploaded")
        @Expose
        private String dateUploaded;
        @SerializedName("date_uploaded_unix")
        @Expose
        private Long dateUploadedUnix;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImdbCode() {
            return imdbCode;
        }

        public void setImdbCode(String imdbCode) {
            this.imdbCode = imdbCode;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitleEnglish() {
            return titleEnglish;
        }

        public void setTitleEnglish(String titleEnglish) {
            this.titleEnglish = titleEnglish;
        }

        public String getTitleLong() {
            return titleLong;
        }

        public void setTitleLong(String titleLong) {
            this.titleLong = titleLong;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public Long getYear() {
            return year;
        }

        public void setYear(Long year) {
            this.year = year;
        }

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public Long getRuntime() {
            return runtime;
        }

        public void setRuntime(Long runtime) {
            this.runtime = runtime;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getDescriptionFull() {
            return descriptionFull;
        }

        public void setDescriptionFull(String descriptionFull) {
            this.descriptionFull = descriptionFull;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public String getYtTrailerCode() {
            return ytTrailerCode;
        }

        public void setYtTrailerCode(String ytTrailerCode) {
            this.ytTrailerCode = ytTrailerCode;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getMpaRating() {
            return mpaRating;
        }

        public void setMpaRating(String mpaRating) {
            this.mpaRating = mpaRating;
        }

        public String getBackgroundImage() {
            return backgroundImage;
        }

        public void setBackgroundImage(String backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        public String getBackgroundImageOriginal() {
            return backgroundImageOriginal;
        }

        public void setBackgroundImageOriginal(String backgroundImageOriginal) {
            this.backgroundImageOriginal = backgroundImageOriginal;
        }

        public String getSmallCoverImage() {
            return smallCoverImage;
        }

        public void setSmallCoverImage(String smallCoverImage) {
            this.smallCoverImage = smallCoverImage;
        }

        public String getMediumCoverImage() {
            return mediumCoverImage;
        }

        public void setMediumCoverImage(String mediumCoverImage) {
            this.mediumCoverImage = mediumCoverImage;
        }

        public String getLargeCoverImage() {
            return largeCoverImage;
        }

        public void setLargeCoverImage(String largeCoverImage) {
            this.largeCoverImage = largeCoverImage;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<Torrent> getTorrents() {
            return torrents;
        }

        public void setTorrents(List<Torrent> torrents) {
            this.torrents = torrents;
        }

        public String getDateUploaded() {
            return dateUploaded;
        }

        public void setDateUploaded(String dateUploaded) {
            this.dateUploaded = dateUploaded;
        }

        public Long getDateUploadedUnix() {
            return dateUploadedUnix;
        }

        public void setDateUploadedUnix(Long dateUploadedUnix) {
            this.dateUploadedUnix = dateUploadedUnix;
        }

    }

    public class Torrent {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("hash")
        @Expose
        private String hash;
        @SerializedName("quality")
        @Expose
        private String quality;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("seeds")
        @Expose
        private Long seeds;
        @SerializedName("peers")
        @Expose
        private Long peers;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("size_bytes")
        @Expose
        private Long sizeBytes;
        @SerializedName("date_uploaded")
        @Expose
        private String dateUploaded;
        @SerializedName("date_uploaded_unix")
        @Expose
        private Long dateUploadedUnix;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Long getSeeds() {
            return seeds;
        }

        public void setSeeds(Long seeds) {
            this.seeds = seeds;
        }

        public Long getPeers() {
            return peers;
        }

        public void setPeers(Long peers) {
            this.peers = peers;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Long getSizeBytes() {
            return sizeBytes;
        }

        public void setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
        }

        public String getDateUploaded() {
            return dateUploaded;
        }

        public void setDateUploaded(String dateUploaded) {
            this.dateUploaded = dateUploaded;
        }

        public Long getDateUploadedUnix() {
            return dateUploadedUnix;
        }

        public void setDateUploadedUnix(Long dateUploadedUnix) {
            this.dateUploadedUnix = dateUploadedUnix;
        }

    }

}