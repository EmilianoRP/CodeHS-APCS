{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf820
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class PrintJava extends ConsoleProgram\
\{\
    public void run()\
    \{\
        // You need to write `printJ`\
        printJ();\
        System.out.println();\
        printA();\
        System.out.println();\
        printV();\
        System.out.println();\
        printA();\
    \}\
    \
    private void printJ()\
    \{\
        // Fill this in\
        System.out.println("    *");\
        System.out.println("    *");\
        System.out.println("    *");\
        System.out.println("*   *");\
        System.out.println("*****");\
    \}\
    \
    private void printA()\
    \{\
        System.out.println("*****");\
        System.out.println("*   *");\
        System.out.println("*****");\
        System.out.println("*   *");\
        System.out.println("*   *");\
    \}\
    \
    private void printV()\
    \{\
        System.out.println("*   *");\
        System.out.println("*   *");\
        System.out.println(" * * ");\
        System.out.println("  *  ");\
    \}\
\}\
\
}