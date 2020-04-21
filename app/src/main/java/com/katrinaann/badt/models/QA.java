package com.katrinaann.badt.models;

import java.util.ArrayList;

// The class for QA - QuestionAnswer
// This is essentially essentially the question bank
public class QA {
    private int ID;
    private String question;
    private String answer;

    // Class constructors
    public QA() {
    }

    public QA(int ID, String question, String answer) {
        this.ID = ID;
        this.question = question;
        this.answer = answer;
    }

    // Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String name) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Question bank for quiz 'Introduction to Business Analysis'
    public static ArrayList<QA> getQAs1() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Introduction to Business Analysis"));
        QAs.add(new QA(1, "Which Business Analysis Core Concept is defined as the “act of transformation in response to a need”?", "Change"));
        QAs.add(new QA(2, "Which Business Analysis Core Concept is defined as a “problem or opportunity to be addressed”?", "Need"));
        QAs.add(new QA(3, "Which Business Analysis Core Concept is defined as a “specific way of satisfying one or more needs”?", "Solution"));
        QAs.add(new QA(4, "Which Business Analysis Core Concept is defined as a “group or individual with a relationship to the solution”?", "Stakeholder"));
        QAs.add(new QA(5, "Which Business Analysis Core Concept is defined as the “worth or importance of something to a stakeholder”?", "Value"));
        QAs.add(new QA(6, "Which Business Analysis Core Concept is defined as the “circumstances that influence/are influenced by change”?", "Context"));
        QAs.add(new QA(7, "Which Business Analysis Role is characterised by having a limited function and single roles per person?", "Conservative"));
        QAs.add(new QA(8, "Which Business Analysis Role is characterised by having defined roles across cross-functional teams?", "Progressive"));
        QAs.add(new QA(9, "Which Business Analysis Role is characterised by having customisable roles across cross-functional teams?", "Avant-Garde"));
        return QAs;
    }

    // Question bank for quiz 'Project Management'
    public static ArrayList<QA> getQAs2() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Project Management"));
        QAs.add(new QA(1, "Which aspect of a System Request is defined as the “primary point of contact for the project”?", "Project Sponsor"));
        QAs.add(new QA(2, "Which aspect of a System Request is defined as the “reason for prompting the project”?", "Business Need"));
        QAs.add(new QA(3, "Which aspect of a System Request is defined as “what the system will achieve”?", "Business Requirements"));
        QAs.add(new QA(4, "Which aspect of a System Request is defined as “how the organisation will benefit from the project”?", "Business Value"));
        QAs.add(new QA(5, "Which aspect of a System Request is defined as “anything else which should be considered”?", "Special Issues and Constraints"));
        QAs.add(new QA(6, "Which type of Feasibility asks “is the project buildable”?", "Technical Feasibility"));
        QAs.add(new QA(7, "Which type of Feasibility asks “will the project generate a positive ROI”?", "Economic Feasibility"));
        QAs.add(new QA(8, "Which type of Feasibility asks “will the potential users embrace the system”?", "Organisational Feasibility"));
        QAs.add(new QA(9, "Which Stakeholder Analysis Technique is defined as “mapping stakeholders by their influence and closeness to a project”?", "Stakeholder Rainbow"));
        QAs.add(new QA(10, "Which Stakeholder Analysis Technique is defined as “mapping stakeholders by their Interest and Influence to a project”?", "Interest-Mapping"));
        QAs.add(new QA(11, "Which aspect of Project Selection is defined as as “selecting what work is required in the project”?", "Scope Management"));
        QAs.add(new QA(12, "Which aspect of Project Selection is defined as “identifying and assessing sources of risk in a project”?", "Risk Management"));
        QAs.add(new QA(13, "Which aspect of Project Selection is defined as “matching individuals to their required activities in a project”?", "Project Staffing"));
        QAs.add(new QA(14, "Which aspect of Project Selection is defined as “converting System Requirements into Functional/Nonfunctional Requirements”?", "Requirements Determination"));
        QAs.add(new QA(15, "Which Requirements Analysis Strategy focuses on small changes?", "Business Process Automation"));
        QAs.add(new QA(16, "Which Requirements Analysis Strategy focuses on medium changes?", "Business Process Improvement"));
        QAs.add(new QA(17, "Which Requirements Analysis Strategy focuses on significant changes?", "Business Process Reengineering"));
        return QAs;
    }

    // Question bank for quiz 'Requirements Gathering and Modelling'
    public static ArrayList<QA> getQAs3() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Requirements Gathering and Modelling"));
        QAs.add(new QA(1, "Which Requirements Gathering Technique is defined as a “person-to-person conversation with a stakeholder”?", "Interviews"));
        QAs.add(new QA(2, "Which Requirements Gathering Technique is defined as a “program where users and analysts work to brainstorm solutions”?", "JAD Workshops"));
        QAs.add(new QA(3, "Which Requirements Gathering Technique is defined as a “set of written questions to collect large amounts of data”?", "Surveys"));
        QAs.add(new QA(4, "Which Requirements Gathering Technique is defined as “providing technical information on the as-is system”?", "Document Analysis"));
        QAs.add(new QA(5, "Which Requirements Modelling Technique helps model the relationship between a user and a system?", "Use-Case Diagrams"));
        QAs.add(new QA(6, "Which Requirements Modelling Technique helps model the flow and logic of a specific use-case?", "Activity Diagrams"));
        QAs.add(new QA(7, "Which Requirements Modelling Technique helps model the attributes of an object?", "Class Diagrams"));
        QAs.add(new QA(8, "Which Requirements Modelling Technique helps model the dynamic and real-life timings of a use-case?", "Sequence Diagrams"));
        QAs.add(new QA(9, "Which Requirements Modelling Technique helps model the changes in classes?", "Behavioural State Machines"));
        return QAs;
    }

    // Question bank for quiz 'Design Thinking'
    public static ArrayList<QA> getQAs4() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Design Thinking"));
        QAs.add(new QA(1, "Which attribute of Design Thinking is defined as “involving the client in every step of the process?", "Human-Centered"));
        QAs.add(new QA(2, "Which attribute of Design Thinking is defined as “constantly working with many team members”?", "Radical Collaboration"));
        QAs.add(new QA(3, "Which attribute of Design Thinking is defined as “creating regular prototypes to solicit feedback”?", "Culture of Prototyping"));
        QAs.add(new QA(4, "Which attribute of Design Thinking is defined as “being visual when representing ideas”?", "Show Don’t Tell"));
        QAs.add(new QA(5, "Which attribute of Design Thinking is defined as “doing more and talking less”?", "Bias towards Action"));
        QAs.add(new QA(6, "Which attribute of Design Thinking is defined as “constantly reflecting on how to improve processes”?", "Mindful of Process"));
        QAs.add(new QA(7, "Which activity in the Empathise Stage is defined as “personalised conversations to better understand client needs”?", "Interviews"));
        QAs.add(new QA(8, "Which activity in the Empathise Stage is defined as “finding the human cause in defects through repetitive analysis”?", "Five Whys Root Cause Analysis"));
        QAs.add(new QA(9, "Which activity in the Empathise Stage is defined as “presenting the feelings, influences, painpoints, and goals of clients”?", "Empathy Maps"));
        QAs.add(new QA(10, "Which activity in the Define Stage is defined as “consolidating the popular opinions of clients from interviews”?", "Thematic Analysis"));
        QAs.add(new QA(11, "Which activity in the Define Stage is represented by “[User] needs to [Action] because [Insight]”?", "POV Statements"));
        QAs.add(new QA(12, "Which activity in the Ideate Stage is defined as “using mind maps to generate many potential solutions”?", "Diverging"));
        QAs.add(new QA(13, "Which activity in the Ideate Stage is defined as “using criteria-based choice marking to find the most relevant solutions”?", "Converging"));
        QAs.add(new QA(14, "Which Tool in the Prototype/Test Phase includes Paper and Mocks?", "Low Fidelity Representation"));
        QAs.add(new QA(15, "Which Tool in the Prototype/Test Phase includes Code and Physical?", "High Fidelity Representation"));
        return QAs;
    }

    // Question bank for quiz 'Scrum Framework'
    public static ArrayList<QA> getQAs5() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Scrum Framework"));
        QAs.add(new QA(1, "Which part of the Scrum Framework is defined as a “2-4 week extreme programming iteration”?", "Scrum Sprint"));
        QAs.add(new QA(2, "Which Scrum Role is defined as a “visionary who selects the features and content of the product”?", "Product Owner"));
        QAs.add(new QA(3, "Which Scrum Role is defined as the “servant leader who represents the project's management”?", "Scrum Master"));
        QAs.add(new QA(4, "Which Scrum Role is defined as a “a self-organised 5-9 person group who complete an assortment of tasks”?", "Scrum Team"));
        QAs.add(new QA(5, "Which Scrum Ceremony is defined as “selecting items from the product backlog to complete”?", "Sprint Planning"));
        QAs.add(new QA(6, "Which Scrum Ceremony is defined as the “scrum team presenting demos of their project code during the sprint”?", "Sprint Review"));
        QAs.add(new QA(7, "Which Scrum Ceremony is defined as a “periodic look at what is and isn't working in the project after each sprint”?", "Sprint Retrospective"));
        QAs.add(new QA(8, "Which Scrum Ceremony is defined as a “daily meeting where team members review their current workload and plan their future workload”?", "Stand-up Meeting"));
        QAs.add(new QA(9, "Which Scrum Artefact is defined as a “list of user stories and story points”?", "Product Backlog"));
        QAs.add(new QA(10, "Which Scrum Artefact is defined as “team members selecting tasks to complete during the sprint”?", "Sprint Backlog"));
        QAs.add(new QA(11, "Which Scrum Artefact is defined as a “tracking mechanism of what Sprint work has been completed and is yet to be complete”?", "Sprint Burndown Chart"));
        return QAs;
    }
}