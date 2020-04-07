package com.example.infs3634groupassignmentlocal;

import java.util.ArrayList;

public class DesignThinking {
    private int topicNo;
    private String topic;
    private String information;

    public DesignThinking() {
    }

    public DesignThinking (int topicNo, String topic, String information) {
        this.topicNo = topicNo;
        this.topic = topic;
        this.information = information;
    }

    public int getTopicNo() {
        return topicNo;
    }

    public void setTopicNo(int topicNo) {
        this.topicNo = topicNo;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    public static ArrayList<DesignThinking> getDesignThinking() {
        ArrayList<DesignThinking> designThinkingList = new ArrayList<>();
        designThinkingList.add(new DesignThinking(1,"Empathise","This is the first step of Design Thinking"));
        designThinkingList.add(new DesignThinking(2,"Define","This is the second step of Design Thinking"));
        designThinkingList.add(new DesignThinking(3,"Ideate","This is the third step of Design Thinking"));
        designThinkingList.add(new DesignThinking(4,"Prototype","This is the fourth step of Design Thinking"));
        designThinkingList.add(new DesignThinking(5,"Testing","This is the last step of Design Thinking"));
        return designThinkingList;
    }
}


