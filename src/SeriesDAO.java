import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;

public class SeriesDAO {

    public Series readSerieFile(){
        Gson gson = new Gson();
        {
            try {
                JsonReader reader = new JsonReader(new java.io.FileReader("Datasets JSON/series_S.json"));
                Series series = gson.fromJson(reader, Series.class);
                return series;
            } catch (FileNotFoundException e) {
                System.out.println("Fitxer no trobat");
                e.printStackTrace();
            }
        }
        return null;
    }

}
