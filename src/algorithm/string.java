package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class string {
    public static void main(String[] args) {
        String[] test1 = new String[]{"1","2","3","4","5"};
        String[] test2 = new String[]{"3","4","5","6","7"};
        HashMap<String,Integer> map = new HashMap();

        for(String str : test1){
            map.put(str,0);
        }

        for(String str : test2){
            if(map.containsKey(str)) map.put(str,1);
        }
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(test1));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(test2));

        for(String str : map.keySet()){
            if(map.get(str) == 1){
                list1.remove(str);
                list2.remove(str);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
