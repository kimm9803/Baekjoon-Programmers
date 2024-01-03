using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args) 
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = int.Parse(Console.ReadLine());
            }

            Array.Sort(arr);

            for (int i = 0; i < n; i++) {
                Console.WriteLine(arr[i]);
            }
        }
    }
}

