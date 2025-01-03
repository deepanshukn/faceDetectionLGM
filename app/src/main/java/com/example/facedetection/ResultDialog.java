package com.example.facedetection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {

    private Button okbutton;
    private TextView resultTv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement,container,false);
        String resultText = "";
        okbutton=view.findViewById(R.id.result_ok_button);
        resultTv = view.findViewById(R.id.result);

        Bundle bundle = getArguments();
        resultText=bundle.getString(FaceDetection.RESULT_TEXT);

        resultTv.setText(resultText);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dismiss();
            }
        });
        return view;
    }
}