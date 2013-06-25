package com.example.Adapter_ListView;


 import android.content.Context;
 import android.util.Log;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.*;

 import java.util.ArrayList;

 /**
 * Created with IntelliJ IDEA.
 * User: Shahab
 * Date: 8/22/12
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class CustomAdapter extends BaseAdapter {

    private static final String TAG = CustomAdapter.class.getSimpleName();
    ArrayList<Calls> listArray;

    public CustomAdapter() {
        listArray = CallsData.fillDataCalls();

    }

    @Override
    public int getCount() {
        return listArray.size();    // total number of elements in the list
    }

    @Override
    public Object getItem(int i) {
        return listArray.get(i);    // single item in the list
    }

    @Override
    public long getItemId(int i) {
        return i;                   // index number
    }

    @Override
    public View getView(int index, View view, final ViewGroup parent) {

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            view = inflater.inflate(R.layout.single_list_item, parent, false);
        }

        final Calls dataModel = listArray.get(index);
        /*
        TextView textView = (TextView) view.findViewById(R.id.tv_string_data);
        textView.setText(dataModel.getNombreContacto());

        Button button = (Button) view.findViewById(R.id.btn_number_data);
        button.setText("" + dataModel.getHoraLlamada());

        textView = (TextView) view.findViewById(R.id.tv_double_data);
        */
        TextView nombreContacto = (TextView) view.findViewById(R.id.contactName_calls);
        TextView horaLlamada = (TextView) view.findViewById(R.id.callHour_calls);
        ImageView icon = (ImageView) view.findViewById(R.id.callIcon_recent);

        nombreContacto.setText(dataModel.getNombreContacto());
        horaLlamada.setText(dataModel.getHoraLlamada());
        icon.setImageResource(dataModel.getIcon());

        // button click listener
        // this chunk of code will run, if user click the button
        // because, we set the click listener on the button only



        // if you commented out the above chunk of code and
        // activate this chunk of code
        // then if user click on any view inside the list view (except button)
        // this chunk of code will execute
        // because we set the click listener on the whole view




        return view;
    }
}