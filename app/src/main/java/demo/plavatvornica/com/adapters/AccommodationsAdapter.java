package demo.plavatvornica.com.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.plavatvornica.com.R;
import demo.plavatvornica.com.model.Accommodation;

/**
 * Created by Tooroop on 26-Feb-16.
 */
public class AccommodationsAdapter extends RecyclerView.Adapter<AccommodationsAdapter.ViewHolder> {

    public interface AccomodationAdapterListener{
        void onAccomodationClick(Accommodation accommodation);
    }

    private Context context;
    private ArrayList<Accommodation> accommodations;
    private AccomodationAdapterListener listener;

    public AccommodationsAdapter(Context context, ArrayList<Accommodation> accommodations) {
        this.context = context;
        this.accommodations = accommodations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_accommodation, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Accommodation accommodation = accommodations.get(position);

        Glide.with(context).load(accommodation.getImagesResources()[0]).into(holder.imgAccommodation);
        holder.txtTitle.setText(accommodation.getTitle());
        holder.txtAddress.setText(context.getString(R.string.accommodation_address, accommodation.getAddress(), accommodation.getPostCode()));
        holder.itemView.setTag(accommodation);
    }

    @Override
    public int getItemCount() {
        return accommodations.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.imgAccomodation) ImageView imgAccommodation;
        @Bind(R.id.txtTitle) TextView txtTitle;
        @Bind(R.id.txtAddress) TextView txtAddress;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.accommodationItemContainer) void onAccomodationClick(View view){
            Accommodation accommodation = (Accommodation) view.getTag();
            listener.onAccomodationClick(accommodation);
        }
    }

    public void setListener(AccomodationAdapterListener listener) {
        this.listener = listener;
    }
}
