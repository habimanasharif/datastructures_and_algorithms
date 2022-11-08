/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Administrator
 */
public class Generator {
    public static int[] randomnumber(){
        int[] numbers =new  int[100];
        for(int i =0;i<100;i++){
            numbers[i]=(int) (Math.random()*50);
        }
        return numbers;
    }
    
}
