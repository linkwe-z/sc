package com.box;

import org.junit.Test;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lwz on 2018/3/7.
 * desc: 装箱和拆箱测试
 */
public class Boxing {
    public static void main(String[] args) {
        test();

        Set set = new HashSet();
        set.add("one");
        set.add("tow");
    }

    public static void test() {
        int i = 40;
        int i0 = 40;
        Integer i1 = 40;  //装箱
        Integer i2 = 40;  //装箱
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);
        Double d1=1.0;
        Double d2=1.0;

        System.out.println("i=i0\t" + (i == i0));
        System.out.println("i0=i1\t" + (i0 == i1));
        //2、int值只要在-128和127之间的自动装箱对象都从缓存中获取的，所以为true
        System.out.println("i1=i2\t" + (i1 == i2));
        //3、涉及到数字的计算，就必须先拆箱成int再做加法运算，所以不管他们的值是否在-128和127之间，只要数字一样就为true
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));
        //比较的是对象内存地址，所以为false
        System.out.println("i4=i5\t" + (i4 == i5)+">>i4="+i4+">>i5="+i5);
        //5、同第3条解释，拆箱做加法运算，对比的是数字，所以为true
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));
        //double的装箱操作没有使用缓存，每次都是new Double，所以false
        System.out.println("d1=d2\t" + (d1==d2));


        Integer i10 = 200;
        Integer i11 = 200;
        // 200不在-128和127之间，所以自动装器是new出来的，不是从缓存中取的，故不一样
        System.out.println("i10=i11\t" + (i10 == i11));
        System.out.println();
    }

    @Test
    public void countStr(){
        File file = new File("E:\\hello.txt");
        try {
            InputStream in = new FileInputStream(file);
            byte b[] = new byte[1024];
            int a = in.read(b);
            String str[] = new String(b,0 ,a).split("");
            int count = 0;
            for (int i=0; i< str.length; i++){
                if (str[i].equals("o")){
                    count++;
                }
            }
            System.out.println("###count="+count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e2){
            e2.printStackTrace();
        }
    }
}
