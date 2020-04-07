package com.katrinaann.badt.cards;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.katrinaann.badt.MainActivity;
import com.katrinaann.badt.R;
import com.katrinaann.badt.cardStructures.Category;
import com.katrinaann.badt.database.MyDbHelper;
import it.gmariotti.cardslib.library.internal.Card;


public class CategoryCard extends Card implements Card.OnSwipeListener, Card.OnCardClickListener, Card.OnUndoSwipeListListener {

    private Category category;
    private MyDbHelper helper;

    public CategoryCard(Context context) {
        super(context, R.layout.card_category);
        helper = new MyDbHelper(context);
        this.setSwipeable(true);
        this.setOnClickListener(this);
        this.setOnSwipeListener(this);
        this.setOnUndoSwipeListListener(this);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        super.setupInnerViewElements(parent, view);

        TextView categoryTitle = (TextView) view.findViewById(R.id.titleCategory);

        if(category != null) {
            categoryTitle.setText(category.getTitle());
        }
    }

    @Override
    public void onClick(Card card, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong(MyDbHelper._ID, category.getId());
        bundle.putString(MyDbHelper.TITLE, category.getTitle());

        ((MainActivity) getContext()).displayView(MainActivity.DECKS_FRAG, bundle);
    }

    @Override
    public void onSwipe(Card card) {
        helper.deleteFromDB(category.getId(), MyDbHelper.CATEGORIES_TABLE);
    }

    @Override
    public void onUndoSwipe(Card card) {
        helper.undoCategory(category);
    }
}
