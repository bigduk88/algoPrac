package com.algoprac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Develop {
    public int[] solution(int[] progresses, int[] speeds) {
    Queue<Progress> q=  new LinkedList<>();
    List<Integer> temp = new ArrayList<>();
    for(int i =0 ; i < progresses.length ; i++){
        int cur_p = progresses[i];
        int cur_s = speeds[i];


        int remain = 100 - cur_p;
        int finish_day = remain / cur_s;
        int mod = remain % cur_s;

        if(mod > 0)
            finish_day ++;


        if(q.isEmpty()){
            q.add(new Progress(finish_day,1));
        }else{
            if(q.peek().finish >= finish_day){
                //첫 작업이 오래 걸리는 경우
                q.peek().count += 1;
            }else{
                temp.add(q.poll().count);
                q.add(new Progress(finish_day,1));
            }
        }
    }

    if(!q.isEmpty())
        temp.add(q.poll().count);

    int [] ret = new int[temp.size()];

    for(int i =0 ; i < ret.length;  i++){
        ret[i] = temp.get(i);
    }

    return ret;
}

    private class Progress{
        int finish, count;

        public Progress(int f, int c){
            this.finish = f;
            this.count= c;
        }
    }
}