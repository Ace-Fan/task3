package com.wufan.task1;

public class Job {

    //作业名称
    private String name;
    //作业进入时间
    private String startTime;
    //作业完成时间
    private String endTime;
    //作业估计运行时间
    private int executeTime;
    //作业估计运行时间的剩余时间
    private int executeRemainingTime;
    //进入时间对应的小时
    private int startHour;
    //进入时间对应的分钟
    private int startMinute;
    //开始执行时间对应的小时
    private int executeHour;
    //开始执行时间对应的分钟
    private int executeMinute;
    //开始执行的时间
    private String executeStartTime;
    //结束时间对应的小时
    private int endHour;
    //结束时间对应的分钟
    private int endMinute;
    //周转时间，用分钟记
    private int turnOverTime;
    //带权周转时间
    private double weightedTurnOverTime;
    //标记该作业是否执行完成
    private boolean state;
    //标记作业是否在内存
    private boolean inMemory;
    //标记是否是第一次执行
    private boolean firstExecute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(int executeTime) {
        this.executeTime = executeTime;
    }

    public int getExecuteRemainingTime() {
        return executeRemainingTime;
    }

    public void setExecuteRemainingTime(int executeRemainingTime) {
        this.executeRemainingTime = executeRemainingTime;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getExecuteHour() {
        return executeHour;
    }

    public void setExecuteHour(int executeHour) {
        this.executeHour = executeHour;
    }

    public int getExecuteMinute() {
        return executeMinute;
    }

    public void setExecuteMinute(int executeMinute) {
        this.executeMinute = executeMinute;
    }

    public String getExecuteStartTime() {
        return executeStartTime;
    }

    public void setExecuteStartTime(String executeStartTime) {
        this.executeStartTime = executeStartTime;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public int getTurnOverTime() {
        return turnOverTime;
    }

    public void setTurnOverTime(int turnOverTime) {
        this.turnOverTime = turnOverTime;
    }

    public double getWeightedTurnOverTime() {
        return weightedTurnOverTime;
    }

    public void setWeightedTurnOverTime(double weightedTurnOverTime) {
        this.weightedTurnOverTime = weightedTurnOverTime;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isInMemory() {
        return inMemory;
    }

    public void setInMemory(boolean inMemory) {
        this.inMemory = inMemory;
    }

    public boolean isFirstExecute() {
        return firstExecute;
    }

    public void setFirstExecute(boolean firstExecute) {
        this.firstExecute = firstExecute;
    }


    public boolean getState() {
    }
}
