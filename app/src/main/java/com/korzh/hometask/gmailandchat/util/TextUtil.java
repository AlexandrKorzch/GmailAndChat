package com.korzh.hometask.gmailandchat.util;

import android.support.annotation.NonNull;

/**
 * Created by alex on 6/11/17.
 */

public class TextUtil {

    @NonNull
    public static String getFormattedText(int  count) {
        return "new "+ count;
    }

    static String loreIpsum(){
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Duis maximus maximus felis, quis tincidunt mauris. " +
                "Duis malesuada ultricies ex. Suspendisse potenti. " +
                "Vivamus scelerisque consectetur lacinia. " +
                "Fusce non ligula nulla. Proin lectus purus, tempus nec euismod ac, pretium vel leo. " +
                "Maecenas vel libero eleifend, iaculis urna in, pharetra nisi. " +
                "Nulla fringilla varius arcu nec posuere. " +
                "Pellentesque ac quam eu massa pharetra condimentum sollicitudin id leo. " +
                "Sed posuere quis eros vitae mollis. Proin et dictum felis, et tincidunt diam. " +
                "Orci varius natoque penatibus et magnis dis parturient montes, " +
                "nascetur ridiculus mus. Fusce mi nibh, eleifend eget elit quis, " +
                "blandit egestas tellus. Vestibulum tempus nisi mattis venenatis lobortis.";
    }

}
