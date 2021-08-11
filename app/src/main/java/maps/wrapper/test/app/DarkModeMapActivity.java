package maps.wrapper.test.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import maps.wrapper.ExtendedMap;
import maps.wrapper.MapStyleOptions;
import maps.wrapper.OnMapReadyCallback;
import maps.wrapper.SupportMapFragment;

public class DarkModeMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private SupportMapFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_map_demo);
        fragment = (SupportMapFragment)
            this.getSupportFragmentManager().findFragmentById(R.id.id_framelayout_map);
        assert fragment != null;
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(ExtendedMap map) {
        map.setMapStyle(MapStyleOptions.loadRawResourceStyle(fragment.requireContext(), R.raw.mapstyle_gms, R.raw.mapstyle_hms));
    }
}