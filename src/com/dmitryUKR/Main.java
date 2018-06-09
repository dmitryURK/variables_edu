package com.dmitryUKR;

import java.lang.String;
/*

    одна из первых моих программ изучаю испольщование переменных
    и за одно учусь пользоваться GIT

 */
public class Main {

    public static void main(String[] args) {
        byte bVar = 127;        // -127 до 127
        short sVar = 32767;      // -32768 до 32767
        int iVar = 2147483647;        // -2147483648 до 2147483647
        long lVar = 2000;       // –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        float fVar = 200.10f;   // -3.4*1038 до 3.4*1038
        double dVar = 400.10d;  // ±4.9*10-324 до ±1.8*10308.
        boolean boolVar = true; // true или false
        char cVar  = 'A';       // один символ
        String strVar = "Hello World"; // одно или множество слов

        byte bVarTest;                  // обявление без присвоения значения
        byte bVarTest1,bVarTest2 = 120; // присвоение значения сразу двум переменным одного типа

    }
}
