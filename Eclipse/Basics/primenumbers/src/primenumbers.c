/*
 ============================================================================
 Name        : primenumbers.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int n, i, flag = 0;
	setbuf(stdout,NULL);
	    printf("Enter a positive integer: ");
	    scanf("%d", &n);

	    for (i = 2; i <= n / 2; ++i) {

	        // condition for non-prime
	        if (n % i == 0) {
	            flag = 1;
	            break;
	        }
	    }

	    if (n == 1) {
	        printf("1 is neither prime nor composite.");
	    }
	    else {
	        if (flag == 0)
	            printf("%d is a prime number.", n);
	        else
	            printf("%d is not a prime number.", n);
	    }

	return EXIT_SUCCESS;
}
