package sdaacademy.pl.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CurrencyCalculatorFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator_fragment, container, false);
        final EditText kwotaWpisana = (EditText) view.findViewById(R.id.kwota);
        final TextView przelicznikWaluty = (TextView) view.findViewById(R.id.przelicznik);
        Button oblicz = (Button) view.findViewById(R.id.oblicz_button);
        final TextView wynikKwoty = (TextView) view.findViewById(R.id.wynik);
        oblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stingValue = kwotaWpisana.getText().toString();
                String dolar = przelicznikWaluty.getText().toString();
                try {
                    double przeli = Double.parseDouble(dolar);
                    double value = Double.parseDouble(stingValue);
                    double result = value * przeli;
                    wynikKwoty.setText(Float.toString((float) result));
                } catch (Exception e) {
                    wynikKwoty.setText("Błąd w obliczeniach");
                }
            }
        });
        return view;
    }
}
