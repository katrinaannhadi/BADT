package com.katrinaann.badt.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.katrinaann.badt.MainActivity;
import com.katrinaann.badt.R;
import com.katrinaann.badt.Utils;
import com.katrinaann.badt.cardStructures.Category;
import com.katrinaann.badt.database.MyDbHelper;


public class FragmentNewCategory extends DefaultFragment implements View.OnClickListener{

    private static final String LOG_TAG = FragmentNewCategory.class.getSimpleName();

    private Button btnAddCategory;
    private EditText categoryName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new_category, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnAddCategory = (Button) view.findViewById(R.id.addNewCategory);
        btnAddCategory.setOnClickListener(this);

        categoryName = (EditText) view.findViewById(R.id.categoryTitle);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == btnAddCategory.getId()) {

            MyDbHelper dbHelper = new MyDbHelper(getActivity());
            Category category = new Category();

            if(!categoryName.getText().toString().isEmpty()) {
                category.setTitle(categoryName.getText().toString());
                try {
                    dbHelper.createCategory(category);
                    Utils.hideKeyboard(getActivity());
                    ((MainActivity) getActivity()).displayView(MainActivity.CATEGORIES_FRAG, null);
                } catch (Exception ex) {
                    Log.i(LOG_TAG, "Could not create category");
                }
            } else {
                Toast.makeText(getActivity(), "Category MUST have a title.", Toast.LENGTH_LONG).show();
            }
        }
    }
}
