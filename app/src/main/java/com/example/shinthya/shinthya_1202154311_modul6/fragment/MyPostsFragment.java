package com.example.shinthya.shinthya_1202154311_modul6.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
/**
 * Created by USER on 4/1/2018.
 */

public class MyPostsFragment extends PostListFragment{

    public MyPostsFragment() {}



   @Override
    public Query getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}

