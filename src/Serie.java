public class Serie {
    private Title title;
    private int popularity;
    private int averageScore;
    private int favourites;
    private String type;
    private String[] genres;
    private StartDate startDate;

    public Serie(Title title, int popularity, int averageScore, int favourites, String type, String[] genres, StartDate startDate) {
        this.title = title;
        this.popularity = popularity;
        this.averageScore = averageScore;
        this.favourites = favourites;
        this.type = type;
        this.genres = genres;
        this.startDate = startDate;
    }

    public Title getTitle() {
        return title;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public int getFavourites() {
        return favourites;
    }

    public String getType() {
        return type;
    }

    public String[] getGenres() {
        return genres;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public float dateToYear() {
        int year = startDate.getYear();
        int month = startDate.getMonth();
        int day = startDate.getDay();
        final float MONTH_TO_YEAR = 0.0833f;
        final float DAY_TO_YEAR = 0.00277f;

        float releaseDate = year + MONTH_TO_YEAR* month + DAY_TO_YEAR * day;
        return releaseDate;

    }

    public String messageDate (){
        return " ("+startDate.getYear()+"/"+startDate.getMonth()+"/"+startDate.getDay()+") <";
    }

}