package sdaacademy.pl.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class InvestmentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.investment_fragment, container, false);
        final EditText srodkiNaKoncie = (EditText)view.findViewById(R.id.srodkiNaKoncie);
        final EditText lataNaKoncie = (EditText)view.findViewById(R.id.lata);
        final TextView wynikDzialania = (TextView) view.findViewById(R.id.wynikInvestment);
        final TextView procent = (TextView) view.findViewById(R.id.procentyLokaty);

        Button buttonInvestment = (Button) view.findViewById(R.id.investButtonOblicz);

        buttonInvestment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double proc = Double.parseDouble(procent.getText().toString());
                double procent1 =proc/100;

                try{
                    double srodNa = Double.parseDouble(srodkiNaKoncie.getText().toString());
                    int lat = Integer.parseInt(lataNaKoncie.getText().toString());
                    double result = srodNa*Math.pow(procent1+1,lat);
                    wynikDzialania.setText(Float.toString((float) result));
                }catch (Exception e){
                    wynikDzialania.setText("Błąd w obliczeniach");
                }
            }
        });

        return view;
    }


}
