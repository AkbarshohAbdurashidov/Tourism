package uz.asror.tourism.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import uz.asror.tourism.R;
import uz.asror.tourism.databinding.ActivityDetailsBinding;
import uz.asror.tourism.model.Data;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    private ArrayList<Data> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        if (intent != null) {
            String mainData = intent.getStringExtra("data");
            if (mainData != null) {
                binding.descriptionDetail.setText("");

            }
        }
    }
}