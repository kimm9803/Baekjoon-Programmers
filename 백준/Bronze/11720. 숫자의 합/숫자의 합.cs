using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int answer = 0;
            string str = Console.ReadLine();
            for (int i = 0; i < n; i++)
            {
                answer += str[i] - '0';
            }
            Console.WriteLine(answer);
        }
    }
}

