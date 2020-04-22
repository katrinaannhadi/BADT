package com.katrinaann.badt.ui.blogandnotes;

import com.katrinaann.badt.R;

import java.util.ArrayList;

public class Topic {
    private String topic;
    private int topicNo;
    private String subTopic;
    private String information;
    private int subTopicImage;

    public Topic() {
    }

    public Topic (String topic, int topicNo, String subTopic, String information, int subTopicImage) {
        this.topic = topic;
        this.topicNo = topicNo;
        this.subTopic = subTopic;
        this.information = information;
        this.subTopicImage = subTopicImage;
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

    public int getSupTopicImage() {
        return subTopicImage;
    }

    public void setSubTopicImage(int subTopicImage) {
        this.subTopicImage = subTopicImage;
    }

    public static ArrayList<Topic> getDesignThinking() {
        ArrayList<Topic> designThinkingList = new ArrayList<>();
        designThinkingList.add(new Topic("Design Thinking",1,"Introduction","Design Thinking is a process which involves thinking outside of the box to help you find the right problem to solve. When we talk about thinking outside of the box, we always associate it with finding solutions but in this case, we are actually focusing on finding the right problem to solve rather than the solution.\n" +
                "\nDesign thinking requires the use of six mindsets: Human-centred, mindful of process, culture of prototyping, show don’t tell, radical collaboration, bias toward action.\n",0));
        designThinkingList.add(new Topic("Design Thinking",2,"Design Thinking Mindsets","•\tHuman-Centred: You are designing for someone else not for yourself\n" +
                "•\tRadical Collaboration: Collaboration within the team and with users (throughout the process)\n" +
                "•\tCulture of Prototyping: Creating many prototypes, failing and creating something better\n" +
                "•\tShow Don’t Tell: Try to build something and show it rather than explaining it\n" +
                "•\tBias toward action: DO more TALK less. More time doing, less formal interactions\n" +
                "•\tMindful of Process: Be thoughtful of how you are working and how you can improve on your methods\n", R.drawable.designthinkingmindset));
        designThinkingList.add(new Topic("Design Thinking",3,"Design Thinking Steps","Following Stanford Design Schools’ Design Thinking Process, there are 5 stages: Empathise, Define, Ideate, Prototype and Test. " +
                "\n\nWhilst the process looks very sequential, it is actually an iterative process and stages can keep occurring many times within one project. Each stage has different goals and also has many different tools that are commonly used by teams to arrive at those goals.",R.drawable.designthinkingprocess));
        designThinkingList.add(new Topic("Design Thinking",4,"Empathise","The empathise stage focuses on trying to understand the users that you are developing for. The main idea behind empathising is that you are developing for someone else and not yourself. Consequently, whilst it may be easy to make a product that you think will be beneficial to the user, it is better to actually take steps to understand who the users are and what they are actually looking for. To do this, you have to observe, engage, watch and listen to your users whilst holding back judgement. Everything the user says is insightful and should be considered when designing and developing the system.\n" +
                "\nThere are many tools that can be used in this stage to help empathise:\n" +
                "•\tExtreme User Sampling – Sampling users from both sides of the extreme (users that won’t use the system at all and users that will use it a lot) and understand why \n" +
                "•\tUser interviews – Ask questions to understand more about the user and to also involve them in the development process\n" +
                "•\tObservations in person – Look for workarounds, adaptations, hidden passions, surprises etc. about a person, letting them tell you rather than you ask them\n" +
                "•\tObservations of user-generated content – Analyse users’ documentations about their daily lives through images and videos\n" +
                "•\tEmpathy maps – Map out a user and understand what they say, think do and feel to understand how to better satisfy them\n" +
                "•\tObservation grids – Document those surprises, workarounds, hidden passions etc. that you have observed in grids\n",0));
        designThinkingList.add(new Topic("Design Thinking",5,"Define","The define stage is all about converging on all the observations and findings from the empathise phase. In this stage, you would group similar observations and then choose a few of the challenges to focus on. This stage is all about understanding the problem that the system will aim to solve. To do so, you have to first understand your user, identify their needs and then derive insights.\n" +
                "\nTo assist in the define stage there are many useful tools:\n" +
                "•\tVisualising – All the team members will present their findings visually (e.g. through sticky notes) where it will be easier to consolidate and synthesise\n" +
                "•\tThematic Analysis – Grouping similarities and separating differences between user groups by setting ‘themes’ or commonalities\n" +
                "•\tPoint of View Statement – A statement that helps visualise and understand the user, their needs and insights\n" +
                "•\t“How Might We” – Writing up lists of questions that encourage thinking and brainstorming of as many solutions possible to solve the problem\n",0));
        designThinkingList.add(new Topic("Design Thinking",6,"Ideate","The ideate stage is all about generating ideas to the problem that has just been identified and selected. In this stage, it’s all about the volume of ideas and so teams are encouraged to think of as many ideas as possible no matter how impractical or absurd they are. This is because of a mutual understanding that members can bounce of each other and become great ideas even if they weren’t practical to begin with. It also encourages people who may have great ideas but are doubtful, to speak up. However, towards the end of the ideate phase, there needs to be some direction and solution chosen and so eventually, ideas will be merged or eliminated until a few are left.\n" +
                "\nSome tools to help ideate include:\n" +
                "•\tGuidelines – Setting guidelines will help the team gain direction and behave a certain way e.g. Defer Judgement will allow users to be more confident in sharing\n" +
                "•\tSketches – Use of post-it notes and whiteboards to visualise all the ideas for yourself and others\n" +
                "•\tMindmapping – Visualise ideas like in sketches but link it to bigger ideas so that there is structure \n" +
                "•\tBodystorming – Putting yourself in the position of the users to understand the issue better so that you can better satisfy their needs\n" +
                "•\tCriteria-based choice making – Choice of 2-3 solutions that make it to the prototype page based on criteria set by the team\n",0));
        designThinkingList.add(new Topic("Design Thinking",7,"Prototype","The prototype stage is all about bringing the ideas to life by creating something tangible that the users can interact with. This helps further empathise with customers, understand what the solution may do well or poorly and to also gain additional insights that weren’t considered before. This stage is all about improvement. There is an understanding that the solution may not hit the mark the first, second or maybe even tenth time. However, the point of prototyping is to keep improving every time there is a failure so that at the end of the process, the product actually does satisfy the end user. Thus, a guideline to prototyping includes to embrace failure and to not invest very heavily on one prototype since it is expected to fail anyway. By incorporating end users, its better build iteratively, fail but succeed at the end than to build one final product to realise that users are not satisfied.",0));
        designThinkingList.add(new Topic("Design Thinking",8,"Testing","Finally, the last stage is testing. Testing is all about taking the prototype that you have made to your end users to solicit feedback and gain more empathy, as explained in the last topic. To reiterate, the testing helps refine the prototypes and solutions, allows you to learn more about your user and to refine your point of view on them and what they need. It is very important to show and not tell i.e. Give them a chance to physically interact with the prototype themselves before telling them. By doing so, you may identify some unexpected outcomes especially about how intuitive it is to use the system and some of the common mistakes that they may encounter. When the feedback is gathered, go back and refine the prototype before testing it again. By repeating this cycle, eventually the prototype will become the final product that is able to satisfy your customer. One way to prototype and test is to use the lean-startup methodology which will be explained more in depth in another topic of this app.",0));
        return designThinkingList;
    }

    public static ArrayList<Topic> getAgileSCRUM() {
        ArrayList<Topic> agileList = new ArrayList<>();
        agileList.add(new Topic("Agile SCRUM", 1,"Introduction","An agile methodology is the opposite end of the spectrum to waterfall development which focuses on sequential, well-planned project management. Agile instead focuses on a series of fast iterations or ‘sprints’ that focus on producing results rapidly and often results in products being produced at the end of each sprint.\n" +
                "\nA sprint typically lasts 2-4 weeks or at most a month and involves everything from planning to implementation. Typically, good sprints are characterised by constant duration and good rhythm since it builds efficiency, predictability and familiarity. Additionally, each sprint has its own set of requirements that should not be changed until a sprint has finished.\n", R.drawable.agileoverview));
        agileList.add(new Topic("Agile SCRUM", 2,"Roles","Product owner\n" +
                "The product owner is the person who is responsible for the project and the end product. This is the person who knows the direction of the product, understands the project and understands the customer needs to guide the project. Some of the common responsibilities of the product owner include: Defining the features of the product, deciding on the release date and content, being responsible for the product, prioritise and adjust features and accepting or rejecting the final product.\n" +
                "\nScrum master\n" +
                "The scrum master is a “servant leader” who serves the members of the team rather than orders them. The main role of the scrum master is to ensure the smoothness of the project by fulfilling the team’s needs and requirements and also by removing impediments to progress. To summarise the roles of a scrum master, they serve to represent the team in the project, enact scrum values and practices, remove impediments, ensure functionality and productivity, allows collaboration between functions and roles and shields the team from external interferences\n" +
                "\nTeam\n" +
                "Finally, the team is typically made up of 5-9 people and consists of cross-functional teams including business analysts, developers and testers. A key characteristic of agile teams is that they are self-organising which means that the team will not be directed closely by management but is instead expected to come up with ideas themselves that may please the management team. Thus, these teams are highly autonomous, flexible and flat with roles being delegated amongst members rather than by a higher-up.\n",0));
        agileList.add(new Topic("Agile SCRUM", 3,"Ceremonies","Sprint planning\n" +
                "In the sprint planning, the team selects items from the product backlog they can commit to completing and also creates a sprint backlog (more detail provided later). Tasks are identified and time estimates are made for each. This is a collaborative effort between the whole team.\n" +
                "\nDaily scrum\n" +
                "Daily scrum meetings are short 15-minute daily meetings where team members share answers to three questions: What did you do yesterday? What will you do today? Is there anything in your way? This process helps keep meetings concise whilst communicating clearly about the progress of the team.\n" +
                "\nSprint review\n" +
                "In the sprint review, the team presents what it accomplished during the sprint. This typically takes the form of a demo of new features or underlying architecture. Overall, this meeting is quite informal and is open to the public.\n" +
                "\nSprint retrospective\n" +
                "The sprint retrospective is conducted after a sprint but unlike the sprint review, is focused on the actual project itself rather than the end product. Here, the team collectively identifies what worked and what did not work during the course of the project. Here the three main points raised are: What should we start doing? What should we stop doing? What should we continue doing?\n",0));
        agileList.add(new Topic("Agile SCRUM", 4,"Artifacts","Product vision\n" +
                "During a project, a business vision must be transferred to a product vision. The product vision should be a broad overview of what the product is trying to do. It helps analyse why the project is being undertaken and what the desired end state is\n" +
                " \n" +
                "\nProduct backlog\n" +
                "The product backlog contains all the requirements for the project. It is ideally expressed as a list of user stories along with story points, such that each item has value to users or customers of the product. The product backlog is managed by the product owner and is prioritised by them at the start of each sprint. Before each sprint, the product owner will choose the most important user stories to be addressed in the next sprint. \n" +
                "Creating the product backlog has many stages and steps so instead it will be summarised briefly. The first stage is to understand the users and customers. Next, it may be useful to map personas (a representation of a user group) based on those users and customers and to identify their description, behaviours and needs and goals. Afterwards, derive epics (high level features or activities) from the persona’s needs. Finally, you derive user stories from epics by understanding a user and who they are, what they want and why they want it. Afterwards, collate all the user stories to form all the goals and requirements that the product will fulfill.\n" +
                " \n" +
                "\nSprint backlog\n" +
                "A sprint backlog is a smaller component of the product backlog chosen to be completed during one particular sprint. Here, instead of a product owner being responsible, the whole team is responsible for the sprint backlog as individuals sign up for work of their own choosing. In this backlog tasks are listed and the estimated work remaining is updated daily until the end of the sprint.\n" +
                " \n" +
                "\nSprint burndown chart\n" +
                "A sprint burndown chart is a sprint tracking mechanism and displays what work has been completed and what is left to be completed. This chart is updated every day and best estimates are made about how much work is to completed since it is hard to be precise on exactly how much time will be taken to do a task\n" +
                "•\tStep 1: Prepare task breakdown and assign effort\n" +
                "•\tStep 2: Plot the “ideal” progress (Ideal progress line - Straight line from the effort at day 0 to the last day of the sprint)\n" +
                "•\tStep 3: Update chart through the sprint as and when tasks are completed\n",0));
        return agileList;
    }

    public static ArrayList<Topic> getLeanStartup() {
        ArrayList<Topic> leanStartupList = new ArrayList<>();
        leanStartupList.add(new Topic("Lean Startup", 1,"Introduction","Lean start-up is a methodology that borrows ideas from lean manufacturing and focuses on reducing waste. The key idea is to only produce what users need and where there is demand. This methodology prescribes how ideas should go from inception to implementation and is a methodology that can be used in any type of organisation.\n" +
                "In particular, we will explore prototyping and experimenting with lean start-up. The last two stages of design thinking can be conducted using this methodology.\n",0));
        leanStartupList.add(new Topic("Lean Startup", 2,"Identify and prioritise your assumptions","To identify assumptions, start by making “I believe that” statements. \n" +
                "“In a city where space is extremely limited, {I believe that} people will pay a small amount of money, for a small amount of space... they don’t need a hotel.” – Airbnb\n" +
                "This helps clarify your current understand of what you don’t know with certainty. However, you may identify many different assumptions and it is important to identify and focus on the most critical assumption that arises. Some ways to identify which assumption this is asking “What is the riskiest assumption?” and “How can we validate/invalidate the riskiest assumption?”.\n",0));
        leanStartupList.add(new Topic("Lean Startup", 3,"Develop hypothesis for your assumptions","After identifying and prioritising your assumptions, it is time to develop some hypotheses for your assumptions. This helps test to see whether or not your assumptions are actually true and helps to understand what product to design. It also helps to clarify your current understanding of what uncertainty you are trying to solve.\n" +
                "An easy way to formulate hypotheses is by writing an “If…. Then” statement.\n" +
                "“If we display professionally shot pictures of rooms, then we will have more bookings” – Airbnb\n" +
                "There are two types of hypotheses: Value and growth hypothesis. Value hypothesis tests if a product is valuable to potential customers. Growth hypothesis tests how you assume users will find your product. By doing so, you can start to gain an understanding of what kind of product to design to test your assumptions and solve your problem.\n",0));
        leanStartupList.add(new Topic("Lean Startup", 4,"Building a Minimum Viable Product","The next stage is to actually build the product that will be used to test the assumptions and hypotheses. However, instead of fully investing in a fully-fledged product, it is recommended to build a Minimal Viable Product (MVP). An MVP is basically the simplest thing or product that you can build to show your customers but still maximise your learning from them. This can be anything from wireframes, coded prototypes to something simple like sign-up booths and presentation decks. This range of ‘detail’ is often referred to as fidelity. The higher fidelity an MVP is, the more fleshed-out and detailed it is. \n" +
                "To test the MVP it is often most insightful to conduct something called A/B testing. A/B testing involves testing two versions of the product with different user groups and understanding the difference between the interactions and performance between them. This will give the best results as it helps understand customer patterns and behaviours and to be able to gain direction in which version or features perform the best.\n",0));
        leanStartupList.add(new Topic("Lean Startup", 5,"Learn from the results of the experiment","After conducting the test, it is important to analyse and reflect on the results of the experiment. A common way to do this is through the “Five Whys Root Cause Analysis”. This involves asking “why?” five times consecutively to get to the core reason of why something happens. This is important since without identifying the root cause, changes to the MVP and the product may not actually improve performance or satisfy customers since it is not tackling the main issue. \n" +
                "Afterwards, decisions need to be made on the future of the project. Do you want to persevere and find a way to tweak the prototype so that it becomes successful? Or do you want to pivot and abandon the whole product in general and just find a new hypothesis to test? Often decision to persevere occurs when there is still learning to be obtained from the current MVP and experiments still show steady or increasing returns. However, if this is not the case, it is best to pivot.\n",0));
        leanStartupList.add(new Topic("Lean Startup", 6,"Iterate","Finally, it is important to iterate. The lean start-up methodology is not sequential method, it is iterative. The point of lean startup is to continually create MVPs and test them to generate enough insight to be able to develop a fully-fledged product one day. Thus, you don’t want to spend a lot of times developing prototypes, you want to get them out as quick as possible to learn from them and then to make changes again. Thus there is a learn-build-measure-learn cycle that continuously runs as you build a product, test it and measure it, learn from it and build again.",0));
        return leanStartupList;
    }


    public static ArrayList<Topic> getSDLC() {
        ArrayList<Topic> sdlcList = new ArrayList<>();
        sdlcList.add(new Topic("Systems Development Lifecycle", 1,"Introduction","The Systems Development Lifecycle (SDLC) is a simple depiction of a typical lifecycle of every information system (IS). It consists of four phases: Planning, Analysis, Design and Implementation; and can be executed sequentially, incrementally, iteratively or in any pattern that is deemed appropriate by team working on the IS. Each phase also consists of a series of steps and is documented through deliverables.",R.drawable.sdlc));
        sdlcList.add(new Topic("Systems Development Lifecycle", 2,"Planning","The planning phase is focused on defining the reason for building the system and how to structure the project. Some common steps performed during this phase includes:\n" +
                "•\tIdentifying opportunities and whether or not the system exploits it\n" +
                "•\tAnalysing feasibility by consider benefits and costs and whether or not the system will generate more value than it costs\n" +
                "•\tDeveloping a workplan to manage the project \n" +
                "•\tStaffing the project with the right people with the right skills\n" +
                "•\tControlling and directing the project to ensure it runs smoothly and effectively\n",R.drawable.planning));
        sdlcList.add(new Topic("Systems Development Lifecycle", 3,"Analysis","This is the first topic of Agile",R.drawable.analysis));
        sdlcList.add(new Topic("Systems Development Lifecycle", 4,"Development","This is the first topic of Agile",R.drawable.design));
        sdlcList.add(new Topic("Systems Development Lifecycle", 5,"Implementation","This is the first topic of Agile",R.drawable.implementation));
        return sdlcList;
    }

    public static ArrayList<Topic> getSystemsDevelopmentMethodologies() {
        ArrayList<Topic> systemDevMethodList = new ArrayList<>();
        systemDevMethodList.add(new Topic("Systems Development Methodology", 1,"Waterfall",
                "The waterfall or structured design is a path dependent process. Each stage is completed sequentially and must be fully completed before moving onto the next stage. Once the project moves onto the next stage, there is no going back. Consequently, changes can only be made once the development is finished, where requests can be made and patches can be released. Often this approach requires a lot of time but is beneficial in how organised and well-documented the project becomes. However, the key disadvantage is that all the planning is conducted at the beginning of the project and resultingly, poor planning can result in a poor performing project.",R.drawable.waterfall));
        systemDevMethodList.add(new Topic("Systems Development Methodology", 2,"Parallel",
                "The parallel methodology was developed to shorten the development time required by waterfall models. An overarching system design is developed which are subdivided into smaller sub-projects that are worked on in parallel and converge in the end. The key issue that arises with this methodology is often the lack of communication between different teams working on different areas since they are isolated. A problem that one team encounters will ultimately affect the whole project as when they reconvene to integrate parts together, there may be compatibility issues.",R.drawable.parallel));
        systemDevMethodList.add(new Topic("Systems Development Methodology", 3,"Phased",
                "The phased approach was developed to avoid some of the pitfalls of parallel approach relating to the lack of communication. This approach starts by understanding the overall needs of the system and then develops it incrementally until final implementation. The key distinguishing factor between this approach and the previous approaches are that there is continual testing and feedback during the development process. Through this, the system can continually improve as opposed to the previous models where there is no user feedback till after implementation.",R.drawable.phased));
        systemDevMethodList.add(new Topic("Systems Development Methodology", 4,"System Prototyping",
                "The system prototyping methodology was developed since the phased approach has commitment for each phase and so consequently, lacks flexibility. The system prototyping methodology would develop and incrementally improve a functional prototype of the final system. This cycle repeats only until the prototype is satisfactory where it will be released to end users for use. In this methodology, the prototypes are retained, kept and improved on.",R.drawable.systemprototyping));
        systemDevMethodList.add(new Topic("Systems Development Methodology", 5,"Throwaway Prototyping",
                "The throwaway prototyping methodology engages with users and creates throwaway prototypes. These throwaway prototypes have no functionality, unlike in the system prototype methodology, and are design prototypes (mock-ups of the real system). Such a prototype may be characterised by having dummy data, non-functional buttons or other features mainly for the purpose to identify if they can solve the user needs. At the end of the project, a functional prototype will be worked on and released when produced to a satisfactory standard. Meanwhile, unlike the system prototype methodology, the old prototypes are thrown away.",R.drawable.throwawayprototyping));
        return systemDevMethodList;
    }

    public static ArrayList<Topic> getIntroductiontoBA() {
        ArrayList<Topic> introToBaList = new ArrayList<>();
        introToBaList.add(new Topic("Introduction to Business Analysis", 1,"Introduction", "An information system is a system that collects, stores, processes and retrieves information and turns raw data into business insight.\n" +
                "Business analysis is “The practice of enabling change in an organizational context by defining needs and recommending (digitally-enabled) solutions that delivers value to stakeholders” (International Institute of Business Analysis, BABOK v3).\n" +
                "A business analyst (often referred to as a BA) is a person who conducts business analysis and has various roles such as: \n" +
                "•\tUnderstanding enterprise problems and goals,\n" +
                "•\tAnalyzing needs and solutions,\n" +
                "•\tDevising strategies,\n" +
                "•\tDriving change, and\n" +
                "•\tFacilitating stakeholder collaboration.\n",R.drawable.baintro));
        introToBaList.add(new Topic("Introduction to Business Analysis", 2,"Key Concepts", "Recall that business analysis is “The practice of enabling change in an organizational context by defining needs and recommending (digitally-enabled) solutions that delivers value to stakeholders”. There are many terms to be further explained in this definition so let’s delve deeper.\n" +
                "•\tChange: The act of transformation in response to a need\n" +
                "•\tNeed: A problem or opportunity to be addressed\n" +
                "•\tSolution: A specific way of satisfying one or more needs in a context\n" +
                "•\tStakeholder: A group or individual with a relationship to the change, the need, or the solution\n" +
                "•\tValue: The worth, importance, or usefulness of something to a stakeholder within a context\n" +
                "•\tContext: The circumstances that influence, are influenced by, and provide understanding of the change\n",R.drawable.bakeyconcepts));
        introToBaList.add(new Topic("Introduction to Business Analysis", 3,"Business Analyst roles across different types of organisations", "There are three main different types of organisations: Conservative, progressive and avant-garde. \n" +
                "Conservative organisations are often characterised by hierarchical organisational structure and very procedural methods of project management (such as waterfall). An example of a conservative organisation would be those in the government-sector. In conservative workplaces, a particular employee (such as a BA) will have limited to a single function and will only have a single role.\n" +
                "Progressive organisations are often those that are fairly flat and are the most responsive to changes and new trends. As such, these organisations often adopt change-based strategies such as Agile. An example of progressive organisations include the big banks, big 4 professional services firms and big insurance companies. In these companies, employees will have defined roles across cross-functional teams.\n" +
                "Avant-garde organisations are often new companies that are extremely welcoming to risk and seek to exploit as many opportunities as possible. Examples of these companies include start-ups, Spotify and Uber. Employees in avant-garde organisations will have customisable roles across cross-functional teams.\n",0));
        return introToBaList;
    }

    public static ArrayList<Topic> getProjectManagement() {
        ArrayList<Topic> projectManagementList = new ArrayList<>();
        projectManagementList.add(new Topic("Project Management", 1,"Introduction", "A project is a set of activities with a beginning and an ending point, meant to create a system, which when completed, is expected to deliver value to the business\n" +
                "Project management is the process of planning and controlling the development of a system within a specified time frame at a minimum cost with the desired functionality.\n" +
                "Projects are driven by business needs which are ideally identified jointly by business people and IT. Within the project, a very important role is the project sponsor who believes in the system and wants to see it succeed. Normally this is a business person who should have the authority to move the project forward.\n", 0));
        projectManagementList.add(new Topic("Project Management", 2,"System Request", "The system request is a document that describes the reasons for and the value added from building a new system. It typically contains five elements:\n" +
                "•\tProject Sponsor: The primary point of contact for the project\n" +
                "•\tBusiness Need: The reason prompting the project\n" +
                "•\tBusiness Requirements: What the system will do\n" +
                "•\tBusiness Value: How will the organization benefit from the project\n" +
                "•\tSpecial Issues or Constraints: Anything else that should be considered\n", 0));
        projectManagementList.add(new Topic("Project Management", 3,"Feasibility Analysis", "Feasibility analysis considers the potential risks and potential benefits of the project to make a decision about whether it is viable to conduct it. There are three major components of feasibility analysis:\n" +
                "Technical Feasibility asks the question “Is the project buildable?”. To determine this, some areas to investigate is the familiarity of the BA’s with the particular portion of the business, the technology available, the project size and compatibility of the end result with the business.\n" +
                "Economic Feasibility asks “Will the project generate a positive return on interest (ROI)”” or in other words, “will it generate enough economic value to offset the costs?”\n" +
                "Organisational Feasibility asks the question “Will the potential users embrace the system?”. To understand whether this is the case, it is important to conduct a stakeholder analysis (More detail in the next chapter)\n", 0));
        projectManagementList.add(new Topic("Project Management", 4,"Stakeholder Analysis", "Stakeholder analysis allows the business to understand the key stakeholders, their interests in the system and what kind of influence they have. \n" +
                "A stakeholder Rainbow is a method of stakeholder analysis that maps stakeholders by their influence on the project and how they are affected by the project. \n" +
                "Interest mapping maps stakeholders by their interest and influence to a project\n", 0));
        projectManagementList.add(new Topic("Project Management", 5,"Project Management Process", "Project selection refers to the choice of approving, declining or delaying a project based on the value added against risks of the project. Selected projects then enter the project management process.\n" +
                "Risk management is the first step of a project and involves identifying and assessing the sources of risk in a project. This is important as risks may threaten the value of the project if not mitigated early.\n" +
                "Scope management is then conducted, which is selecting what work is required in the project. This is extremely important as if the scope is not clearly defined at the start of the project, projects (especially those using Waterfall method) fall prey to scope creep which can threaten the success of the project. Scope creep is simply when the scope of the project increases (or new requirements are added) during the project, causing disorientation if the team already has a rigid plan in place.\n" +
                "Next, the project needs to be staffed. This simply means that the company needs to match individuals to their required activities in the project to ensure that all requirements are fulfilled well. The team then needs to be continually motivated to improve performance and decrease conflict.\n" +
                "Finally, the requirements need to be determined. The purpose of this is to convert high level business requirements from the system request to detail requirements (functional and non-functional requirements). To distinguish the two types of requirements, functional requirements relate to a process or data in the system whilst non-functional requirements refer to the performance and usability of the system. To complete this step, the team firstly has to prepare by considering factors such as the business environment, stakeholders and the decisions they will make about the process. Next is actually conducting the determination either by collaboration with stakeholders, research or experiments. Finally, the results have to be triangulated and the requirements confirmed.\n", 0));
        projectManagementList.add(new Topic("Project Management", 6,"Requirement Analysis", "Requirements Analysis Strategies are a part of requirements determination and are decided upon during the preparation phase. There are three main requirements analysis strategies.\n" +
                "Business Process Automation is a strategy used for small changes and often involves using technology to automate some portions of a process. This process involves a lot of information gathering about the current (as-is) system which often comes in the form of problem analysis or root cause analysis. However, less information gathering is required for the to-be system since is it focused more on improving the current system than making a new one\n" +
                "Business Process Improvement is a strategy used for medium scale changes and involves various analysis tools such as duration analysis, activity-based costing, informal benchmarking and formal benchmarking.\n" +
                "Business Process Re-engineering is used for significant changes as it is a complete overhaul of the current system and replaces it with a completely new system. Thus, the information gathering is not concerned with the current system but more about what the new system offers and how to construct it. Useful analysis tools include outcome analysis, breaking assumptions, technology analysis, activity elimination, proxy benchmarking and process simplification.\n", 0));
        return projectManagementList;
    }


}
