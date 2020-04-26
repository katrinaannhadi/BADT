package com.katrinaann.badt.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.katrinaann.badt.R;

import java.util.ArrayList;

@Entity
public class Flashcard {
    //boolean value to check whether flashcard has flipped or not
    public boolean isFlipped;
    @PrimaryKey
    private int id;
    private int category;
    private String categoryName;
    private String title;
    private String answer;
    private int imageCategory;
    private int imageAnswer;
    private String imageURL;

    // Constructor to call Flashcard object

    public Flashcard(int id, int category, String categoryName, String title, String answer, int imageCategory, int imageAnswer, String imageURL) {
        this.id = id;
        this.category = category;
        this.categoryName = categoryName;
        this.title = title;
        this.answer = answer;
        this.imageCategory = imageCategory;
        this.imageAnswer = imageAnswer;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getImageCategory() {
        return imageCategory;
    }

    public void setImageCategory(int imageCategory) {
        this.imageCategory = imageCategory;
    }

    public int getImageAnswer() {
        return imageAnswer;
    }

    public void setImageAnswer(int imageAnswer) {
        this.imageAnswer = imageAnswer;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    //    public Flashcard(int id, int category, String categoryName, String title, String answer, int imageCategory, int imageAnswer) {


    public static ArrayList<Flashcard> getCategory1() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is an information system?"
                    , "A system that collects, stores, processes and retrieves information and turns raw data into business insight"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_itba_f1
                    ,""));
            flashcards.add(new Flashcard(1
                    , 1, "Introduction to Business Analysis"
                    , "What is business analysis?"
                    , "“The practice of enabling change in an organizational context by defining needs and recommending (digitally-enabled) solutions that delivers value to stakeholders” (International Institute of Business Analysis, BABOK v3)"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/Oalh2MojUuk"));
            flashcards.add(new Flashcard(2
                    , 1
                    , "Introduction to Business Analysis"
                    , "What does a business analyst do?"
                    , "A business analyst (often referred to as a BA) is a person who conducts business analysis and has various roles"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/npxXWgQ33ZQ/1600x900"));
            flashcards.add(new Flashcard(3
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are a BA's roles?"
                    , "•Understanding enterprise problems and goals\n" +
                    "\t•Analyzing needs and solutions\n" +
                    "\t•Devising strategies\n" +
                    "\t•Driving change\n" +
                    "\t•Facilitating stakeholder collaboration\n"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/QckxruozjRg/1600x900"));
            flashcards.add(new Flashcard(4
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are the Key Concepts?\n" +
                    "\n"+
                    "\t Hint: There are 6"
                    , "Change, Need, Solution,\n" +
                    " Stakeholder, Value, Context\n " +
                    "\n" +
                    "Acronym CNSSVA \n" +
                    "\tCharlie Needs a Solution! \n" +
                    "\tSend Valuable Coffee!"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.bakeyconcepts
                    , ""));
            flashcards.add(new Flashcard(4
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is change in Business Analysis?"
                    , "The act of transformation in response to a need"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/mG28olYFgHI/1600x900"));
            flashcards.add(new Flashcard(5
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is need in Business Analysis?"
                    , "A problem or opportunity to be addressed"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/M6tN7AZ_bNs/1600x900"));
            flashcards.add(new Flashcard(6
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is solution in Business Analysis?"
                    , "A specific way of satisfying one or more needs in a context"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/7e2pe9wjL9M/1600x900"));
            flashcards.add(new Flashcard(7
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is stakeholder in Business Analysis?"
                    , "A group or individual with a relationship to the change, the need, or the solution"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/MYbhN8KaaEc/1600x900"));
            flashcards.add(new Flashcard(8
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is value in Business Analysis?"
                    , "The worth, importance, or usefulness of something to a stakeholder within a context"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/JW6r_0CPYec/1600x900"));
            flashcards.add(new Flashcard(9
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is context in Business Analysis?"
                    , "The circumstances that influence, are influenced by, and provide understanding of the change"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/uMWPrcRsrto/1600x900"));
            flashcards.add(new Flashcard(10
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are the 3 main types of organisations?"
                    , "Conservative, progressive and avant-garde"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/mk7D-4UCfmg/1600x900"));
            flashcards.add(new Flashcard(11
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tConservative"
                    , "Hierarchical organisational structure and very procedural methods of project management (such as waterfall).\n" +
                    "\n E.g. Governmental Organisations"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/o0kbc907i20/1600x900"));
            flashcards.add(new Flashcard(12
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tProgressive"
                    , "Fairly flat and are the most responsive to changes and new trends. Adopt change-based strategies such as Agile.\n" +
                    "\n E.g. Banks, Professional Service Firms, Insurance Companies"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/ZGjbiukp_-A/1600x900"));
            flashcards.add(new Flashcard(13
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tAvant-Garde"
                    , "Often new companies that are extremely welcoming to risk seek to exploit as many opportunities as possible\n" +
                    "\n Eg. StartUps, Spotify, Uber"
                    , R.drawable.ic_introductiontobusinessanalysis
                    , R.drawable.ic_introductiontobusinessanalysis
                    , "https://source.unsplash.com/H4fYXZ1hyco/1600x900"));
            return flashcards;
        }

    public static ArrayList<Flashcard> getCategory2() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 2
                , "Project Management"
                , "What is a project? "
                ,"A set of activities with a beginning and an ending point, meant to create a system, which when completed, is expected to deliver value to the business"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/b21Ty33CqVs/1600x900"));
        flashcards.add(new Flashcard(1
                , 2
                , "Project Management"
                , "What is project management? "
                ,"The process of planning and controlling the development of a system within a specified time frame at a minimum cost with the desired functionality"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/5aiRb5f464A/1600x900"));
        flashcards.add(new Flashcard(2
                , 2
                , "Project Management"
                , "What is a system request? "
                ,"The system request is a document that describes the reasons for and the value added from building a new system. It typically contains five elements"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/legU0r1V1Gk/1600x900"));
        flashcards.add(new Flashcard(3
                , 2
                , "Project Management"
                , "What are the 5 elements in a Systems request?"
                ,"Project Sponsor, Business Need, Business Requirements, Business Value, Special Issues and Constraints"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/kCes633Hh1M/1600x900"));
        flashcards.add(new Flashcard(4
                , 2
                , "Project Management"
                , "What is a project sponsor?"
                ,"The primary point of contact for the project"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/F2KRf_QfCqw/1600x900"));
        flashcards.add(new Flashcard(5
                , 2
                , "Project Management"
                , "What is a business need?"
                ,"The reason prompting the project"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/u6yYESiiXco/1600x900"));
        flashcards.add(new Flashcard(6
                , 2
                , "Project Management"
                , "What is a business requirement?"
                ,"What the system will do"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/m_HRfLhgABo/1600x900"));
        flashcards.add(new Flashcard(7
                , 2
                , "Project Management"
                , "What is business value?"
                ,"How will the organization benefit from the project"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/ZGjbiukp_-A/1600x900"));
        flashcards.add(new Flashcard(8
                , 2
                , "Project Management"
                , "What are special issues or constraints?"
                ,"Anything else that should be considered"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/VO5w2Ida70s/1600x900"));
        flashcards.add(new Flashcard(9
                , 2
                , "Project Management"
                , "What is a feasibility analysis?"
                ,"Feasibility analysis considers the potential risks and potential benefits of the project to make a decision about whether it is viable to conduct it. "
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/0gO3-b-5m80/1600x900"));
        flashcards.add(new Flashcard(10
                , 2
                , "Project Management"
                , "What are the 3 components of feasibility analysis?"
                ,"Technical, Economic and Organisational Feasibility"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/hhq1Lxtuwd8/1600x900"));
        flashcards.add(new Flashcard(11
                , 2
                , "Project Management"
                , "What do we need stakeholder analysis?"
                ,"Stakeholder analysis allows the business to understand the key stakeholders, their interests in the system and what kind of influence they have. "
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/lbLgFFlADrY/1600x900"));
        flashcards.add(new Flashcard(12
                , 2
                , "Project Management"
                , "What is a stakeholder rainbow?"
                ,"A stakeholder Rainbow is a method of stakeholder analysis that maps stakeholders by their influence on the project and how they are affected by the project."
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/wpw8sHoBtSY/1600x900"));
        flashcards.add(new Flashcard(13
                , 2
                , "Project Management"
                , "What is a interest mapping?"
                ,"Interest mapping maps stakeholders by their interest and influence to a project"
                , R.drawable.ic_projectmanagement
                , R.drawable.ic_projectmanagement
                , "https://source.unsplash.com/uE2T1tCFsn8/1600x900"));
        return flashcards;
    }
        public static ArrayList<Flashcard> getCategory3() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0
                    , 3
                    , "Requirements Determination"
                    , "What is Requirements Determination?"
                    ,"Requirements Analysis Strategies are a part of requirements determination and are decided upon during the preparation phase. There are three main requirements analysis strategies"
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , "https://source.unsplash.com/68ZlATaVYIo/1600x900"));
            flashcards.add(new Flashcard(1
                    , 3
                    , "Requirements Determination"
                    , "What is Business Process Automation?"
                    ,"Business Process Automation is a strategy used for small changes and often involves using technology to automate some portions of a process. This process involves a lot of information gathering about the current (as-is) system which often comes in the form of problem analysis or root cause analysis."
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , "https://source.unsplash.com/2EJCSULRwC8/1600x900"));
            flashcards.add(new Flashcard(2
                    , 3
                    , "Requirements Determination"
                    , "What is Requirements Determination?"
                    ,"Requirements Analysis Strategies are a part of requirements determination and are decided upon during the preparation phase. There are three main requirements analysis strategies"
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , "https://source.unsplash.com/hpjSkU2UYSU/1600x900"));
            flashcards.add(new Flashcard(3
                    , 3
                    , "Requirements Determination"
                    , "What are the Requirements Gathering Techniques?"
                    ,"Interviews, Joint Application Development, Surveys, Document Analysis, Observation"
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , "https://source.unsplash.com/jrh5lAq-mIs/1600x900"));
            flashcards.add(new Flashcard(4
                    , 3
                    , "Requirements Determination"
                    , "What is Requirements Determination?"
                    ,"Requirements Analysis Strategies are a part of requirements determination and are decided upon during the preparation phase. There are three main requirements analysis strategies"
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , R.drawable.ic_requirementsgatheringandmodelling
                    , "https://source.unsplash.com/unRkg2jH1j0/1600x900"));
            return flashcards;
        }
    public static ArrayList<Flashcard> getCategory4() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 4
                , "Systems Development Life Cycle"
                , "What is SDLC?"
                ,"Systems Development Lifecycle - is a simple depiction of a typical lifecycle of every information system (IS). "
                , R.drawable.ic_sdlc
                , R.drawable.ic_sdlc
                , "https://source.unsplash.com/68ZlATaVYIo/1600x900"));
        flashcards.add(new Flashcard(1
                , 4
                , "Systems Development Methodologies"
                , "What are the 4 phases of SDLC?"
                ,"Planning, Analysis, Design and Implementation"
                , R.drawable.ic_sdlc
                , R.drawable.sdlc
                , ""));
        flashcards.add(new Flashcard(2
                , 4
                , "Systems Development Methodologies"
                , "Planning Phase - What does it involve?"
                ,"Define the reason for building the system and how to structure the project.\n" +
                "\t•Identifying opportunities and whether or not the system exploits it\n" +
                "\t•Analysing feasibility by consider benefits and costs and whether or not the system will generate more value than it costs\n" +
                "\t•Developing a workplan to manage the project \n" +
                "\t•Staffing the project with the right people with the right skills\n" +
                "\t•Controlling and directing the project to ensure it runs smoothly and effectively\n"
                , R.drawable.ic_sdlc
                , R.drawable.planning
                , ""));
        flashcards.add(new Flashcard(3
                , 4
                , "Systems Development Methodologies"
                , "Analysis Phase - What does it involve?"
                ,"Focused on who the system is being built for, what the system is, where it will be used and when it will be built.\n" +
                "\t•Developing an analysis strategy \n" +
                "\t•Determine business requirements\n" +
                "\t•Create use cases\n" +
                "\t•Model processes\n" +
                "\t•Model data\n"
                , R.drawable.ic_sdlc
                , R.drawable.analysis
                , ""));
        return flashcards;
    }
    public static ArrayList<Flashcard> getCategory5() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 5
                , "Systems Development Methodologies"
                , "What is System Design Methodologies?"
                ,"The waterfall or structured design is a path dependent process. Each stage is completed sequentially and must be fully completed before moving onto the next stage"
                , R.drawable.ic_systemsdevelopmentmethodologies
                , R.drawable.waterfall
                , ""));
        flashcards.add(new Flashcard(1
                , 5
                , "Systems Development Methodologies"
                , "What is Parallel"
                ,"Developed to shorten the development time required by waterfall models. \n" +
                "An overarching system design is developed which are subdivided into smaller sub-projects that are worked on in parallel and converge in the end."
                , R.drawable.ic_systemsdevelopmentmethodologies
                , R.drawable.parallel
                , ""));
        flashcards.add(new Flashcard(2
                , 5
                , "Systems Development Methodologies"
                , "What is Phased"
                ,"Understanding the overall needs of the system and then develops it incrementally until final implementation. \n" +
                "Continuous testing and feedback during the development process"
                , R.drawable.ic_systemsdevelopmentmethodologies
                , R.drawable.phased
                , ""));
        flashcards.add(new Flashcard(3
                , 5
                , "Systems Development Methodologies"
                , "What is System Prototyping"
                ,"Develop and incrementally improve a functional prototype of the final system.\n" +
                " This cycle repeats only until the prototype is satisfactory where it will be released to end users for use\n"
                , R.drawable.ic_systemsdevelopmentmethodologies
                , R.drawable.systemprototyping
                , ""));
        flashcards.add(new Flashcard(3
                , 5
                , "Systems Development Methodologies"
                , "What is Throwaway Prototyping"
                ,"Engages with users and creates throwaway prototypes. These throwaway prototypes have no functionality and are design prototypes (mock-ups of the real system).\n" +
                "At the end of the project, a functional prototype will be worked on and released when produced to a satisfactory standard"
                , R.drawable.ic_systemsdevelopmentmethodologies
                , R.drawable.throwawayprototyping
                , ""));
        return flashcards;
    }
        public static ArrayList<Flashcard> getCategory6() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0
                    , 6
                    , "Design Thinking"
                    , "What is Design Thinking?"
                    ,"A process which involves thinking outside of the box to help you find the right problem to solve."
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/FVTNhwyR4yk/1600x900"));
            flashcards.add(new Flashcard(1
                    , 6
                    , "Design Thinking"
                    , "What are the 6 different mindsets in design thinking?"
                    ,"Human-centred, mindful of process, culture of prototyping, show don’t tell, radical collaboration, bias toward action."
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.designthinkingmindset
                    , ""));
            flashcards.add(new Flashcard(2
                    , 6
                    , "Design Thinking"
                    , "What does human-centred mean?"
                    ,"Involving the client in every step of the process"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/riYdn15o96U/1600x900"));
            flashcards.add(new Flashcard(3
                    , 6
                    , "Design Thinking"
                    , "What does radical collaboration mean?"
                    ,"Constantly working with many team members"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/lbLgFFlADrY/1600x900"));
            flashcards.add(new Flashcard(4
                    , 6
                    , "Design Thinking"
                    , "What does culture of prototyping mean?"
                    ,"Creating regular prototypes to solicit feedback"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/MKDEMlPRoYU/1600x900"));
            flashcards.add(new Flashcard(5
                    , 6
                    , "Design Thinking"
                    , "What does show don't tell mean?"
                    ,"Being visual when representing ideas"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/ZhQCZjr9fHo/1600x900"));
            flashcards.add(new Flashcard(6
                    , 6
                    , "Design Thinking"
                    , "What does bias towards action mean?"
                    ,"Doing more and talking less"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/zXqizKxnbBU/1600x900"));
            flashcards.add(new Flashcard(7
                    , 6
                    , "Design Thinking"
                    , "What does mindful towards process mean?"
                    ,"Constantly reflecting on how to improve processes"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/OsC8HauR0e0/1600x900"));
            flashcards.add(new Flashcard(9
                    , 6
                    , "Design Thinking"
                    , "What is the Design Thinking process by Stamford's design school?"
                    ,"There are 5 stages: Empathise, Define, Ideate, Prototype and Test."
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.designthinkingprocess
                    , ""));
            flashcards.add(new Flashcard(11
                    , 6
                    , "Design Thinking"
                    , "What does the Empathise phase involve?"
                    ,"Focuses on trying to understand the users that you are developing for. The main idea behind empathising is that you are developing for someone else and not yourself"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/gq5PECP8pHE/1600x900"));
            flashcards.add(new Flashcard(12
                    , 6
                    , "Design Thinking"
                    , "Tools used in Empathy phase?"
                    ,"Extreme User Sampling, User Interviews\n" +
                    "Observations, Root Cause Analysis\n" +
                    "Empathy maps, Observation grids"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/LQ1t-8Ms5PY/1600x900"));
            flashcards.add(new Flashcard(12
                    , 6
                    , "Design Thinking"
                    , "What does the Define phase involve?"
                    ,"Understand your user, identify their needs and then derive insights"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/va_Opp86kfQ/1600x900"));
            flashcards.add(new Flashcard(13
                    , 6
                    , "Design Thinking"
                    , "Tools used in Define phase?"
                    ,"Visualising, Thematic Analysis, Point of View Statement, How Might We lists of questions"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/RLw-UC03Gwc/1600x900"));
            flashcards.add(new Flashcard(14
                    , 6
                    , "Design Thinking"
                    , "What does the Ideate phase involve?"
                    ,"Generating ideas to the problem that has just been identified and selected"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/82TpEld0_e4/1600x900"));
            flashcards.add(new Flashcard(14
                    , 6
                    , "Design Thinking"
                    , "Tools used in Ideate phase?"
                    ,"Setting guidelines  Sketches, Mind-mapping, Body-storming, Criteria based choice making"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/bjemWZcNF34/1600x900"));
            flashcards.add(new Flashcard(15
                    , 6
                    , "Design Thinking"
                    , "What does the Prototype phase involve?"
                    ,"Bringing the ideas to life by creating something tangible that the users can interact with"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/ukeUH3KbMWU/1600x900"));
            flashcards.add(new Flashcard(16
                    , 6
                    , "Design Thinking"
                    , "Tools used in Ideate phase?"
                    ,"Some examples of prototypes include paper, mocks, code and physical, sorted from low fidelity to high fidelity. \n" +
                    "Fidelity refers to the level of features, elements and complexity."
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/tZc3vjPCk-Q/1600x900"));
            flashcards.add(new Flashcard(16
                    , 6
                    , "Design Thinking"
                    , "What does the Testing phase involve?"
                    ,"Taking the prototype that you have made to your end users to solicit feedback.\n" +
                    "Go back and refine the prototype before testing it again. Repeat the cycle"
                    , R.drawable.ic_designthinkinglist
                    , R.drawable.ic_designthinkinglist
                    , "https://source.unsplash.com/tV-RX0beDp8/1600x900"));
        return flashcards;
    }


    public static ArrayList<Flashcard> getCategory7() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 7
                , "Agile Scrum"
                , "What is Agile?"
                ,"An agile methodology is the opposite end of the spectrum to waterfall development which focuses on sequential, well-planned project management"
                , R.drawable.ic_agile
                , R.drawable.ic_agile
                , "https://source.unsplash.com/WC6MJ0kRzGw/1600x900"));
        flashcards.add(new Flashcard(1
                , 7
                , "Agile Scrum"
                , "What are the roles in agile scrum?"
                ,"Product Owner, Scrum Master, Team"
                , R.drawable.ic_agile
                , R.drawable.ic_agile
                , "https://source.unsplash.com/tV-RX0beDp8/1600x900"));
        flashcards.add(new Flashcard(2
                , 7
                , "Agile Scrum"
                , "What is the role of the scrum master?"
                ,"The scrum master is a “servant leader” who serves the members of the team rather than orders them. The main role of the scrum master is to ensure the smoothness of the project by fulfilling the team’s needs and requirements and also by removing impediments to progress."
                , R.drawable.ic_agile
                , R.drawable.ic_agile
                , "https://source.unsplash.com/Ap3fFS0iOiE/1600x900"));
        return flashcards;
    }
    public static ArrayList<Flashcard> getCategory8() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 8
                , "Lean Start Up"
                , "What is Lean?"
                ,"Lean start-up is a methodology that borrows ideas from lean manufacturing and focuses on reducing waste. "
                , R.drawable.ic_leanstartup
                , R.drawable.ic_leanstartup
                , "https://source.unsplash.com/TG0jUoGbCCs/1600x900"));
        flashcards.add(new Flashcard(1
                , 8
                , "Lean Start Up"
                , "explore prototyping and experimenting "
                ,""
                , R.drawable.ic_leanstartup
                , R.drawable.ic_leanstartup
                , "https://source.unsplash.com/zoCDWPuiRuA/1600x900"));
        flashcards.add(new Flashcard(2
                , 8
                , "Lean Start Up"
                , "What are the stages in lean start up"
                ,"Identify and prioritise, Develop hypotheses, Build minimum viable product, Learn from Results"
                , R.drawable.ic_leanstartup
                , R.drawable.ic_leanstartup
                , "https://source.unsplash.com/t-Pm18joMss/1600x900"));
        return flashcards;
    }



}

