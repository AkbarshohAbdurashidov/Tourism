package uz.asror.tourism.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.databinding.ActivityDetailsBinding;
import uz.asror.tourism.model.Data;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    private ArrayList<Data> listData;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        button = findViewById(R.id.backDetailtoMAin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Intent intent = getIntent();
        ArrayList<String> receivedDataList = intent.getStringArrayListExtra("data");

        binding.placeName.setText(receivedDataList.toString());
        binding.imageViewDetail.setImageResource(Integer.parseInt(String.valueOf(receivedDataList)));
        binding.descriptionDetail.setText(receivedDataList.toString());
        binding.weatherConditions.setText(receivedDataList.toString());
        binding.accommodationNearby.setText(receivedDataList.toString());
        binding.shopNearby.setText(receivedDataList.toString());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}