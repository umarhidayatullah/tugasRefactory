package com.example.contacts2021;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private List<Contact> contact;

    public ContactAdapter(Context context, List<Contact> contact) {
        super(context, R.layout.row_layout, contact);
        this.context = context;
        this.contact = contact;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView tvChar = convertView.findViewById(R.id.tvChar);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvMail = convertView.findViewById(R.id.tvMail);

        tvChar.setText(contact.get(position).getName().toUpperCase().charAt(0) + "");
        tvName.setText(contact.get(position).getName());
        tvMail.setText(contact.get(position).getEmail());

        return convertView;
    }
}
