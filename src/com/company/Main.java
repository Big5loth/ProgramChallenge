package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	int timesAsked = 0;
    Scanner input = new Scanner(System.in);
    int[] nums = new ArrayList<int>();
    while (timesAsked < 5) {
        int numToAdd = input.nextInt();
        nums.add(numToAdd);
        timesAsked = timesAsked + 1;
    }

    }
        }
    }

