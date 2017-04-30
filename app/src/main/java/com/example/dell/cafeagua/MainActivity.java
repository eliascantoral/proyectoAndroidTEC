package com.example.dell.cafeagua;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    private ListView lvMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvMainMenu = (ListView) findViewById(R.id.lvMainMenu);
        lvMainMenu.setAdapter(new MainMenuAdapter(this, R.layout.main_list_item,
                getResources().getStringArray(R.array.opt_main_menu)));

        lvMainMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(), Description.class);
                intent.putExtra("coffeid", String.valueOf(i));
                startActivity(intent);
            }
        });

        WebView myWebView = (WebView) findViewById(R.id.webviewbox);
        myWebView.loadUrl("http://www.anacafe.org/glifos/index.php?title=Especial:GraficaDePreciosDelCafe");
    }

}
