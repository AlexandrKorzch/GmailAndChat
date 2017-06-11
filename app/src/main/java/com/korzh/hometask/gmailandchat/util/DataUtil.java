package com.korzh.hometask.gmailandchat.util;

import com.korzh.hometask.gmailandchat.R;
import com.korzh.hometask.gmailandchat.models.ContactModel;
import com.korzh.hometask.gmailandchat.models.FolderModel;
import com.korzh.hometask.gmailandchat.models.Group;
import com.korzh.hometask.gmailandchat.models.Model;

import java.util.ArrayList;
import java.util.List;

import static com.korzh.hometask.gmailandchat.util.TextUtil.loreIpsum;

/**
 * Created by alex on 6/10/17.
 */

public class DataUtil {

    public static List<Model> getItems() {
        List<Model> models = new ArrayList<>();

        models.add(createFolderModel("Social", "Google+", R.drawable.social, 1, R.color.social));
        models.add(createFolderModel("Promotions", "Zagat, Google Offers", R.drawable.promotions, 2, R.color.promotions));
        models.add(createFolderModel("Updates", "Google Play", R.drawable.updates, 1, R.color.updates));

        models.add(createContactModel("Andy Brown", "Bring Your Parants To Work Day", loreIpsum(),
                true, R.drawable.andy, new Group("Work", R.color.work), false, false, "11.45 PM"));

        models.add(createContactModel("Kery Anderson", "Picture from last Saturday", loreIpsum(),
                false, R.drawable.kary, null, false, true, "1.39 PM"));

        models.add(createContactModel("Regis, Raichal, Peter 3", "Board game night?", loreIpsum(),
                true, R.drawable.regis, new Group("Fun", R.color.fun), true, false, "Sep 29"));

        models.add(createContactModel("Aruna Knight", "Book you recomended", loreIpsum(),
                false, R.drawable.aruna, new Group("Family", R.color.family), true, true, "Aug 17"));


        models.add(createContactModel("Andy Brown", "Bring Your Parants To Work Day", loreIpsum(),
                true, R.drawable.andy, new Group("Work", R.color.work), false, false, "11.45 PM"));

        models.add(createContactModel("Kery Anderson", "Picture from last Saturday", loreIpsum(),
                false, R.drawable.kary, null, false, true, "1.39 PM"));

        models.add(createContactModel("Regis, Raichal, Peter 3", "Board game night?", loreIpsum(),
                true, R.drawable.regis, new Group("Fun", R.color.fun), true, false, "Sep 29"));

        models.add(createContactModel("Aruna Knight", "Book you recomended", loreIpsum(),
                false, R.drawable.aruna, new Group("Family", R.color.family), true, true, "Aug 17"));


        models.add(createContactModel("Andy Brown", "Bring Your Parants To Work Day", loreIpsum(),
                true, R.drawable.andy, new Group("Work", R.color.work), false, false, "11.45 PM"));

        models.add(createContactModel("Kery Anderson", "Picture from last Saturday", loreIpsum(),
                false, R.drawable.kary, null, false, true, "1.39 PM"));

        models.add(createContactModel("Regis, Raichal, Peter 3", "Board game night?", loreIpsum(),
                true, R.drawable.regis, new Group("Fun", R.color.fun), true, false, "Sep 29"));

        models.add(createContactModel("Aruna Knight", "Book you recomended", loreIpsum(),
                false, R.drawable.aruna, new Group("Family", R.color.family), true, true, "Aug 17"));

        return models;
    }

    private static Model createFolderModel(String title, String theme, int iconId,
                                           int mailCount, int indicarotColorId) {
        FolderModel model = new FolderModel();
        model.setTitle(title);
        model.setTheme(theme);
        model.setIconId(iconId);
        model.setNewMailsCount(mailCount);
        model.setIndicatorColorId(indicarotColorId);
        return model;
    }

    private static Model createContactModel(String title, String theme, String text, boolean read,
                                            int iconId, Group group, boolean mark, boolean screb, String time) {
        ContactModel model = new ContactModel();
        model.setTitle(title);
        model.setTheme(theme);
        model.setText(text);
        model.setRead(read);
        model.setIconId(iconId);
        model.setGroup(group);
        model.setMark(mark);
        model.setScreb(screb);
        model.setTime(time);
        return model;
    }
}
