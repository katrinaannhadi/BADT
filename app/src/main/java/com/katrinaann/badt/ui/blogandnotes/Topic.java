package com.katrinaann.badt.ui.blogandnotes;

import java.util.ArrayList;

public class Topic {
    private String topic;
    private int topicNo;
    private String subTopic;
    private String information;

    public Topic() {
    }

    public Topic (String topic, int topicNo, String subTopic, String information) {
        this.topic = topic;
        this.topicNo = topicNo;
        this.subTopic = subTopic;
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

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public static ArrayList<Topic> getDesignThinking() {
        ArrayList<Topic> designThinkingList = new ArrayList<>();
        designThinkingList.add(new Topic("Design Thinking",1,"Empathise","This is the first step of Design Thinking"));
        designThinkingList.add(new Topic("Design Thinking",2,"Define","This is the second step of Design Thinking"));
        designThinkingList.add(new Topic("Design Thinking",3,"Ideate","This is the third step of Design Thinking"));
        designThinkingList.add(new Topic("Design Thinking",4,"Prototype","This is the fourth step of Design Thinking"));
        designThinkingList.add(new Topic("Design Thinking",5,"Testing","This is the last step of Design Thinking"));
        return designThinkingList;
    }

    public static ArrayList<Topic> getAgileSCRUM() {
        ArrayList<Topic> agileList = new ArrayList<>();
        agileList.add(new Topic("Agile SCRUM", 1,"Roles","This is the first topic of Agile"));
        agileList.add(new Topic("Agile SCRUM", 2,"Ceremonies","This is the second topic of Agile"));
        agileList.add(new Topic("Agile SCRUM", 3,"Artifacts","This is the third topic of Agile"));
        return agileList;
    }

    public static ArrayList<Topic> getLeanStartup() {
        ArrayList<Topic> leanStartupList = new ArrayList<>();
        leanStartupList.add(new Topic("Lean Startup", 1,"Roles","This is the first topic of Agile"));
        leanStartupList.add(new Topic("Lean Startup", 2,"Roles","This is the first topic of Agile"));
        leanStartupList.add(new Topic("Lean Startup", 3,"Roles","This is the first topic of Agile"));
        return leanStartupList;
    }

    public static ArrayList<Topic> getSDLC() {
        ArrayList<Topic> sdlcList = new ArrayList<>();
        sdlcList.add(new Topic("Systems Development Lifecycle", 1,"Roles","This is the first topic of Agile"));
        sdlcList.add(new Topic("Systems Development Lifecycle", 2,"Roles","This is the first topic of Agile"));
        sdlcList.add(new Topic("Systems Development Lifecycle", 3,"Roles","This is the first topic of Agile"));
        return sdlcList;
    }
}
