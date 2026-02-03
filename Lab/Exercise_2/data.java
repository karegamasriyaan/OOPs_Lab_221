{\rtf1\ansi\ansicpg1252\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class data\{\
    public static void main(String[] args) \{\
\
        // data types\
        int a = 10;\
        int b = 3;\
        float x = 5.5f;\
        double y = 2.2;\
        char ch = 'A';\
        boolean result;\
\
        // arithmetic operations\
        System.out.println("Addition: " + (a + b));\
        System.out.println("Subtraction: " + (a - b));\
        System.out.println("Multiplication: " + (a * b));\
        System.out.println("Division: " + (a / b));\
        System.out.println("Modulus: " + (a % b));\
\
        // relational operations\
        System.out.println("a > b: " + (a > b));\
        System.out.println("a == b: " + (a == b));\
\
        // logical operations\
        result = (a > b) && (x > y);\
        System.out.println("Logical AND result: " + result);\
\
        System.out.println("Character: " + ch);\
    \}\
\}\
}