/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author dlaskey1
 */
public class MyHeight {
    public static void main(String[] args) {
        int cm = 121;
        double tmp = cm/2.54;
        int con = (int) tmp;
        int ft = con/12;
        int in = con%12;
        System.out.println(cm + " centimetres is " + ft + " feet and " + in + " inches.");
    }
}
