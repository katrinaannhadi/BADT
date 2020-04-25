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
//        this.id = id;
//        this.category = category;
//        this.categoryName = categoryName;
//        this.title = title;
//        this.answer = answer;
//        this.imageCategory = imageCategory;
//        this.imageAnswer = imageAnswer;
//    }
//
//    public Flashcard() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getCategory() {
//        return category;
//    }
//
//    public void setCategory(int category) {
//        this.category = category;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
//
//    public int getImageCategory() {
//        return imageCategory;
//    }
//
//    public void setImageCategory(int imageCategory) {
//        this.imageCategory = imageCategory;
//    }
//
//    public int getImageAnswer() {
//        return imageAnswer;
//    }
//
//    public void setImageAnswer(int imageAnswer) {
//        this.imageAnswer = imageAnswer;
//    }

    public static ArrayList<Flashcard> getCategory1() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
            flashcards.add(new Flashcard(0
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is an information system?"
                    , "A system that collects, stores, processes and retrieves information and turns raw data into business insight"
                    , R.drawable.ic_ba
                    , R.drawable.ic_itba_f1
                    ,""));
            flashcards.add(new Flashcard(1
                    , 1, "Introduction to Business Analysis"
                    , "What is business analysis?"
                    , "“The practice of enabling change in an organizational context by defining needs and recommending (digitally-enabled) solutions that delivers value to stakeholders” (International Institute of Business Analysis, BABOK v3)"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/Oalh2MojUuk"));
            flashcards.add(new Flashcard(2
                    , 1
                    , "Introduction to Business Analysis"
                    , "What does a business analyst do?"
                    , "A business analyst (often referred to as a BA) is a person who conducts business analysis and has various roles"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
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
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
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
                    , R.drawable.ic_ba
                    , R.drawable.bakeyconcepts
                    , ""));
            flashcards.add(new Flashcard(4
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is change in Business Analysis?"
                    , "The act of transformation in response to a need"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/mG28olYFgHI/1600x900"));
            flashcards.add(new Flashcard(5
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is need in Business Analysis?"
                    , "A problem or opportunity to be addressed"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/M6tN7AZ_bNs/1600x900"));
            flashcards.add(new Flashcard(6
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is solution in Business Analysis?"
                    , "A specific way of satisfying one or more needs in a context"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/7e2pe9wjL9M/1600x900"));
            flashcards.add(new Flashcard(7
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is stakeholder in Business Analysis?"
                    , "A group or individual with a relationship to the change, the need, or the solution"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/MYbhN8KaaEc/1600x900"));
            flashcards.add(new Flashcard(8
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is value in Business Analysis?"
                    , "The worth, importance, or usefulness of something to a stakeholder within a context"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/JW6r_0CPYec/1600x900"));
            flashcards.add(new Flashcard(9
                    , 1
                    , "Introduction to Business Analysis"
                    , "What is context in Business Analysis?"
                    , "The circumstances that influence, are influenced by, and provide understanding of the change"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/uMWPrcRsrto/1600x900"));
            flashcards.add(new Flashcard(10
                    , 1
                    , "Introduction to Business Analysis"
                    , "What are the 3 main types of organisations?"
                    , "Conservative, progressive and avant-garde"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/mk7D-4UCfmg/1600x900"));
            flashcards.add(new Flashcard(11
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tConservative"
                    , "Hierarchical organisational structure and very procedural methods of project management (such as waterfall).\n" +
                    "\n E.g. Governmental Organisations"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/o0kbc907i20/1600x900"));
            flashcards.add(new Flashcard(12
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tProgressive"
                    , "Fairly flat and are the most responsive to changes and new trends. Adopt change-based strategies such as Agile.\n" +
                    "\n E.g. Banks, Professional Service Firms, Insurance Companies"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
                    , "https://source.unsplash.com/ZGjbiukp_-A/1600x900"));
            flashcards.add(new Flashcard(13
                    , 1
                    , "Introduction to Business Analysis"
                    , "Type of organisation: \n" +
                    "\n" +
                    "\tAvant-Garde"
                    , "Often new companies that are extremely welcoming to risk seek to exploit as many opportunities as possible\n" +
                    "\n Eg. StartUps, Spotify, Uber"
                    , R.drawable.ic_ba
                    , R.drawable.ic_ba
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
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/b21Ty33CqVs/1600x900"));
        flashcards.add(new Flashcard(1
                , 2
                , "Project Management"
                , "What is project management? "
                ,"The process of planning and controlling the development of a system within a specified time frame at a minimum cost with the desired functionality"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/5aiRb5f464A/1600x900"));
        flashcards.add(new Flashcard(2
                , 2
                , "Project Management"
                , "What is a system request? "
                ,"The system request is a document that describes the reasons for and the value added from building a new system. It typically contains five elements"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/legU0r1V1Gk/1600x900"));
        flashcards.add(new Flashcard(3
                , 2
                , "Project Management"
                , "What are the 5 elements in a Systems request?"
                ,"Project Sponsor, Business Need, Business Requirements, Business Value, Special Issues and Constraints"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/kCes633Hh1M/1600x900"));
        flashcards.add(new Flashcard(4
                , 2
                , "Project Management"
                , "What is a project sponsor?"
                ,"The primary point of contact for the project"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/F2KRf_QfCqw/1600x900"));
        flashcards.add(new Flashcard(5
                , 2
                , "Project Management"
                , "What is a business need?"
                ,"The reason prompting the project"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/u6yYESiiXco/1600x900"));
        flashcards.add(new Flashcard(6
                , 2
                , "Project Management"
                , "What is a business requirement?"
                ,"What the system will do"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/m_HRfLhgABo/1600x900"));
        flashcards.add(new Flashcard(7
                , 2
                , "Project Management"
                , "What is business value?"
                ,"How will the organization benefit from the project"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/ZGjbiukp_-A/1600x900"));
        flashcards.add(new Flashcard(8
                , 2
                , "Project Management"
                , "What are special issues or constraints?"
                ,"Anything else that should be considered"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/VO5w2Ida70s/1600x900"));
        flashcards.add(new Flashcard(9
                , 2
                , "Project Management"
                , "What is a feasibility analysis?"
                ,"Feasibility analysis considers the potential risks and potential benefits of the project to make a decision about whether it is viable to conduct it. "
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/0gO3-b-5m80/1600x900"));
        flashcards.add(new Flashcard(10
                , 2
                , "Project Management"
                , "What are the 3 components of feasibility analysis?"
                ,"Technical, Economic and Organisational Feasibility"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/hhq1Lxtuwd8/1600x900"));
        flashcards.add(new Flashcard(11
                , 2
                , "Project Management"
                , "What do we need stakeholder analysis?"
                ,"Stakeholder analysis allows the business to understand the key stakeholders, their interests in the system and what kind of influence they have. "
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/lbLgFFlADrY/1600x900"));
        flashcards.add(new Flashcard(12
                , 2
                , "Project Management"
                , "What is a stakeholder rainbow?"
                ,"A stakeholder Rainbow is a method of stakeholder analysis that maps stakeholders by their influence on the project and how they are affected by the project."
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/wpw8sHoBtSY/1600x900"));
        flashcards.add(new Flashcard(13
                , 2
                , "Project Management"
                , "What is a interest mapping?"
                ,"Interest mapping maps stakeholders by their interest and influence to a project"
                , R.drawable.ic_ba
                , R.drawable.ic_ba
                , "https://source.unsplash.com/uE2T1tCFsn8/1600x900"));
        return flashcards;
    }
    public static ArrayList<Flashcard> getCategory3() {
        ArrayList<Flashcard> flashcards = new ArrayList<>();
        flashcards.add(new Flashcard(0
                , 3
                , "Systems Development Methodologies"
                , "What is Waterfall?"
                ,"The waterfall or structured design is a path dependent process. Each stage is completed sequentially and must be fully completed before moving onto the next stage"
                , R.drawable.ic_ba
                , R.drawable.waterfall
                , ""));
        flashcards.add(new Flashcard(2
                , 3
                , "Systems Development Methodologies"
                , "What is Parallel"
                ,"Developed to shorten the development time required by waterfall models. \n" +
                "An overarching system design is developed which are subdivided into smaller sub-projects that are worked on in parallel and converge in the end."
                , R.drawable.ic_ba
                , R.drawable.parallel
                , ""));
        flashcards.add(new Flashcard(3
                , 3
                , "Systems Development Methodologies"
                , "What is Phased"
                ,"Understanding the overall needs of the system and then develops it incrementally until final implementation. \n" +
                "Continuous testing and feedback during the development process"
                , R.drawable.ic_ba
                , R.drawable.parallel
                , ""));
        flashcards.add(new Flashcard(4
                , 3
                , "Systems Development Methodologies"
                , "What is System Prototyping"
                ,"Develop and incrementally improve a functional prototype of the final system.\n" +
                " This cycle repeats only until the prototype is satisfactory where it will be released to end users for use\n"
                , R.drawable.ic_ba
                , R.drawable.systemprototyping
                , ""));
        flashcards.add(new Flashcard(5
                , 3
                , "Systems Development Methodologies"
                , "What is Throwaway Prototyping"
                ,"Engages with users and creates throwaway prototypes. These throwaway prototypes have no functionality and are design prototypes (mock-ups of the real system).\n" +
                "At the end of the project, a functional prototype will be worked on and released when produced to a satisfactory standard"
                , R.drawable.ic_ba
                , R.drawable.throwawayprototyping
                , ""));
        return flashcards;
    }
//    public static ArrayList<Flashcard> getCategory4() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//            flashcards.add(new Flashcard(0, 4, "Project Management", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//    public static ArrayList<Flashcard> getCategory5() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//            flashcards.add(new Flashcard(0, 5, "Requirements Determination", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//            return flashcards;
//        }
//    public static ArrayList<Flashcard> getCategory6() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 6, "Agile Scrum", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//    public static ArrayList<Flashcard> getCategory7() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 7, "Lean Start Up", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }
//
//    public static ArrayList<Flashcard> getCategory8() {
//        ArrayList<Flashcard> flashcards = new ArrayList<>();
//        flashcards.add(new Flashcard(0, 8, "Design Thinking", "What is an information system?", "A system that collects, stores, processes and retrieves information and turns raw data into business insight", R.drawable.ic_scrum, R.drawable.baintro));
//        return flashcards;
//    }

}

