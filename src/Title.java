import com.google.gson.annotations.SerializedName;

public class Title {
    private String romanji;
    private String english;
    @SerializedName("native") private String nativeLenguage;

    public Title(String romanji, String english, String nativeLenguage) {
        this.romanji = romanji;
        this.english = english;
        this.nativeLenguage = nativeLenguage;
    }

    public String getRomanji() {
        return romanji;
    }

    public String getEnglish() {
        return english;
    }

    public String getNativeLenguage() {
        return nativeLenguage;
    }
}
