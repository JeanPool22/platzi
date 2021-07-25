#include<stdio.h>

long result;
int n;

long factorial(int n){
    if(n == 0 || n == 1){
        return 1;
    }
    else
    {
        return (n * factorial(n -1));
    }
}

int main(int argc, char const *argv[])
{
    printf("Ingrese el número a calcular \n");
    scanf("%d", &n);
    if(n < 0){
        printf("El número debe ser positivo \n");
    }
    else
    {
        result = factorial(n);
        printf("%d! = %ld \n", n, result);
    }
    
    return 0;
}
