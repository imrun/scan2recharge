package nepal.scan2recharge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Belal on 18/09/16.
 */


public class scan extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        view = inflater.inflate(R.layout.scan, container, false);

        Button button = (Button) view.findViewById(R.id.button01);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                {
                    Intent i = new Intent(getActivity(), Scanner2.class);
                    startActivity(i);
                }


            }

            public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
                //you can set the title for your toolbar here for different fragments different titles
                getActivity().setTitle("Scan");
            }


        });
        return view;
    }
}
