import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[]args){
        
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> frekanslar = new HashMap<>();

        for (int sayi : dizi) {
            int frekans = frekanslar.getOrDefault(sayi, 0);
            frekanslar.put(sayi, frekans + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            int sayi = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(sayi + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}
