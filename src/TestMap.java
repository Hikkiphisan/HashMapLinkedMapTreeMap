import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Loc",123);
        hashmap.put("Dung",133);
        hashmap.put("Tri",233);
        hashmap.put("Nhat",236);
        hashmap.put("Thang",532);
        hashmap.put("Hung",54);
        System.out.println(hashmap);
        Map<String,Integer> treemap = new TreeMap<>(hashmap); //Sap xep theo thu tu
        System.out.println(treemap.get("Hung"));;

        Map<String,Integer> linkedhashmap  = new LinkedHashMap<>(12,0.75f,true);
        linkedhashmap.put("ろく",112);
        linkedhashmap.put("すばる",112);
        linkedhashmap.put("かしら",112);
        linkedhashmap.put("なつき",112);
        System.out.println(linkedhashmap.get(112));




    }
}
