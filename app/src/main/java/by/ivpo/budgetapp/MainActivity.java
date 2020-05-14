package by.ivpo.budgetapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private final List<MyCompositeView> items = new ArrayList<>();
    private final RecyclerView.Adapter adapter = new ItemAdapter(this.items);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);

//        LayoutInflater inflater = getLayoutInflater();
//
//        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.main_layout);
//        View view = inflater.inflate(R.layout.mylayout, constraintLayout, true);
//        ViewGroup.LayoutParams lp = view.getLayoutParams();


    }

    private static final class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final List<MyCompositeView> items;

        public ItemAdapter(List<MyCompositeView> items) {
            this.items = items;
        }


        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.composite, parent, false)) {
            };
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            ImageView imageView = holder.itemView.findViewById(R.id.image);

            TextView tv1 = holder.itemView.findViewById(R.id.payment);
            TextView tv2 = holder.itemView.findViewById(R.id.card);
            TextView tv3 = holder.itemView.findViewById(R.id.price);
            TextView tv4 = holder.itemView.findViewById(R.id.date);

            imageView.setImageResource(R.drawable.house1);
            tv1.setText("Дом");
            tv2.setText("Тест счет");
            tv3.setText("1000р");
            tv4.setText("01.01.2020");

        }

        @Override
        public int getItemCount() {
            return this.items.size();
        }
    }


    public void click(View view) {
        TextView tv = findViewById(R.id.txt);
        tv.setText("Дом");

        ImageView imageView = findViewById(R.id.image);
        TextView tv1 = findViewById(R.id.payment);
        TextView tv2 = findViewById(R.id.card);
        TextView tv3 = findViewById(R.id.price);
        TextView tv4 = findViewById(R.id.date);
        imageView.setImageResource(R.drawable.house1);
        tv1.setText("Дом");
        tv2.setText("Тест счет");
        tv3.setText("1000р");
        tv4.setText("01.01.2020");


    }

    public void add(View view) {
        this.items.add(new MyCompositeView(this));
        adapter.notifyItemInserted(this.items.size() - 1);
    }

    public void click1(View view) {
        TextView tv = findViewById(R.id.txt);
        tv.setText("Продукты");

        ImageView imageView = findViewById(R.id.image);
        TextView tv1 = findViewById(R.id.payment);
        TextView tv2 = findViewById(R.id.card);
        TextView tv3 = findViewById(R.id.price);
        TextView tv4 = findViewById(R.id.date);
        imageView.setImageResource(R.drawable.food1);
        tv1.setText("Продукты");
        tv2.setText("Тест счет");
        tv3.setText("1000р");
        tv4.setText("01.01.2020");

    }
}



