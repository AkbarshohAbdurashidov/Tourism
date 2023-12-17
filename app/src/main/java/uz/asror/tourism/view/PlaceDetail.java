package uz.asror.tourism.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.databinding.ActivityPlaceDetailBinding;
import uz.asror.tourism.model.Data;

public class PlaceDetail extends AppCompatActivity {

    ActivityPlaceDetailBinding binding;
    private ArrayList<Data> listData;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);
        button = findViewById(R.id.backDetailtoMAin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceDetail.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        Intent intent = getIntent();
        ArrayList<String> receivedDataList = intent.getStringArrayListExtra("data");

        TextView placeName = findViewById(R.id.placeName);
        ImageView imageViewDetail = findViewById(R.id.imageViewDetail);
        TextView descriptionDetail = findViewById(R.id.descriptionDetail);
        TextView weatherConditions = findViewById(R.id.weatherConditions);
        TextView accommodationNearby = findViewById(R.id.accommodationNearby);
        TextView shopNearby = findViewById(R.id.shopNearby);


        int size = receivedDataList.size();
        if (size >= 1) placeName.setText(receivedDataList.get(0));
        if (size >= 2) imageViewDetail.setImageResource(Integer.parseInt(receivedDataList.get(1)));
        if (size >= 3) descriptionDetail.setText(receivedDataList.get(2));
        if (size >= 4) weatherConditions.setText(receivedDataList.get(3));
        if (size >= 5) accommodationNearby.setText(receivedDataList.get(4));
        if (size >= 6) shopNearby.setText(receivedDataList.get(5));

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PlaceDetail.this, MainActivity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
}