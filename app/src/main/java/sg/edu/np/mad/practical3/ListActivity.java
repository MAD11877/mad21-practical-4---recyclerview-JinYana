package sg.edu.np.mad.practical3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";
    AlertDialog.Builder builder;
    static ImageView image;
    public static  ArrayList<User> userList = new ArrayList<>();
    Random random = new Random();
    User newuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_list);




        Log.v(TAG, "Create");



        for(int i = 0; i < 20; i++){
            newuser = new User();
            newuser.name = "Name"+random.nextInt();
            newuser.description = "Description" + random.nextInt();
            newuser.id = i;
            newuser.followed = false;
            userList.add(newuser);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview1);
        Recycleradapter sadapter = new Recycleradapter(userList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator((new DefaultItemAnimator()));
        recyclerView.setAdapter(sadapter);

















    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }
}