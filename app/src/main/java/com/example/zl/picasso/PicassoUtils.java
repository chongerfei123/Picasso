package com.example.zl.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

/**
 * Created by zl on 2017/4/26.
 */

public class PicassoUtils {
    //下载以后重新裁剪
    //int width, int height 裁剪之后的大小
    public static void loadImageWithSize(Context context, String path, int width, int height, ImageView imageView){
        Picasso.with(context).load(path).resize(width,height).centerCrop().into(imageView);
    }

    //网速慢的时候用占位符替代
    //fit():使图片自己适应大小
    public static void  loadImageWithHolder(Context context,String path,int resID,ImageView imageView){
        Log.d("sout","picasso开始了");
        Picasso.with(context).load(path).fit().placeholder(resID).into(imageView);
        Log.d("sout","picasso结束了");
    }

    /**
     * 实现对图片的自定义裁剪
     */
    public static void  loadImageWithCrop(Context context,String path,ImageView imageView){
       Picasso.with(context).load(path).transform(new CropSquareTransformation());
    }

    /**
     * 实现对图片的自定义裁剪
     */
    public static class CropSquareTransformation implements Transformation{

        @Override
        public Bitmap transform(Bitmap source) {
            int size = Math.min(source.getWidth(), source.getHeight());
            int x = (source.getWidth() - size) / 2;
            int y = (source.getHeight() - size) / 2;
            Bitmap bitmap = Bitmap.createBitmap(source, x, y, size, size);
            if (bitmap != null){
                source.recycle();
            }
            return bitmap;
        }

        @Override
        public String key() {
            return "square()";
        }
    }
}


//into()必须在主线程中调用，不然报错

