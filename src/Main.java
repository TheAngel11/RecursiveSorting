import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        SeriesDAO lecturaSeries = new SeriesDAO();
        Series serie = lecturaSeries.readSerieFile();
        MergeSort mergeSort = new MergeSort();
        Quicksort quicksort = new Quicksort();

        //controller.run();

        //MERGESORT
        System.out.println("--"+orderAverageScore(serie).size());
        ArrayList<Integer> mergeArray = mergeSort.mergeSort(orderAverageScore(serie), 0, orderAverageScore(serie).size() - 1);
        for (int a: mergeArray) {
            System.out.println(a);
        }

        //QUICKSORT
        ArrayList<Float> premiereList = dataPremiere(serie);
        int i = 0, j = premiereList.size() -1;
        quicksort.quickSort(premiereList, i, j);
        //print del quicksort
       // for (Float value : premiereList) System.out.print(value + "-");
        System.out.println("Sorting by start date (year/month/day)\n");
        for (int k = 0; k < serie.getSeries().length; k++) {
            System.out.print(serie.getSeries()[i].messageDate());
        }

    }

    /**
     *
     * @param serie
     * @return
     */
    private static ArrayList<Float> dataPremiere(Series serie) {
        ArrayList<Float> premiereList = new ArrayList<>();

        for (int i = 0; i < serie.getSeries().length; i++) {
            premiereList.add(serie.getSeries()[i].dateToYear());
        }
        return premiereList;
    }

    /**
     *
     * @param serie
     * @return
     */
    private static ArrayList<Integer> orderAverageScore(Series serie){
        ArrayList<Integer> averageList = new ArrayList<>();

        for (int i = 0; i < serie.getSeries().length; i++) {
            averageList.add(serie.getSeries()[i].getAverageScore());
        }
        return averageList;
    }

}




