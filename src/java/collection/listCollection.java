package collection;

import org.apache.poi.util.SystemOutLogger;

import java.util.*;

public class listCollection {
    public static void main(String[] args) {
        /**
         * ArrayList list1 = new ArrayList();
         ArrayList list2 = new ArrayList();
         list1.add("a");
         list1.add("b");
         //将list1集合全部写入list2集合中
         list2.addAll(list1);
         list2.add("c");
         //遍历集合
         Iterator ite = list2.iterator();
         //检查序列中是否还有元素
         while (ite.hasNext()) {
         //获取序列中的下一个元素
         System.out.println(ite.next());
         }*/
        Product de1 = new Product(1, "木糖醇", 5);
        Product de2 = new Product(2, "洗发水", 15);
        Product de3 = new Product(3, "热水壶", 45);
        ArrayList list = new ArrayList();
        list.add(de1);
        list.add(de2);
        list.add(de3);
        for (int i = 0; i < list.size(); i++) {
            Product product = (Product) list.get(i);
            System.out.println(product);
            //返回第一个“|”出现的索引
            System.out.println(list.indexOf("|"));
            //返回最后一个“|”出现的索引
            System.out.println(list.lastIndexOf("|"));
        }
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        list.add("y");
        //截取list集合中部分元素
        //实际截取0-3的元素，不包含第4位的元素
        list.subList(0,4);
        list.clear();//清空集合
        System.out.println(list);
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("q");
        linkedList.add("w");
        linkedList.add("e");
        linkedList.add("r");
        linkedList.add("t");
        linkedList.add("y");
        //将元素添加到集合开头
        linkedList.addFirst("jk");
        //将元素添加到集合结尾
        linkedList.addLast("cj");
        //返回集合第一位元素
        linkedList.getFirst();
        //返回集合最后一位元素
        linkedList.getLast();
        //删除集合第一位元素
        linkedList.removeFirst();
        //删除集合最后一位元素
        linkedList.removeLast();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        //使用 HashSet 创建一个 Set 集合，并向该集合中添加 4 套教程
        //Set()集合不存在重复的元素
        HashSet<String> hashSet=new HashSet<String>();
        String cours1="Java入门教程";
        String cours2="Python基础教程";
        String cours3="C语言学习教程";
        String cours4="Golang入门教程";
        hashSet.add(cours1);
        hashSet.add(cours2);
        hashSet.add(cours3);
        hashSet.add(cours4);
        /*for (String cours:hashSet){
            System.out.println("《" +cours + "》");
        }*/
        Iterator it= hashSet.iterator();
        while (it.hasNext()){
            System.out.println("《"+it.next()+"》");
        }
    }
}
