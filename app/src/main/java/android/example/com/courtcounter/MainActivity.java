package android.example.com.courtcounter;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * This method is called when the "+3 POINTS" button is pushed
     */
    public void addThreeForTeamA(View view) {
        displayForTeamA(3);
    }

    /**
     * This method is called when the "+2 POINTS" button is pushed
     */
    public void addTwoForTeamA(View view) {
        displayForTeamA(2);
    }

    /**
     * This method is called when the "FREE THROW" button is pushed
     */
    public void addOneForTeamA(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
