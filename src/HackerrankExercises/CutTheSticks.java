//package HackerrankExercises;

//import java.util.*;
//
//public class CutTheSticks {
//    public static void main(String[] args) {
//        public static List<Integer> cutTheSticks(List<Integer> arr){
//            Collections.sort(arr);
//            Map<Integer, Integer> map = new LinkedHashMap<>();
//
//            for (int i: arr){
//                if (map.containsKey(i)){
//                    map.put(i, map.get(i)+1);
//                } else {
//                    map.put(i, 1);
//                }
//            }
//            List<Integer> list = new ArrayList<>();
//            int size = arr.size();
//            int mapSize = map.size();
//            int count = 0;
//
//            list.add(size);
//            for (Map.Entry entry: map.entrySet()) {
//                if (count != mapSize - 1) {
//                    size = size - (int)entry.getValue();
//                    list.add(size);
//                    count++;
//                }
//            }
//            return list;
//        }
//    }
//}
