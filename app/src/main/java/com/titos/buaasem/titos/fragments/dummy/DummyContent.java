package com.titos.buaasem.titos.fragments.dummy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.titos.buaasem.titos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {


    /**
     * An array of sample (dummy) items.
     */
    public static List<IndexItem> ITEMS = new ArrayList<IndexItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, IndexItem> ITEM_MAP = new HashMap<String, IndexItem>();

    static {
        // Add 3 sample items.
        addItem(new IndexItem("0", "标题1", "蔺泽伟哈哈哈"));
        addItem(new IndexItem("1", "Item 2","jdjdjdjdj"));
        addItem(new IndexItem("2", "Item 3","jjsjsj"));
        addItem(new IndexItem("3", "Item 3","jjsjsj"));
        addItem(new IndexItem("4", "Item 3","jjsjsj"));
        addItem(new IndexItem("5", "Item 3","jjsjsj"));
        addItem(new IndexItem("6", "Item 3","jjsjsj"));
        addItem(new IndexItem("7", "Item 3","jjsjsj"));
        addItem(new IndexItem("8", "Item 3","jjsjsj"));
        addItem(new IndexItem("9", "Item 3","jjsjsj"));
        addItem(new IndexItem("10", "Item 3","jjsjsj"));
        addItem(new IndexItem("11", "Item 3","jjsjsj"));
    }

    private static void addItem(IndexItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class IndexItem {
        public String id;
        public String title;
        public String content;
        public String imageURL;

        public IndexItem(String id, String title,String content) {
            this.id = id;
            this.title=title;
            this.content = content;
            this.imageURL=imageURL;
        }


    }
}
