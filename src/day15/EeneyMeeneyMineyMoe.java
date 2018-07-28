package day15;

import java.util.LinkedList;
import java.util.Queue;

public class EeneyMeeneyMineyMoe extends LinkedList{

    public String eeneyMeeneyMineyMoe(int n){
        Queue<String> qq = new LinkedList<>();
        qq = this;
        int count = 0;
        String it;

        while(qq.size() > 1) {
            it = qq.poll();
            count++;

            if(count % n != 0) {
                qq.add(it);
            }
        }

        return qq.toString();
    }
}
