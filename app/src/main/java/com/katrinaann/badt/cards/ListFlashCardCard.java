package com.katrinaann.badt.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.katrinaann.badt.R;
import com.katrinaann.badt.cardStructures.FlashCard;
import com.katrinaann.badt.database.MyDbHelper;
import it.gmariotti.cardslib.library.internal.Card;

public class ListFlashCardCard extends Card implements Card.OnCardClickListener, Card.OnSwipeListener, Card.OnUndoSwipeListListener {

    private FlashCard flashCard;
    private MyDbHelper helper;

    public ListFlashCardCard(Context context) {
        super(context, R.layout.card_flashcard);
        helper = new MyDbHelper(context);
        this.setSwipeable(true);
        this.setOnClickListener(this);
        this.setOnSwipeListener(this);
        this.setOnUndoSwipeListListener(this);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        super.setupInnerViewElements(parent, view);

        TextView flashcardTitle = (TextView) view.findViewById(R.id.titleFlashcard);

        if(flashCard != null) {
            String title = flashCard.getContent().length() > 20 ? flashCard.getContent().substring(0, 20) : flashCard.getContent();
            flashcardTitle.setText(title);
        }
    }

    @Override
    public void onClick(Card card, View view) {

    }

    @Override
    public void onSwipe(Card card) {
        helper.deleteFromDB(flashCard.getId(), MyDbHelper.FLASHCARDS_TABLE);
    }

    @Override
    public void onUndoSwipe(Card card) {
        helper.undoFlashcard(flashCard);
    }

    public FlashCard getFlashCard() {
        return flashCard;
    }

    public void setFlashCard(FlashCard flashCard) {
        this.flashCard = flashCard;
    }
}
