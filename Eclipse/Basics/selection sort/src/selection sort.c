/*
 ============================================================================
 Name        : selection.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int limit,i,j,temp,values[20];
	setbuf(stdout,NULL);
	printf("enter no of elements to sort: ");
	scanf("%d",&limit);

	printf("enter the elements:\n ");
	for(i=0;i<limit;i++){
			scanf("%d",&values[i]);
		}
	for(i=0;i<limit-1;i++){
		for(j=i+1;j<limit;j++){
			if(values[i]>values[j]){
			temp=values[i];
			values[i]=values[j];
			values[j]=temp;
			}
		}
	}
	printf("sorted elements: \n");
	for(i=0;i<limit;i++)
		printf("%d ",values[i] );

	return EXIT_SUCCESS;
}
