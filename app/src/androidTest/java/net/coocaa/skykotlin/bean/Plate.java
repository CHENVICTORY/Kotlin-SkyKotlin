package net.coocaa.skykotlin.bean;

/**
 * @author chenguo QQ:1349100246
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.bean
 * @time 2021/2/22 19:59
 * @chang time
 * @describe describe
 */
public class Plate<T> {


    public Plate(T item){
        mItem = item;
    }
    private T mItem;

    public T getmItem() {
        return mItem;
    }

    public void setItem(T newItem) {
        mItem = newItem;
    }
}
