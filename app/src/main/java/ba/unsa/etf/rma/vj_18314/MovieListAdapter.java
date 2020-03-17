package ba.unsa.etf.rma.vj_18314;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MovieListAdapter extends ArrayAdapter<Movie> {
    int resource;

    public MovieListAdapter(Context context, int _resource, List<Movie> items) {
        super(context, _resource, items);
        resource = _resource; //resource je id layout-a list item-a
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout newView;
        if(convertView == null) {
            newView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater li;
            li = (LayoutInflater)getContext().getSystemService(inflater);
            li.inflate(resource, newView, true);
        } else {
            newView = (LinearLayout)convertView;
        }
        Movie movieInstance = getItem(position);

        TextView editText2 = (TextView)newView.findViewById(R.id.editText2);
        TextView editText3 = (TextView)newView.findViewById(R.id.editText3);
        ImageView icon = (ImageView)newView.findViewById(R.id.icon);

        editText2.setText(movieInstance.getTitle());
        editText3.setText(movieInstance.getGenre());

        if(movieInstance.getGenre().equals("Action")) icon.setImageResource(R.drawable.action);
        else if(movieInstance.getGenre().equals("Drama")) icon.setImageResource(R.drawable.drama);
        else if(movieInstance.getGenre().equals("Crime")) icon.setImageResource(R.drawable.crime);

        return newView;
    }
}
