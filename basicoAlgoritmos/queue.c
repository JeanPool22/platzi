#include <stdio.h>
#define SIZE 5

int values[SIZE], front = -1, rear = -1;

void enQueue(int value)
{
    if (rear == SIZE - 1)
    {
        printf("Nuestro Queue está lleno \n");
    }
    else
    {
        if (front == -1)
        {
            front = 0;
        }
        rear++;
        values[rear] = value;
        printf("Se inserto el valor %d correctamente \n", value);
    }
}

void deQueue()
{
    if (front == -1)
    {
        printf("Nuestro Queue está vacio \n");
    }
    else
    {
        printf("Se eliminó el valor %d \n", values[front]);
        front++;
        if (front > rear)
        {
            front = rear = -1;
        }
    }
}

int main(int argc, char const *argv[])
{
    enQueue(1);
    enQueue(2);
    enQueue(3);
    enQueue(4);
    enQueue(5);
    deQueue();
    enQueue(10);
    return 0;
}
