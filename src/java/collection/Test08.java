package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test08 {
    //本次有 5 名学生参加考试，当老师录入每名学生的成绩后，程序将按照从低到高的排列顺序显示学生成绩。此外，
    // 老师可以查询本次考试是否有满分的学生存在，不及格的成绩有哪些，90 分以上成绩的学生有几名
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        TreeSet<Double> list=new TreeSet<Double>();
        for (int i=0;i<5;i++){
            System.out.print("输入成绩：");
            double score=input.nextDouble();
            list.add(score);
        }
        Iterator<Double> it=list.iterator();
        System.out.println("学生成绩为：");
        while (it.hasNext()){
            System.out.println(it.next()+"\t");
        }
        System.out.println("需要查询的成绩：");
        double score1=input.nextDouble();
        SortedSet<Double> list1=list.headSet(score1);
        SortedSet<Double> list2=list.tailSet(score1);
        Iterator<Double> it1=list1.iterator();
        System.out.println(list1);
        int k=1;
        if (score1<60.0){
            System.out.println("成绩不及格的有：");
            for (int a=0;a<list1.size();a++){
                System.out.println(list1.toArray()[a]);
            }
        }else if(score1>90.0){
            for (int b=0;b<list2.size();b++) {
                k+=b;
                System.out.println(list2.toArray()[b]);
            }
            System.out.println("总共有"+k+"名学生成绩在90分以上！");
        }
    }
}
