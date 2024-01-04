using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args) 
        {
            int[] arr = new int[5];
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                arr[i] = int.Parse(Console.ReadLine());
                sum += arr[i];
            }
            Array.Sort(arr);
            Console.WriteLine(sum / 5);
            Console.WriteLine(arr[2]);
        }
    }
}

