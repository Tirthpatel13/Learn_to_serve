import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tilak");
        names.add("Kaushal");
        names.add("Juhil");
        names.add("Raj");
        names.add("Keyur");
        names.add("prit");
        names.add("tarang");
        names.add("tirth");
        names.add("harsh");
        names.add("kirtan");
        for (String name : names) {
            System.out.println(name);
        }

        Map<String,String> map=new HashMap<>();
        System.out.println("-----------------");
        map.put("name","tilak");
        map.put("name2","kaushal");
        System.out.println(map.get("name"));

        ArrayList<Integer> list=new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----------------");

        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        Random random2 = new Random();
        for (int i = 0; i < 10; i++) {
            list3.add(random2.nextInt(100) + 1);
        }
        System.out.println(list3);
        for (int i = 0; i < 10; i++) {
            list4.add(random2.nextInt(100) + 1);
        }
        System.out.println(list4);
        ArrayList<Integer> list5=new ArrayList<>();
        list5.addAll(list3);
        list5.addAll(list4);
        System.out.println(list5);
        System.out.println("-----------------");

        String a="whatisthisgoingon";
        Map<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            hashMap.put(a.charAt(i),
                    hashMap.getOrDefault(a.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}