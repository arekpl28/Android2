package sdaacademy.pl.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MasterFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final MainActivity activity = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.fragment_master, container, false);
        Button currencyCalculatorButton = (Button) view.findViewById(R.id.currency_cal_button);
        Button investmentButton = (Button) view.findViewById(R.id.investment_fragment_button);

        currencyCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showCurrencyCalculator();
            }
        });
        investmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showInvestmentButton();
            }
        });
        return view;
    }
}
