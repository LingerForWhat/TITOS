package com.titos.buaasem.titos.Adapter;

import android.content.Context;
import android.database.DatabaseUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.titos.buaasem.titos.R;
import com.titos.buaasem.titos.fragments.dummy.DummyContent;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/4/6 0006.
 */


public class IndexListAdapter extends BaseAdapter {

    private Context context;
    private List<DummyContent.IndexItem> listItem;
    private LayoutInflater listContainer;

    public final class ListItemView{
        public TextView title;
        public TextView content;
        public ImageView image;
    }


    public IndexListAdapter(Context context,List< DummyContent.IndexItem> listItem) {
        this.context=context;
        this.listItem=listItem;
        listContainer= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {


        Log.e("listItem.seze"," "+listItem.size());
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListItemView listItemView = null;
        if(convertView==null) {
            listItemView = new ListItemView();
            convertView = listContainer.inflate(R.layout.layout_index, null);

            listItemView.title = (TextView) convertView.findViewById(R.id.index_title);
            listItemView.content = (TextView) convertView.findViewById(R.id.index_content);
            listItemView.image = (ImageView) convertView.findViewById(R.id.index_titleimage);

            //设置控件集合到convertView
            convertView.setTag(listItemView);
        }else{
            listItemView = (ListItemView)convertView.getTag();

            }
//
        listItemView.title.setText(listItem.get(position).title);
        listItemView.content.setText(listItem.get(position).content);
        listItemView.image.setBackgroundResource(R.drawable.haha);


        return convertView;
    }
}
