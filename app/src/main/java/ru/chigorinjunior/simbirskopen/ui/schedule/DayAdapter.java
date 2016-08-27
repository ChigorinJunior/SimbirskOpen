package ru.chigorinjunior.simbirskopen.ui.schedule;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Day;
import ru.chigorinjunior.simbirskopen.domain.Item;
import ru.chigorinjunior.simbirskopen.utils.ColorMapper;


public class DayAdapter extends RecyclerView.Adapter<DayAdapter.DayViewHolder> {
    private Day mDay;
    private Context mContext;

    public DayAdapter(Context context, Day day) {
        mContext = context;
        mDay = day;
    }

    @Override
    public DayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DayViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_schedule_item, parent, false));
    }

    @Override
    public void onBindViewHolder(DayViewHolder holder, int position) {
        holder.init(mDay.getItem(position));
    }

    @Override
    public int getItemCount() {
        return mDay == null? 0 : mDay.getItemsCount();
    }

    class DayViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.time_text_view)
        TextView mTimeTextView;

        @BindView(R.id.caption_text_vew)
        TextView mCaptionTextView;

        @BindView(R.id.color_indicator)
        View mColorIndicator;

        public DayViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void init(Item item) {
            mTimeTextView.setText(item.getStartTime() + " - " + item.getEndTime());
            mCaptionTextView.setText(item.getInfo());

            int color = ColorMapper.getColor(item.getItemType());

            mColorIndicator.setBackgroundColor(mContext.getResources().getColor(color));
        }
    }
}
