package app.elbauldelprogramador.adapters2;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;

public class Adaptadores2Activity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ArrayList<VersionesUbuntu> versiones =
           new ArrayList<VersionesUbuntu>();
        
        versiones.add(
              new VersionesUbuntu("Lucid Lynx", "10.4 LTS", R.drawable.lucid));
        
        versiones.add(
              new VersionesUbuntu("Maverick Meerkat", "10.10", R.drawable.u1010));
        
        versiones.add(
              new VersionesUbuntu("Natty Narwhal", "11.04", R.drawable.natty));
        
        versiones.add(
              new VersionesUbuntu("Oneiric Ocelot", "11.10", R.drawable.ocelot));
        
        VersionesUbuntuAdapter adaptador = new VersionesUbuntuAdapter(
              Adaptadores2Activity.this, versiones);
        setListAdapter(adaptador);
    }
}