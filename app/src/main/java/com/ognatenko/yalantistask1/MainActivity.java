package com.ognatenko.yalantistask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setHeader();
        setRecyclerView();
    }

    public void onClick(View view) {
        String toastText = view.getClass().getCanonicalName();
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }


    private void setHeader() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("CE-1252718");
        }
    }

    private void setRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_image_list);
        recyclerView.addItemDecoration(new CustomItemDecoration((int) getResources().getDimension(R.dimen.recycler_margin)));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        CustomRecyclerView customRecyclerView = new CustomRecyclerView(this, getResources().getStringArray(R.array.imageList));
        recyclerView.setAdapter(customRecyclerView);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

}
