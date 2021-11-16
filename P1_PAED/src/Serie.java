public class Serie {
    private int popularity;
    private int averageScore;
    private int favourites;
    private String type;
    private String[] genres;
    private StartDate startDate;

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
}