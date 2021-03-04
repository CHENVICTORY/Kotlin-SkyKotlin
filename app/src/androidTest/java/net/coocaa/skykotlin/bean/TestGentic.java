package net.coocaa.skykotlin.bean;



/**
 * @author chenguo QQ:1349100246
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.bean
 * @time 2021/2/22 20:01
 * @chang time
 * @describe describe
 */
public class TestGentic {


    public void testGentic() {

        Plate<? extends Fruit> plate = new Plate(new Apple());

    }

}
