package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hw02 {
    public static void main(String args[]) {
        Set<Train> trains = new HashSet<>();
        trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trains.add(new Train(118, "自強", "高雄", "台北", 500));
        trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trains.add(new Train(122, "自強", "台中", "花蓮", 600));
        trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));

        // 1. 印出不重複的 Train 物件 (使用 HashSet)
        // ... 添加其他 Train 物件
        for (Train train : trains) {
            System.out.println(train);
        }System.out.println();

        // 2. 按班次編號由大到小排序並印出 (使用 TreeSet)
        Set<Train> sortedTrains = new TreeSet<>();
        sortedTrains.addAll(trains);
       for (Train train : sortedTrains) {
            System.out.println(train);
        }System.out.println();

        // 3. 按班次編號由大到小排序，並使用 List 去重再印出 (使用 ArrayList 和 Collections.sort)
        List<Train> trainList = new ArrayList<>(trains);
        Collections.sort(trainList);
        for (Train train : trainList) {
            System.out.println(train);
        }
    }
}