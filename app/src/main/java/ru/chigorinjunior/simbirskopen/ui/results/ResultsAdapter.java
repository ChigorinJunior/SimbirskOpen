package ru.chigorinjunior.simbirskopen.ui.results;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Team;

public class ResultsAdapter extends FirebaseRecyclerAdapter<Team, ResultsAdapter.ResultsViewHolder> {
    public ResultsAdapter(Class<Team> modelClass, int modelLayout, Class<ResultsViewHolder> viewHolderClass, Firebase ref) {
        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder(ResultsViewHolder resultsViewHolder, Team result, int i) {
        resultsViewHolder.init(result);
    }

    public static class ResultsViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.team_name)
        TextView mTextView;

        public ResultsViewHolder(final View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void init(Team result) {
            mTextView.setText(result.getName());
        }

        public void setText(String text) {
            mTextView.setText(text);
        }
    }
}