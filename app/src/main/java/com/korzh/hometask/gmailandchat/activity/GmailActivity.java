package com.korzh.hometask.gmailandchat.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.korzh.hometask.gmailandchat.R;
import com.korzh.hometask.gmailandchat.adapter.GmailAdapter;

import static com.korzh.hometask.gmailandchat.util.DataUtil.getItems;

public class GmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initToolbar();
        initRecyclerView();
        initFloatingActBt();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_gmail);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
        GmailAdapter adapter = new GmailAdapter(getItems());
        recyclerView.setAdapter(adapter);
    }

    private void initFloatingActBt() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startChat();
            }
        });
    }

    public static void startChat() {
//        Intent starter = new Intent(context, GmailActivity.class);
//        starter.putExtra();
//        context.startActivity(starter);
    }

}
