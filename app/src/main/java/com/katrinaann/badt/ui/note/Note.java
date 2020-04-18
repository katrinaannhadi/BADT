package com.katrinaann.badt.ui.note;

import android.graphics.drawable.Drawable;
import android.os.Parcel;

import com.katrinaann.badt.R;

import java.util.ArrayList;

//class for objects to classify restaurants
public class Note {

    //unique ID for Restaurant object
    private int restaurantID;
    //name, type of cuisine, location, rating
    private String name;
    private String cuisineType;
    private String location;
    private String rating;
    private int imageID;
    private Drawable imageDrawable;
    private String about;

    public Note() {
    }

    public Note(String name, String cuisineType, String location, String rating, int imageID, String about) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.location = location;
        this.rating = rating;
        this.imageID = imageID;
        this.about = about;
    }

    public Note(Parcel source) {
        restaurantID = source.readInt();
        name = source.readString();
        cuisineType = source.readString();
        location = source.readString();
        rating = source.readString();
        imageID = source.readInt();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public static ArrayList<Note> getRestaurant() {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("1. Lankan Filling Station", "Sri Lankan", "Darlinghurst", "5/5", R.drawable.lankan, "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        notes.add(new Note("2. Quay", "Australian Fine Dining", "The Rocks", "4/5", R.drawable.quay, "Not every restaurant closes the doors at its creative peak, undergoes a multimillion-dollar reinvention and resurfaces, almost impossibly, as an even better version of itself. But Quay has proved, time and again, that it's certainly not every restaurant. From the oyster-free oyster intervention, to the heartbreakingly beautiful marron and flowers and the otherworldly white coral dessert, Peter Gilmore's intricate and imaginative plates almost distract you entirely from those shameless and shimmering dress-circle harbour views – and that's really saying something. The king of Sydney fine dining still reigns supreme."));
        notes.add(new Note("3. Momofuku Seiobo", "Caribbean", "Darling Harbour", "4/5", R.drawable.momofoku, "Our 2019 Chef of the Year, Paul Carmichael, is a man of many talents. Sit at the bar – you'll discover he makes some of the best roti in town, fries up a chicken sandwich you won't soon forget and bakes a coconut turnover that will roll your eyes to the back of their sockets. Sit ringside at the kitchen counter, and you'll see the wizard himself at work, whipping up a brightly coloured, dazzling degustation that has you grinding your own plantains, greeting the marron that will later become one of your courses and experiencing the tastes of the Caribbean in ways you never knew existed. "));
        notes.add(new Note("4. Saint Peter", "Seafood", "Paddington", "5/5", R.drawable.peter, "Sydney is synonymous with seafood, but what Josh Niland does at his sliver of a restaurant in Paddington is take the treasures of the deep to another plane. Not only does he source with great care and attention, but he also does things to fish that nobody else does: dry-aging fillets, using eyeballs as chips, turning offal into things you often end up enjoying more than the flesh. More the no-frills fish-and-chips type? He makes a mighty mean one. And a few words of advice: don't skip dessert – the custard tart is a masterpiece."));
        notes.add(new Note("5. Bentley Restaurant and Bar", "Australian", "Sydney CBD", "5/5", R.drawable.bentley, "The fact that there are so many ways to enjoy Bentley makes it that much more enjoyable. It might just be the best place to drink wine in the city, so pull up a stool at the bar and dive in to the riveting list with an open mind, knowing that sophisticated snacks like witlof and white pea hummus are on hand for the peckish. Sneak out of the office for a two-course lunch that sets you back just $65, or go ham and conquer the tasting menu with gusto – uncompromising quality, complexity and creativity are never in question."));
        notes.add(new Note("6. Hubert", "French", "Sydney CBD", "4/5", R.drawable.hubert, "Hubert knows and understands the fantasy of restaurants better than any other in Sydney. Stepping down the spiraling stairs and into the immersive, hyperstylised French wonderland never gets old, and neither does the triumphant chicken fricasee, the heart-clogging dominoes of crisp potato that are the pommes Anna, or the kimchi gratin that in theory shouldn't work but really, really does. Bonus points for the live jazz and a happy hour that boasts addictive deviled eggs and killer ten-buck burgers."));
        notes.add(new Note("7. Ester", "Australian Fusion", "Chippendale", "4/5", R.drawable.ester, "Nothing makes you fall in love with Ester like a long Sunday lunch, when daylight spills through the windows and into the nooks and crannies of all the arches in the airy, bare-bones room. That irresistible blood sausage sanga, those ferociously delicious king prawns in fermented shrimp butter and that whole cauliflower with almonds and mint are still on the menu for a reason. Bow down, this is wood-fired cooking at its finest. "));
        notes.add(new Note("8. Yellow", "Vegan Brunch", "Potts Point", "5/5", R.drawable.yellow, "It takes a kind of vision bordering on the mad to see a burnt onion as a dessert, but that is the creative genius we’re dealing with from the team at Yellow. We expect vegetables to be part of a every great tasting menu in Sydney, but it’s rare to see them as masterfully handled as they are here, dish after dish, time after time. This restaurant has seismically shifted how we frame fine dining in Sydney, and we love them for it."));
        notes.add(new Note("9. Sixpenny", "Modern Australian", "Stanmore", "4/5", R.drawable.sixpenny, "This intimate, understated and ever dependable Stanmore sweetheart is almost unparalleled when it comes to nailing the details. Dan Puskas's degustation is pioneering in its own distinct way, a parade of multidimensional dishes that don't scream for attention, but command it with impressive technique and a deep understanding of flavour and texture."));
        notes.add(new Note("10. Bella Brutta", "Pizza", "Newtown", "4/5", R.drawable.bella, "Our Best New Restaurant winner takes the notion of the ideal neighbourhood pizzeria and turns it up to 11. Each and every one of the blistered bad boys that slides out of the oven is good, but if there’s one pizza at Bella Brutta you’ve got to get your hands on, it’s the clam. Diced surf clams are the unlikely hero of the tomato-free flavour bomb, coated instead with a briny riff on béchamel, and showered with fermented chilli, garlic and parsley. It’s a revelation."));
        return notes;
    }
}
