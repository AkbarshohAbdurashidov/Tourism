package uz.asror.tourism.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.databinding.ActivityPlaceDetailBinding;
import uz.asror.tourism.fragments.AccommodationNearbyFragment;
import uz.asror.tourism.model.Data;

public class PlaceDetail extends AppCompatActivity {

    ActivityPlaceDetailBinding binding;
    private ArrayList<Data> listData = new ArrayList<>();
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
        String name = intent.getStringExtra("name");
        int picture = intent.getIntExtra("picture", 0);
        String description = intent.getStringExtra("description");
        String weather = intent.getStringExtra("weather");
        String accommodation = intent.getStringExtra("accommodationNearby");
        String accommodation1 = intent.getStringExtra("accommodationNearby1");
        String shops = intent.getStringExtra("shopNearby");
        String shops1 = intent.getStringExtra("shopNearby1");

        TextView placeName = findViewById(R.id.placeName);
        ImageView imageView = findViewById(R.id.placeImageDetail);
        TextView descriptionDetail = findViewById(R.id.descriptionDetail);
        TextView weatherConditions = findViewById(R.id.weatherConditions);
        TextView accommodationNearby = findViewById(R.id.accommodationNearby);
        TextView accommodationNearby1 = findViewById(R.id.accommodationNearby2);
        TextView shopNearby = findViewById(R.id.shopNearby);
        TextView shopNearby1 = findViewById(R.id.shopNearby2);

        placeName.setText(name);
        Glide.with(this).load(picture).into(imageView);
        descriptionDetail.setText(description);
        weatherConditions.setText(weather);
        accommodationNearby.setText(accommodation);
        accommodationNearby1.setText(accommodation1);
        shopNearby.setText(shops);
        shopNearby1.setText(shops1);

        accommodationNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PlaceDetail.this, AccommodationNearbyFragment.class);
                startActivity(intent1);
            }
        });

    }


}