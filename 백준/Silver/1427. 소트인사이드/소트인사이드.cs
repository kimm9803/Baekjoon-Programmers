using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args) 
        {
            string num = Console.ReadLine();
            int[] arr = new int[num.Length];

            for (int i = 0; i < num.Length; i++) {
                arr[i] = int.Parse(num.Substring(i, 1));
            }

            Array.Sort(arr);
            Array.Reverse(arr);

            string answer = "";
            for (int i = 0; i < arr.Length; i++) {
                answer += arr[i].ToString();
            }

            Console.WriteLine(answer);
        }
    }
}

