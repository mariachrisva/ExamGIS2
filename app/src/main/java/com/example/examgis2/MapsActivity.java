package com.example.examgis2;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng untad = new LatLng(-0.83636, 119.89111);
        LatLng rumahku = new LatLng(-0.939995, 119.896146);
        LatLng gerejakatolik1 = new LatLng(-0.92921, 119.88618);
        LatLng gerejakatolik2 = new LatLng(-0.89839, 119.86803);
        LatLng sushi1 = new LatLng(-0.92597, 119.88816);
        LatLng sushi2 = new LatLng(-0.89236, 119.86882);

        int tinggi = 80;
        int lebar = 40;
        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(R.drawable.marker1);

        Bitmap s = bitmapStart.getBitmap();

        Bitmap markerStart = Bitmap.createScaledBitmap(s, lebar, tinggi, false);

        mMap.addMarker(new MarkerOptions().position(untad).title("Marker in Universitas Tadulako")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));

        mMap.addMarker(new MarkerOptions().position(rumahku).title("Marker in Maria Chrisva's House")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(untad, 13.5f));

        mMap.addMarker(new MarkerOptions().position(gerejakatolik1).title("Marker in Gereja Katolik Sta. Maria BHK Palu")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));

        mMap.addMarker(new MarkerOptions().position(gerejakatolik2).title("Marker in Gereja Katolik St. Paulus Palu")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));

        mMap.addMarker(new MarkerOptions().position(sushi1).title("Marker in Kedai OISHI Nadisha Palu")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));

        mMap.addMarker(new MarkerOptions().position(sushi2).title("Marker in SushiBoox Palu")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));

        mMap.addPolyline(new PolylineOptions().add(
                rumahku,
                new LatLng(-0.93999, 119.89634),
                new LatLng(-0.93996, 119.89653),
                new LatLng(-0.93990, 119.89661),
                new LatLng(-0.93939, 119.89667),
                new LatLng(-0.93263, 119.88474),
                new LatLng(-0.93061, 119.88508),
                new LatLng(-0.93041, 119.88509),
                new LatLng(-0.93018, 119.88504),
                new LatLng(-0.92911, 119.88455),
                new LatLng(-0.92903, 119.88483),
                new LatLng(-0.92900, 119.88512),
                new LatLng(-0.92895, 119.88530),
                new LatLng(-0.92889, 119.88606),
                gerejakatolik1
                ).width(10)
                        .color(Color.BLUE)
        );

    }
}