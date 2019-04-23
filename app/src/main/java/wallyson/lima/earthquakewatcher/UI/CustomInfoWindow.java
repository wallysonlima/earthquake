package wallyson.lima.earthquakewatcher.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import wallyson.lima.earthquakewatcher.R;

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {
    private View view;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomInfoWindow(Context context) {
        this.context = context;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.custom_info_window);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
