package com.wufan.task1;


public class JobComparator implements Comparable<Job>{

    @Override
    public int compareTo(Job job1, Job job2) {
        if(job1.getStartHour() < job2.getStartHour()){
            return -1;
        }else if(job1.getStartHour() > job2.getStartHour()){
            return 1;
        }else{
            if(job1.getStartMinute() < job2.getStartMinute()){
                return -1;
            }else if(job1.getStartMinute() > job2.getStartMinute()){
                return 1;
            }else{
                return 0;
            }
        }
    }

}
