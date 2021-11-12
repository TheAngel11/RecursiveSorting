import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader("C:\\Users\\angel\\IdeaProjects\\P1_PAED\\Datasets JSON\\series_S.json"));
            System.out.println("Ha entrat al fitxer");
            Series series = gson.fromJson(reader, Series.class);
            System.out.println(series.getSeries()[0].getPopularity());
        } catch (FileNotFoundException e){
            System.out.println("Fitxer no trobat");
            e.printStackTrace();

        }
    }
}




