package net.androidbootcamp.checkcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_score_A);
        quantityTextView.setText("" + number);}
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_score_B);
        quantityTextView.setText("" + number);}
    public void IncrementScoreA(View view){
        scoreA=scoreA+1;
        displayA(scoreA);}
    public void IncrementScoreB(View view){
        scoreB=scoreB+1;
        displayB(scoreB);}
    public void IncrementScoreA2(View view){
        scoreA=scoreA+2;
        displayA(scoreA);}
    public void IncrementScoreB2(View view){
        scoreB=scoreB+2;
        displayB(scoreB);}
    public void IncrementScoreA3(View view){
        scoreA=scoreA+3;
        displayA(scoreA);}
    public void IncrementScoreB3(View view){
        scoreB=scoreB+3;
        displayB(scoreB);}
}
