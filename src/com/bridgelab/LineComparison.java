package com.bridgelab;

public class LineComparison {

	public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program ");
        int x1 = 5;
        int x2 = 7;
        int y1 = 8;
        int y2 = 89;
        int p1 = 14;
        int p2 = 15;
        int q1 = 4;
        int q2 = 85;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

        System.out.println("line 1st length : " +lengthOfLine1);
        System.out.println("line 2nd length : " +lengthOfLine2);

        if(lengthOfLine1>lengthOfLine2) {
            System.out.println("Length of Line1 is greater than Length of Line2");
        }else if(lengthOfLine1<lengthOfLine2) {
            System.out.println("Length of Line1 is lesser than Length of Line2");
        }else {
            System.out.println("Both lines are Equal");
        }
    }
	}


