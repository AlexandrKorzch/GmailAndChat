package com.korzh.hometask.gmailandchat.adapter;

import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.korzh.hometask.gmailandchat.R;
import com.korzh.hometask.gmailandchat.models.ContactModel;
import com.korzh.hometask.gmailandchat.models.FolderModel;
import com.korzh.hometask.gmailandchat.models.Group;
import com.korzh.hometask.gmailandchat.models.Model;

import java.util.List;

import static com.korzh.hometask.gmailandchat.general.Const.CONTACT_TYPE;
import static com.korzh.hometask.gmailandchat.general.Const.FOLDER_TYPE;
import static com.korzh.hometask.gmailandchat.util.TextUtil.getFormattedText;

/**
 * Created by alex on 6/10/17.
 */

public class GmailAdapter extends RecyclerView.Adapter<GmailAdapter.ModelHolder> {

    private List<Model> mModelList;

    public GmailAdapter(List<Model> gmailModelList) {
        mModelList = gmailModelList;
    }

    @Override
    public ModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(viewType == FOLDER_TYPE ? R.layout.folder_item : R.layout.contact_item, parent, false);
        return viewType == FOLDER_TYPE ? new FolderHolder(view) : new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(ModelHolder holder, int position) {

        Model model = mModelList.get(position);
        int type = model.getType();

        holder.mTitleTv.setText(model.getTitle());
        holder.mThemeTv.setText(model.getTheme());
        holder.mIconIv.setImageResource(model.getIconId());

        if (type == FOLDER_TYPE) {
            FolderModel folderModel = (FolderModel) model;
            FolderHolder folderHolder = (FolderHolder) holder;
            folderHolder.mMailCountTv.setText(getFormattedText(folderModel.getNewMailsCount()));
            folderHolder.mMailCountTv.setBackgroundResource(folderModel.getIndicatorColorId());

        } else if (type == CONTACT_TYPE) {
            ContactHolder contactHolder = (ContactHolder) holder;
            ContactModel contactModel = (ContactModel) model;
            contactHolder.mTextTv.setText(contactModel.getText());
            contactHolder.mTimeTv.setText(contactModel.getTime());

            Group group = contactModel.getGroup();
            if (group != null) {
                contactHolder.mGroupTv.setText(group.getGroupName());
                contactHolder.mGroupTv.setBackgroundResource(group.getColorId());
            }

            if(contactModel.isScreb()){
                contactHolder.mScrebIv.setVisibility(View.VISIBLE);
                contactHolder.mTimeTv.setTextColor(
                        ContextCompat.getColor(contactHolder.mTimeTv.getContext(), R.color.blue));
            }else{
                contactHolder.mScrebIv.setVisibility(View.INVISIBLE);
                contactHolder.mTimeTv.setTextColor(
                        ContextCompat.getColor(contactHolder.mTimeTv.getContext(), R.color.gray));
            }

            contactHolder.mStarIv.setImageResource(contactModel.isMark()
                    ? R.drawable.star_mark
                    : R.drawable.star_emp);

            if(contactModel.isRead()){
                holder.mTitleTv.setTypeface(Typeface.DEFAULT);
                holder.mThemeTv.setTypeface(Typeface.DEFAULT);
            }
        }
    }


    @Override
    public int getItemViewType(int position) {
        return mModelList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return mModelList.size();
    }


    static class ModelHolder extends RecyclerView.ViewHolder {

        ImageView mIconIv;
        TextView mTitleTv;
        TextView mThemeTv;

        ModelHolder(View itemView) {
            super(itemView);
            mIconIv = (ImageView) itemView.findViewById(R.id.iv_icon);
            mTitleTv = (TextView) itemView.findViewById(R.id.tv_title);
            mThemeTv = (TextView) itemView.findViewById(R.id.tv_theme);
        }
    }

    private static class FolderHolder extends ModelHolder {

        TextView mMailCountTv;

        FolderHolder(View itemView) {
            super(itemView);
            mMailCountTv = (TextView) itemView.findViewById(R.id.tv_count);
        }
    }

    private static class ContactHolder extends ModelHolder {

        TextView mTimeTv;
        TextView mGroupTv;
        ImageView mScrebIv;
        ImageView mStarIv;
        TextView mTextTv;

        ContactHolder(View itemView) {
            super(itemView);
            mTextTv = (TextView) itemView.findViewById(R.id.tv_text);
            mTimeTv = (TextView) itemView.findViewById(R.id.tv_time);
            mGroupTv = (TextView) itemView.findViewById(R.id.tv_group);
            mScrebIv = (ImageView) itemView.findViewById(R.id.iv_screb);
            mStarIv = (ImageView) itemView.findViewById(R.id.iv_star);

        }
    }
}
