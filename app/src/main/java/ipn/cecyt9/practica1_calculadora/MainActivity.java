package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1,numero2,resultado;

    String operador;

    public void onClicknumero1(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClicknumero2(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClicknumero3(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClicknumero4(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }
    public void onClicknumero5(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }
    public void onClicknumero6(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }
    public void onClicknumero7(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }
    public void onClicknumero8(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }
    public void onClicknumero9(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }
    public void onClicknumero0(View miView){
        TextView tv = findViewById(R.id.textView2);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public  void onClickOperatcionCapturaNumero1(View miView)
    {
    TextView tv = (TextView) findViewById(R.id.textView2);
    numero1 = Double.parseDouble(tv.getText().toString());
    tv.setText("");
    }

    public void onClickSuma(View miView){
        operador="+";
        onClickOperatcionCapturaNumero1(miView);
    }

    public void onClickResta(View miView){
        operador="-";
        onClickOperatcionCapturaNumero1(miView);
    }

    public void onClickMultiplicacion(View miView){
        operador="*";
        onClickOperatcionCapturaNumero1(miView);
    }

    public void onClickDivision(View miView){
        operador="/";
        onClickOperatcionCapturaNumero1(miView);
    }
    public void onClickCuadrado(View miView){
        operador="^";
        onClickOperatcionCapturaNumero1(miView);
    }


    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.textView2);
        numero2 = Double.parseDouble(tv.getText().toString());

        try{
            if (operador.equals("+")){
                resultado = numero1 +numero2;
            }
            else if (operador.equals("-")){
                resultado = numero1 -numero2;
            }
            else if (operador.equals("*")){
                resultado = numero1 *numero2;
            }
            else if (operador.equals("/")){
                resultado = numero1 /numero2;
            }
            else if (operador.equals("^")){
                resultado = Math.pow(numero1,numero2);
            }

            tv.setText(resultado.toString());

        } catch (NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto",Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText("");
    }



}
