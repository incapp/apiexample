package com.incapp.apiexample;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);

        final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("Please wait...");
        progressDialog.setMessage("Loading");

        progressDialog.show();

        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                "https://yts.am/api/v2/list_movies.json?limit=20",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        progressDialog.dismiss();

                        MoviesResponse moviesResponse =
                                new Gson().fromJson(response.toString()
                                        , MoviesResponse.class);

                        MovieListAdaptor movieListAdaptor = new MovieListAdaptor(
                                MainActivity.this,
                                moviesResponse.getData().getMovies()
                        );

                        listview.setAdapter(movieListAdaptor);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity.this,
                                error.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
        );

        Volley.newRequestQueue(MainActivity.this)
                .add(jsonObjectRequest);

    }
}
