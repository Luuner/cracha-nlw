package senai.projeto.trabalho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    int num1, num2, num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btadicionar1 = findViewById(R.id.btadd1);
        Button btadicionar2 = findViewById(R.id.btadd2);
        Button btadicionar3 = findViewById(R.id.btadd3);
        ImageButton carrinho = findViewById(R.id.bticarrinho);

        btadicionar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1++;
            }
        });
        btadicionar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2++;
            }
        });
        btadicionar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3++;
            }
        });
        carrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
            carrinho.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent it = new Intent(getApplicationContext(),cARRO.class);
                    it.putExtra("num1", num1);
                    it.putExtra("num2", num2);
                    it.putExtra("num3", num3);
                    startActivity(it);


                        }
                    });
                }










}