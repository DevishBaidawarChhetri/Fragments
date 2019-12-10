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
public class SecondFragment extends Fragment implements View.OnClickListener{

    private EditText etRadius;
    private Button btnRadiusCalculate;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnRadiusCalculate = view.findViewById(R.id.btnRadiusCalculate);
        btnRadiusCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etRadius.getText().toString());
        float result = (22 * radius * radius)/7;

        Toast.makeText(getActivity(), "Radius is : " + result, Toast.LENGTH_SHORT).show();
    }
}
