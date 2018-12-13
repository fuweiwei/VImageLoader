package com.veer.vimageloader;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

/**
 * 自定义图片缓存工具类
 *
 * @author Veer
 * @email 276412667@qq.com
 * @date 18/12/11
 */
public class VImageUtils {
    private static final String TAG = "VImageUtils";
    public static void disPlay(ImageView ivPic, String url) {
        Bitmap bitmap;
        //内存缓存
        bitmap= MemoryCacheUtils.getInstance().getBitmapFromMemory(url);
        if (bitmap!=null){
            ivPic.setImageBitmap(bitmap);
            Log.d(TAG,"从内存获取图片啦.....");
            return;
        }

        //本地缓存
        bitmap = LocalCacheUtils.getInstance().getBitmapFromLocal(url);
        if(bitmap !=null){
            ivPic.setImageBitmap(bitmap);
            Log.d(TAG,"从本地获取图片啦.....");
            //从本地获取图片后,保存至内存中
            MemoryCacheUtils.getInstance().setBitmapToMemory(url,bitmap);
            return;
        }
        //网络缓存
        NetCacheUtils.getInstance().getBitmapFromNet(ivPic,url);
    }

}
