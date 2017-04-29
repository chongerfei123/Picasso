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


/**
 * 对listView等滑动的优化
 *  picasso.resumeTag(MainActivity.this);
 *   picasso.pauseTag(MainActivity.this);
 */
// public void onScrollStateChanged(AbsListView view, int scrollState) {
//      final Picasso picasso = Picasso.with(MainActivity.this);
//            if (scrollState == SCROLL_STATE_IDLE || scrollState == SCROLL_STATE_TOUCH_SCROLL) {
//                    //重置
//                    picasso.resumeTag(MainActivity.this);
//                    } else {
//                    //暂停
//                    picasso.pauseTag(MainActivity.this);
//                    }
//                    }


/**
 *       备用图片，未加载完网络图片时显示的图片
 .placeholder(R.drawable.ic_launcher)
 如果加载发生错误，会重复三次请求，都失败会显示的error图片
 .error(R.drawable.error)
 */
//Picasso.with(Main2Activity.this)
//        //这里就是load网络图片的url地址
//        .load("http://litchiapi.jstv.com"+listItem.get(position).getCover())
//        //设置不使用内存缓存中查找也不存储内存缓存
//        .memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE)
//        //设置图片的裁剪大小
//        .resize(DensityUtil.dip2px(Main2Activity.this,120),DensityUtil.dip2px(Main2Activity.this,120)).centerCrop()
//        //备用图片，未加载完网络图片时显示的图片
//        .placeholder(R.drawable.ic_launcher)
//        //如果加载发生错误，会重复三次请求，都失败会显示的error图片
//        .error(R.drawable.error)
//        //添加到ImageView中了
//        .into(viewHolder.cover);


/**
 * 缓存到硬盘
 */
//final String imageCacheDir = getExternalCacheDir().getPath()+ "/image/";
//    Picasso picasso = new Picasso.Builder(this).downloader(
//            new OkHttpDownloader(new File(imageCacheDir))).build();
///**  setIndicatorsEnabled(true);
// * 左上角会显示个三角形，不同的颜色代表加载的来源
// * 红色：代表从网络下载的图片
// * 黄色：代表从磁盘缓存加载的图片
// * 绿色：代表从内存中加载的图片
// */
//picasso.setIndicatorsEnabled(true);
//        Picasso.setSingletonInstance(picasso);
//        }


/**
 * 默认是有缓存的
 * picasso有双缓存机制，就是 内存缓存 和 网络缓存 ，导致就算你给他传新的url，它也不会去重新访问新的地址上的图片。
 * .memoryPolicy(MemoryPolicy.NO_CACHE)
 * .networkPolicy(NetworkPolicy.NO_CACHE)
 *
 *
 * 设置不使用内存缓存中查找 也不存储内存缓存
 .memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE)
 */
//
//Picasso.with(context).load(url)
//                             .memoryPolicy(MemoryPolicy.NO_CACHE)
//                             .networkPolicy(NetworkPolicy.NO_CACHE)
//                             .error(R.drawable.default_icon)
//                             .into(imageView);