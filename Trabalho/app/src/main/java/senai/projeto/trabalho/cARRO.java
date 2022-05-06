package senai.projeto.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class cARRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);


            //Recuperar os valores passados
            int num1 = getIntent().getIntExtra("num1", 0);
            int num2 = getIntent().getIntExtra("num2", 0);
            int num3 = getIntent().getIntExtra("num3", 0);

            if (num1 > 0){
                ImageView img = findViewById(R.id.chocolate);
                img.isEnabled();
            }


    }
}