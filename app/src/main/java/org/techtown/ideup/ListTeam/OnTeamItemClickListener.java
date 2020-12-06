package org.techtown.ideup.ListTeam;

import android.view.View;

import org.techtown.ideup.TeamComplain.TeamComplainAdapter;

public interface OnTeamItemClickListener {
    public void onItemClick(teamAdapter.ViewHolder holder, View view, int position);
}
