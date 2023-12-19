package uz.asror.tourism.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.model.Data;
import uz.asror.tourism.view.MainActivity;

public class PlaceAdapter extends BaseAdapter {
    ArrayList<Data> placeData;
    MainActivity mainActivity = new MainActivity();

    Context context;

    public PlaceAdapter(ArrayList<Data> placeData, Context context) {
        this.placeData = placeData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return placeData.size();
    }

    @Override
    public Object getItem(int position) {
        return placeData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.place_item, parent, false);
            holder = new ViewHolder();
            holder.placeImageView = convertView.findViewById(R.id.ImageView);
            holder.placeName = convertView.findViewById(R.id.placeName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Data data = placeData.get(position);
        holder.placeName.setText(data.getName());
        holder.placeImageView.setImageResource(data.getPicture());
        return convertView;
    }

    private static class ViewHolder {
        TextView placeName;
        ImageView placeImageView;
    }

}