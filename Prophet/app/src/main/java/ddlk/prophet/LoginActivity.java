package ddlk.prophet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLConnection;
import java.net.URI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Driver;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via username/password.
 */
public class LoginActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickedLogin(View v) throws IOException {
        Button button = (Button) v;
        ((Button) v).setText("Wassup");

        Intent i = new Intent(LoginActivity.this, HomePage.class);
        startActivity(i);

        /***
         * NEED TO CHECK IF USERNAME AND PASSWORD ARE IN OUR DATABASE... LOGIN IF SO
         */

        /*String username = "root";
        String password = "cs411fa2016";

        URL url = new URL("localhost/connect.php");
        String data = URLEncoder.encode("username", "UTF-8")
                    + "=" + URLEncoder.encode(username, "UTF-8");
        data += "&" + URLEncoder.encode("password", "UTF-8")
                    + "=" + URLEncoder.encode(password, "UTF-8");
        URLConnection conn = url.openConnection();

        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(data);
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        */

    }

    public void clickedRegister(View v) throws IOException {

        View back = findViewById(R.id.backButton);
        back.setVisibility(View.VISIBLE);

        View log = findViewById(R.id.loginButton);
        log.setVisibility(View.INVISIBLE);

        View create = findViewById(R.id.createButton);
        create.setVisibility(View.VISIBLE);

        v = findViewById(R.id.registerButton);
        v.setVisibility(View.INVISIBLE);
    }

    public void clickedBack(View v) throws IOException {

        View back = findViewById(R.id.backButton);
        back.setVisibility(View.INVISIBLE);

        View log = findViewById(R.id.loginButton);
        log.setVisibility(View.VISIBLE);

        View create = findViewById(R.id.createButton);
        create.setVisibility(View.INVISIBLE);

        v = findViewById(R.id.registerButton);
        v.setVisibility(View.VISIBLE);
    }

    public void clickedCreate(View v) throws IOException {
    }
}


