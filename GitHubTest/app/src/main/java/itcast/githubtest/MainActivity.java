package itcast.githubtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import itcast.githubtestlibrary.GitHubTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new GitHubTest();
        //11111111111111111111111
        //2222222222222222222222
        //33333333333333333
        //44444444444444
		//5555555555555555555
		//6666666666666
		//7777777777777777777
		//888888888888
    }
}
