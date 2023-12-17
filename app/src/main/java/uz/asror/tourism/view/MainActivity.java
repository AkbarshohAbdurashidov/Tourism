package uz.asror.tourism.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import uz.asror.tourism.R;
import uz.asror.tourism.adapter.PlaceAdapter;
import uz.asror.tourism.databinding.ActivityMainBinding;
import uz.asror.tourism.model.Data;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Data> placeData;
    private List<String> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadPlaces();
        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeData);
        binding.listView.setAdapter(placeAdapter);
//        binding.menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Menu is Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });

//        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "Listview bosildi!", Toast.LENGTH_SHORT).show();
//                String itemPosition = (String) parent.getItemAtPosition(position);
//                Intent intent = new Intent(getApplicationContext(), PlaceDetail.class);
//                intent.putExtra("data1", itemPosition);
//                startActivity(intent);
//                finish();
//
//                Log.d("ListviewBosilishi", "onItemClick: " + "itemPosition");
//            }
//        });
    }

    private void loadPlaces() {
        placeData = new ArrayList<>();


        Data data1 = new Data("Samarkand", R.drawable.samarkand,
                "Samarkand – Crossroad of Cultures” is the official moniker "
                        + "used to describe this city as a UNESCO World Heritage site.  "
                        + "Samarkand conjures up images of ancient times and sounds almost "
                        + "mythical.  However, this is no fairytale: Samarkand today is a lively "
                        + "city that cherishes its traditions.  Archaeological excavations have "
                        + "revealed a history which dates back 3500 years; the town of Afrosiab was "
                        + "founded in the 7th century BC.  The area was continuously inhabited and s"
                        + "erved as a melting pot of diverse cultures.  It was conquered by Alexander the "
                        + "Great and Genghis Khan, was the sumptuous capital of the Timurid Empire and played "
                        + "an important role in the development of Islamic architecture and arts.  You won’t want "
                        + "to miss Registan square, the Bibi Khanum and Gur Emir Mausoleums, the Shah-i-Zinda "
                        + "complex, Afrosiab  & the Ulughbek Observatory.",
                "Sunny",
                "Super Market",
                "Local Souvenir Shop");
        placeData.add(data1);

        Data data2 = new Data("Bukhara", R.drawable.bukhara,
                "The historic center of Bukhara has been an important " +
                        "base for Islamic theology and science for several centuries." +
                        "  Its well-preserved city center was recognized by UNESCO as an " +
                        "exemplary medieval city.  City-planning, urban, economic, and scientific" +
                        " development in Bukhara had a large impact on the Islamic World in the Middle" +
                        "Ages.  The earliest architectural monument is the tomb of Ismail Somoni dating" +
                        " back to the 10th century. For seven centuries up until the 16th century, it was" +
                        " the largest Islamic center for the study of Sufism with hundreds of mosques and" +
                        " madrasas or learning places.  World-renowned scholar Avicenna was born near Bukhara " +
                        "and grew up there.  While in Bukhara we’d recommend taking a stroll around the old city" +
                        " to savor its architectural legacy and imagine yourself bargaining as they would have " +
                        "done in medieval times.",
                "Partly Cloudy",
                "Park View Hotel",
                "Park Cafeteria");
        placeData.add(data2);

        Data data3 = new Data("Khiva", R.drawable.khiva, "Khiva is the first UNESCO World Heritage site in Uzbekistan was inscribed in 1990 noting its importance in the exceptional heritage of ancient Silk Road traditions.  Itchan Kala, which literally translates as the inner part of the old city, is surrounded by thick mud walls.  It contains 51 monuments and is although around 250 households still make their home inside, it feels more like an open-air museum.  Looking down from Islam Khoja minaret or the city walls, it’s hard to imagine this is the 21st century.  It is here in Khiva that the scholar AI-Khoresmi, the father of algebra, was born and introduced algorithms to the world.  Take a guided tour to get to know the stories that feature in the history of this fascinating city.", "Clear Sky", "Bazaar Inn", "Spice Shop");
        placeData.add(data3);

        Data data4 = new Data("Shahrisabz", R.drawable.shahrisabz, "This flourishing city of the Timurid Empire is the birthplace of the great medieval conqueror Amir Temur.  It has exceptional monuments from 14th to 15th centuries though its history dates back over 2000 years.  Its historic center retains the layout from the original Timurid city planning.  Amir Temur ordered the Ak Sarai – the white summer palace – to be built as well as his own grave. Tamerlane’s summer palace was one of the highlights of the Timurid architecture.  These days you can still see the remains of the palace’s 65 meter high monumental gates.", "Sunny", "Oasis Retreat", "Nomad's Tent");
        placeData.add(data4);

    }

}