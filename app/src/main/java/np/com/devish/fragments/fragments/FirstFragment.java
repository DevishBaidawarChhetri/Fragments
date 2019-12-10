package np.com.devish.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import np.com.devish.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{

    private EditText etFitstNumber, etSecondNumber;
    private Button btnCalculate;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        etFitstNumber = view.findViewById(R.id.etFirstNumber);
        etSecondNumber = view.findViewById(R.id.etSecondNumber);
        btnCalculate = view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int firstNum = Integer.parseInt(etFitstNumber.getText().toString());
        int secondNum = Integer.parseInt(etSecondNumber.getText().toString());
        int result = firstNum + secondNum;

        Toast.makeText(getActivity(), "Sum is: " + result, Toast.LENGTH_SHORT).show();
    }
}
