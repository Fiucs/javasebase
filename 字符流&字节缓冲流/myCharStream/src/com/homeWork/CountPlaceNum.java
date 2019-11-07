package com.homeWork;

import java.io.*;
import java.util.*;

public class CountPlaceNum {

    public static void main(String[] args) throws IOException {

        BufferedReader isr=new BufferedReader(new FileReader("字符流&字节缓冲流\\myCharStream\\student.txt"));
        BufferedWriter osw=new BufferedWriter(new FileWriter("字符流&字节缓冲流\\myCharStream\\placenum.txt"));
        TreeMap<String,Integer> tr=new TreeMap<String, Integer>() ;
        //按键值排序
        Comparator<Map.Entry<String,Integer>> newComparator=new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        };

        String str="";
        while ((str=isr.readLine())!=null)
        {
            String[] s = str.split(" ");
            System.out.println(str);
            if(s.length==3&&tr.get(s[2])!=null){
                int value=tr.get(s[2]);
                tr.put(s[2],value+1);

            }else if(s.length==3)
            {
            tr.put(s[2],1);
            }
        }

        //treemap 存了数据

        List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String, Integer>>(tr.entrySet());
        Collections.sort(list,newComparator);

        for (Map.Entry<String,Integer> entry :list) {
            System.out.println(entry.getKey()+" "+entry.getValue());

            osw.write(entry.getKey()+" "+entry.getValue());
            osw.newLine();

        }

        osw.flush();
        isr.close();
        osw.close();

    }
}
