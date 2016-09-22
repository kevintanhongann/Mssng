package com.mssng.android.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mssng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by kevintan on 23/09/2016.
 */

public class PersonViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.imageview_person)
    CircleImageView mImageView;

    @BindView(R.id.textview_name)
    TextView tvName;

    @BindView(R.id.textview_lastseen)
    TextView tvLastSeen;

    public PersonViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
