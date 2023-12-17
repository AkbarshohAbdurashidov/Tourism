package uz.asror.tourism.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.databinding.PlaceItemBinding;
import uz.asror.tourism.model.Data;
import uz.asror.tourism.model.DistrictData;

public class PlaceAdapter extends ArrayAdapter<Data> {

    ArrayList<Data> listData;
    ArrayList<DistrictData> districtData;
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
            loadDistricts();
        } else {
            binding = PlaceItemBinding.bind(convertView);
        }
        binding.moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    showDistrictOptionsDialog1(0);

                } else if (position == 1) {
                    showDistrictOptionsDialog2(1);

                } else if (position == 2) {
                    showDistrictOptionsDialog3(2);

                } else if (position == 3) {
                    showDistrictOptionsDialog4(3);

                } else {
                    Toast.makeText(context, "AN erroe ocurred", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Data data = listData.get(position);
        binding.placeName.setText(data.getName());
        binding.placeImageView.setImageResource(data.getPicture());
        return binding.getRoot();
    }

    private void loadDistricts() {
        districtData = new ArrayList<>();

        DistrictData Ddata1 = new DistrictData("Samarkand 1", "Samarkand 2", "Samarkand Unique Place");
        districtData.add(Ddata1);
        DistrictData Ddata2 = new DistrictData("Bukhara 1", "Bukhara 2", "Bukhara Unique Place");
        districtData.add(Ddata2);
        DistrictData Ddata3 = new DistrictData("Khiva 1", "Khiva 2", "Khiva Unique Place");
        districtData.add(Ddata3);
        DistrictData Ddata4 = new DistrictData("Shahrisabz 1", "Shahrisabz 2", "Shahrisabz Unique Place");
        districtData.add(Ddata4);


    }
//   Samarqand
    private void showDistrictOptionsDialog1(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Selected Region: " + listData.get(position).getName());

        final String[] districtOptions = {
                "District 1: " + districtData.get(0).getDistrict_one(),
                "District 2: " + districtData.get(0).getDistrict_two(),
                "Unique Place :" + districtData.get(0).getUnique_place()};
        builder.setItems(districtOptions, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedOption = districtOptions[which];

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        builder.show();
    }

    private void showDistrictOptionsDialog2(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Selected Region: " + listData.get(position).getName());

        final String[] districtOptions = {
                "District 1: " + districtData.get(1).getDistrict_one(),
                "District 2: " + districtData.get(1).getDistrict_two(),
                "Unique Place :" + districtData.get(1).getUnique_place()};
        builder.setItems(districtOptions, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedOption = districtOptions[which];

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        builder.show();
    }

    private void showDistrictOptionsDialog3(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Selected Region: " + listData.get(position).getName());

        final String[] districtOptions = {
                "District 1: " + districtData.get(2).getDistrict_one(),
                "District 2: " + districtData.get(2).getDistrict_two(),
                "Unique Place :" + districtData.get(2).getUnique_place()};
        builder.setItems(districtOptions, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedOption = districtOptions[which];
                selectedOption.toString();

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        builder.show();
    }

    private void showDistrictOptionsDialog4(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Selected Region: " + listData.get(position).getName());


        final String[] districtOptions = {
                "District 1: " + districtData.get(3).getDistrict_one(),
                "District 2: " + districtData.get(3).getDistrict_two(),
                "Unique Place :" + districtData.get(3).getUnique_place()};
        builder.setItems(districtOptions, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedOption = districtOptions[which];

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        builder.show();
    }


}
