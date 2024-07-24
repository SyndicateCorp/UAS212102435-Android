package com.syndicate.uas212102435;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
    public TextView _jkTextView, _namaTextView, _nimTextView;

    public MahasiswaViewHolder(View itemView) {
        super(itemView);
        _namaTextView = itemView.findViewById(R.id.namaTextView);
        _nimTextView = itemView.findViewById(R.id.nimTextView);
        _jkTextView = itemView.findViewById(R.id.jkTextView);

    }
}
