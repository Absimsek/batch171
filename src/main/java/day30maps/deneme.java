package day30maps;

import java.util.HashMap;
import java.util.Set;

public class deneme {

    public static void main(String[] args) {

        HashMap<String,Integer> countryPopulation= new HashMap();
        countryPopulation.put("Germany", 83000);
        countryPopulation.put("ıtaly",346457);
        countryPopulation.put("turkey", 77778);
        countryPopulation.put("USA",55555);
        countryPopulation.put("china",66666);

        System.out.println((countryPopulation));

        int usaPop=countryPopulation.get("USA");
        System.out.println(usaPop);

        Set<String> keys= countryPopulation.keySet();
        System.out.println(keys);





    }
}

