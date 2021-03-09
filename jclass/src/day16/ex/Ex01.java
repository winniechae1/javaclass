package day16.ex;
/*
 	인터페이스 Dohyung 을 구현한 클래스 
 	Semo, Nemo, Won 을 만들고 배열에 랜덤하게 10개를 만들어서 채우고 
 	각 도형의 정보를 출력하세요.
 */

import static java.lang.Math.random;

public class Ex01 {

public Ex01() {

  Dohyung d = null;
  double [] arr = new double[10];
  

  for(int i = 0 ; i < arr.length ; i++) {
     
     int no = (int)(Math.random()*3);
     
     if(no == 0) {
        d = new Semo((int)(random() * 10)+ 1,(int)(random() * 10)+ 1);
        arr[i] = d.getArea();
        System.out.println(arr[i] +" ");
        d.toPrint();
     }else if (no == 1){
        d = new Nemo((int)(random() * 10)+ 1,(int)(random() * 10)+ 1);
        arr[i] = d.getArea();
        System.out.println(arr[i] +" ");
        d.toPrint();
     }else if (no == 2){
        d = new Won((int)(random() * 10) + 1);
        arr[i] = d.getArea();
        System.out.println(arr[i] +" ");
        d.toPrint();
     }
  }

}

public static void main(String[] args) {
  new Ex01();
}

}