package app.elbauldelprogramador.adapters2;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VersionesUbuntuAdapter extends BaseAdapter{

   private ArrayList<VersionesUbuntu> listadoVersiones;
   private LayoutInflater lInflater;
   
   public VersionesUbuntuAdapter(Context context, ArrayList<VersionesUbuntu> versiones) {
      this.lInflater = LayoutInflater.from(context);
      this.listadoVersiones = versiones;
   }
   
   @Override
   public int getCount() { return listadoVersiones.size(); }

   @Override
   public Object getItem(int arg0) { return listadoVersiones.get(arg0); }

   @Override
   public long getItemId(int arg0) { return arg0; }

   @Override
   public View getView(int arg0, View arg1, ViewGroup arg2) {
      ContenedorView contenedor = null;
      
      if (arg1 == null){
         arg1 = lInflater.inflate(R.layout.lista_versiones_ubuntu, null);
         
         contenedor = new ContenedorView();
         contenedor.nombreVersion = (TextView) arg1.findViewById(R.id.nomVersion);
         contenedor.numeroVersion = (TextView) arg1.findViewById(R.id.numVersion);
         contenedor.logoVersion = (ImageView) arg1.findViewById(R.id.logo);
         
         arg1.setTag(contenedor);
      } else
         contenedor = (ContenedorView) arg1.getTag();
      
      VersionesUbuntu versiones = (VersionesUbuntu) getItem(arg0);
      contenedor.nombreVersion.setText(versiones.getNombre());
      contenedor.numeroVersion.setText(versiones.getVersion());
      contenedor.logoVersion.setImageResource(versiones.getLogotipo());
      
      return arg1;
   }
   
   class ContenedorView{
      TextView nombreVersion;
      TextView numeroVersion;
      ImageView logoVersion;
   }
}
