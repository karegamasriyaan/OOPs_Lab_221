{\rtf1\ansi\ansicpg1252\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class all loops\{\
    public static void main(String[] args) \{\
\
        // for loop\
        System.out.println("For Loop:");\
        for (int i = 1; i <= 5; i++) \{\
            System.out.println(i);\
        \}\
\
        // while loop\
        System.out.println("\\nWhile Loop:");\
        int j = 1;\
        while (j <= 5) \{\
            System.out.println(j);\
            j++;\
        \}\
\
        // do-while loop\
        System.out.println("\\nDo-While Loop:");\
        int k = 1;\
        do \{\
            System.out.println(k);\
            k++;\
        \} while (k <= 5);\
\
        // nested loop\
        System.out.println("\\nNested Loop:");\
        for (int row = 1; row <= 3; row++) \{\
            for (int col = 1; col <= 3; col++) \{\
                System.out.print("* ");\
            \}\
            System.out.println();\
        \}\
    \}\
\}\
}