/*
 ============================================================================
 Name        : input2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	double n1, n2, n3;
	setbuf(stdout,NULL);
	    printf("Enter three different numbers: ");
	    scanf("%lf %lf %lf", &n1, &n2, &n3);

	    if (n1 >= n2 && n1 >= n3)
	        printf("%.2f is the largest number.", n1);
	    if (n2 >= n1 && n2 >= n3)
	        printf("%.2f is the largest number.", n2);
	    if (n3 >= n1 && n3 >= n2)
	        printf("%.2f is the largest number.", n3);
	return EXIT_SUCCESS;
}
