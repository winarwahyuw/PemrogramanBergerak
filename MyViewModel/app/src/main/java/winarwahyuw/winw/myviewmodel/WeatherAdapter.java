package winarwahyuw.winw.myviewmodel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{
        private ArrayList<WeatherItems> mData = new ArrayList<>();

        public void setData(ArrayList<WeatherItems> items){
        mData.clear();
        mData.addAll(items);
        notifyDataSetChanged();
        }
    
    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item, parent, false);
        return new WeatherViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.WeatherViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNamaKota;
        TextView textViewTemperature;
        TextView textViewDescription;

        public WeatherViewHolder(View mView) {
            super(mView);
            textViewNamaKota=itemView.findViewById(R.id.textKota);
            textViewTemperature=itemView.findViewById(R.id.textTemp);
            textViewDescription=itemView.findViewById(R.id.textDesc);
        }

        public void bind(WeatherItems weatherItems) {
            textViewNamaKota.setText(weatherItems.getName());
            textViewTemperature.setText(weatherItems.getTemperature());
            textViewDescription.setText(weatherItems.getDescription());
        }
    }
}
