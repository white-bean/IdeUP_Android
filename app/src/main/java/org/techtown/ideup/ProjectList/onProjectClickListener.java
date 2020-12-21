package org.techtown.ideup.ProjectList;

import android.view.View;

import org.techtown.ideup.UserComplain.UserComplainAdapter;

public interface onProjectClickListener {
    public void onItemClick(ProjectListAdapter.ViewHolder holder, View view, int position);
}
