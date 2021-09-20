package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ShinobiNaruto Naruto = new ShinobiNaruto();
	ShinobiOonoki Oonoki = new ShinobiOonoki();
	ShinobiA A = new ShinobiA();
	ShinobiGaara Gaara = new ShinobiGaara();
	ShinobiMei Mei = new ShinobiMei();

	System.out.println(" About which ninja you want to know? Choose number:\n 1. Naruto\n 2. Gaara\n 3. Oonoki\n 4. A\n 5. Mei");

	Scanner in = new Scanner(System.in);
	int number = in.nextInt();
	if(number == 1 ){
	    Naruto.name();
	    Naruto.country();
	    Naruto.technique();
    }
	else if( number == 2){
	    Gaara.name();
	    Gaara.country();
	    Gaara.technique();
    }
    else if( number == 3){
        Oonoki.name();
        Oonoki.country();
        Oonoki.technique();
    }
    else if( number == 4){
        A.name();
        A.country();
        A.technique();
    }
    else if( number == 5){
        Mei.name();
        Mei.country();
        Mei.technique();
    }
    }
}

