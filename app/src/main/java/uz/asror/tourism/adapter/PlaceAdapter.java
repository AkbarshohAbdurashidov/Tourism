package uz.asror.tourism.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.databinding.PlaceItemBinding;
import uz.asror.tourism.model.Data;
import uz.asror.tourism.model.District;

public class PlaceAdapter extends ArrayAdapter<Data> {

    ArrayList<Data> listData;
    private Context context;

    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Data> listData) {
        super(context, R.layout.place_item, listData);
        this.context = context;
        this.listData = listData;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        PlaceItemBinding binding;
        if (convertView == null) {
            binding = PlaceItemBinding.inflate(LayoutInflater.from(context), parent, false);
        } else {
            binding = PlaceItemBinding.bind(convertView);
        }
        Data data = listData.get(position);
        binding.placeName.setText(data.getName());
        binding.placeImageView.setImageResource(data.getPicture());
        return binding.getRoot();
    }


}
