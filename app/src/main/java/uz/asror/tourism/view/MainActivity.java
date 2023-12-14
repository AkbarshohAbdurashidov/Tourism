package uz.asror.tourism.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uz.asror.tourism.R;
import uz.asror.tourism.adapter.PlaceAdapter;
import uz.asror.tourism.databinding.ActivityMainBinding;
import uz.asror.tourism.model.Data;
import uz.asror.tourism.model.District;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Data> placeData;
    private ListView listView;
    private Spinner spinner;
    private ArrayAdapter<String> spinnerAdapter;
    private List<String> dataList;
    private HashMap<String, List<String>> regionDistrictMap;
    private HashMap<Integer, List<String>> spinnerDataMap;

    List<District> districts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadPlaces();
        dataList =  generateData();
        spinnerDataMap = generateSpinnerData();


        // Set up ArrayAdapter for the region ListView
        ArrayAdapter<String> regionListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<>(regionDistrictMap.keySet()));
        binding.listView.setAdapter(regionListAdapter);
        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeData);
        binding.listView.setAdapter(placeAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                placeAdapter.getItem(position);


            }
        });

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(listViewAdapter);

        // Spinner ni o'rnating va adapterga ulang
        spinner = findViewById(R.id.spinner);
        spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new ArrayList<>());
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        if (spinner != null) {
            spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    updateSpinnerData(position);
                }
            });
        }

    }

    private List<String> generateData() {
        List<String> data = new ArrayList<>();
        // Sample data
        List<String> districts1 = new ArrayList<>();
        districts1.add("District 1");
        districts1.add("District 2");
        districts1.add("District 3");

        List<String> districts2 = new ArrayList<>();
        districts2.add("District 4");
        districts2.add("District 5");
        districts2.add("District 6");

        List<String> districts3 = new ArrayList<>();
        districts3.add("District 7");
        districts3.add("District 8");
        districts3.add("District 9");

        List<String> districts4 = new ArrayList<>();
        districts4.add("District 10");
        districts4.add("District 11");
        districts4.add("District 12");

        regionDistrictMap.put("Region 1", districts1);
        regionDistrictMap.put("Region 2", districts2);
        regionDistrictMap.put("Region 3", districts3);
        regionDistrictMap.put("Region 4", districts4);
        return data;
    }

    private HashMap<Integer, List<String>> generateSpinnerData() {
        // Har bir ListView elementi uchun Spinner malumotlarini generatsiya qilish
        // Sizning loyihangizga qarab malumotlarni o'zgartiring
        HashMap<Integer, List<String>> map = new HashMap<>();
        map.put(0, generateSpinnerDataForItem(1));
        map.put(1, generateSpinnerDataForItem(2));
        map.put(2, generateSpinnerDataForItem(3));
        map.put(3, generateSpinnerDataForItem(4));
        return map;
    }

    private List<String> generateSpinnerDataForItem(int itemNumber) {
        // Har bir element uchun Spinner malumotlarni generatsiya qilish
        List<String> spinnerData = new ArrayList<>();
        spinnerData.add("Spinner Item " + itemNumber + " - 1");
        spinnerData.add("Spinner Item " + itemNumber + " - 2");
        spinnerData.add("Spinner Item " + itemNumber + " - 3");
        return spinnerData;
    }

    private void updateSpinnerData(int position) {
        // Spinner malumotlarini o'zgartirish
        List<String> spinnerData = spinnerDataMap.get(position);
        spinnerAdapter.clear();
        spinnerAdapter.addAll(spinnerData);
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

        Data data2 = new Data("Bukhara", R.drawable.bukhara, "The historic center of Bukhara has been an important base for Islamic theology and science for several centuries.  Its well-preserved city center was recognized by UNESCO as an exemplary medieval city.  City-planning, urban, economic, and scientific development in Bukhara had a large impact on the Islamic World in the Middle Ages.  The earliest architectural monument is the tomb of Ismail Somoni dating back to the 10th century. For seven centuries up until the 16th century, it was the largest Islamic center for the study of Sufism with hundreds of mosques and madrasas or learning places.  World-renowned scholar Avicenna was born near Bukhara and grew up there.  While in Bukhara we’d recommend taking a stroll around the old city to savor its architectural legacy and imagine yourself bargaining as they would have done in medieval times.", "Partly Cloudy", "Park View Hotel", "Park Cafeteria");
        placeData.add(data2);

        Data data3 = new Data("Khiva", R.drawable.khiva, "Khiva is the first UNESCO World Heritage site in Uzbekistan was inscribed in 1990 noting its importance in the exceptional heritage of ancient Silk Road traditions.  Itchan Kala, which literally translates as the inner part of the old city, is surrounded by thick mud walls.  It contains 51 monuments and is although around 250 households still make their home inside, it feels more like an open-air museum.  Looking down from Islam Khoja minaret or the city walls, it’s hard to imagine this is the 21st century.  It is here in Khiva that the scholar AI-Khoresmi, the father of algebra, was born and introduced algorithms to the world.  Take a guided tour to get to know the stories that feature in the history of this fascinating city.", "Clear Sky", "Bazaar Inn", "Spice Shop");
        placeData.add(data3);

        Data data4 = new Data("Shahrisabz", R.drawable.shahrisabz, "This flourishing city of the Timurid Empire is the birthplace of the great medieval conqueror Amir Temur.  It has exceptional monuments from 14th to 15th centuries though its history dates back over 2000 years.  Its historic center retains the layout from the original Timurid city planning.  Amir Temur ordered the Ak Sarai – the white summer palace – to be built as well as his own grave. Tamerlane’s summer palace was one of the highlights of the Timurid architecture.  These days you can still see the remains of the palace’s 65 meter high monumental gates.", "Sunny", "Oasis Retreat", "Nomad's Tent");
        placeData.add(data4);

    }

//    private void loadDistricts() {
//        districts = new ArrayList<>();
//
//        District district1 = new District("Yunusobod", "Uch Tepa");
//        districts.add(district1);
//
//        District district2 = new District("bukhara 1", "bukhara 2");
//        districts.add(district2);
//
//        District district3 = new District("khiva 1", "khiva 2");
//        districts.add(district3);
//
//        District district4 = new District("Shahrisabz 1", "Shahrisabz 2");
//        districts.add(district4);
//    }


}