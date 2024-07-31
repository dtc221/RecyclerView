package dtclab221.tuto.easyrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Pays> paysArrayList = new ArrayList<Pays>();
    AdapterRecyclerView adapterRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadData();
    }

    private void loadData() {

        paysArrayList.add(new Pays("Senegal", R.drawable.sn));
        paysArrayList.add(new Pays("Guinee", R.drawable.guinee));
        paysArrayList.add(new Pays("Gambie", R.drawable.gambie));
        paysArrayList.add(new Pays("Guinee Bissau", R.drawable.gb));
        paysArrayList.add(new Pays("Mali", R.drawable.mali));
        paysArrayList.add(new Pays("Togo", R.drawable.tg));
        paysArrayList.add(new Pays("Niger", R.drawable.niger));
        paysArrayList.add(new Pays("Nigeria", R.drawable.ng));
        paysArrayList.add(new Pays("Burkina Fasso", R.drawable.bk));
        paysArrayList.add(new Pays("Cote d ivoire", R.drawable.ci));



        adapterRecyclerView = new AdapterRecyclerView(this, paysArrayList);
        recyclerView.setAdapter(adapterRecyclerView);
    }
}