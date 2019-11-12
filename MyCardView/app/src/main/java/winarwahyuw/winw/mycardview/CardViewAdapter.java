package winarwahyuw.winw.mycardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder> {
    private ArrayList<DataSet> listData;
    private Context context;

    public CardViewAdapter(Context context, ArrayList<DataSet> listData){
        this.context=context;
        this.listData=listData;
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder  {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardView cv;

        CardViewViewHolder(View itemView){
            super(itemView);
            imgPhoto=itemView.findViewById(R.id.img_item_photo);
            tvName=itemView.findViewById(R.id.tv_item_name);
            tvDetail=itemView.findViewById(R.id.tv_item_detail);
            cv=itemView.findViewById(R.id.cardview);
        }

    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewViewHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int i) {
        final DataSet data=listData.get(i);
        Glide.with(holder.itemView.getContext())
                .load(data.getPhoto())
                .apply(new RequestOptions().override(300, 300))
                .into(holder.imgPhoto);
        holder.tvName.setText(data.getName());
        holder.tvDetail.setText(data.getDetail());

        holder.cv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardDetail=new Intent(context, CardDetail.class);
                cardDetail.putExtra("card_id2",data.getName());
                cardDetail.putExtra("card_id",data.getId());
                context.startActivity(cardDetail);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

}
