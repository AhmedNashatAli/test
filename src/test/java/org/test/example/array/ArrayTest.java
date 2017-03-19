/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.example.array;


import org.test.example.array.Array;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Ahmed Nashaat Ali
 */
public class ArrayTest {
    Array arraySum;
    @Before
    public void setup(){
        arraySum=new Array();
    }
    @Test
    public void addOneToArrayTest(){
        Assert.assertArrayEquals(new int[]{1,3},  arraySum.addOneToArray(new int[]{1,2}));
    }
    @Test
    public void addOneToArrayWith9Test(){
        Assert.assertArrayEquals(new int[]{1,0},  arraySum.addOneToArray(new int[]{9}));
        Assert.assertArrayEquals(new int[]{1,0,0,0},  arraySum.addOneToArray(new int[]{9,9,9}));
        Assert.assertArrayEquals(new int[]{2,0},  arraySum.addOneToArray(new int[]{1,9}));
    }
    @Test
    public void addOneToArrayWith99Test(){
        Assert.assertArrayEquals(new int[]{1,0,0},  arraySum.addOneToArray(new int[]{9,9}));
    }
    
}
