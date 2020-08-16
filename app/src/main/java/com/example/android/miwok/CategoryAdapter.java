package com.example.android.miwok;

import android.content.Context;
import androidx.fragment.app.FragmentManager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class CategoryAdapter extends FragmentStateAdapter {


    public CategoryAdapter(Context context) {
        super((FragmentActivity) context);
    }


    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */


    @Override
    public int getItemCount() {
        return 4;
    }






}
