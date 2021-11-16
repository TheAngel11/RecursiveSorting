import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;

public class SeriesReader {

    public Serie readSerie(){
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new java.io.FileReader("Datasets JSON/series_S.json"));
            System.out.println("Ha entrat al fitxer");
            Series series = gson.fromJson(reader, Series.class);
            System.out.println(series.getSeries()[0].getPopularity());
        } catch (FileNotFoundException e){
            System.out.println("Fitxer no trobat");
            e.printStackTrace();

        }
        return null;
    }

}
