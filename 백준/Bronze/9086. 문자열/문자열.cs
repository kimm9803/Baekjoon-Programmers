using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            for (int i = 0; i < T; i++)
            {
                string str = Console.ReadLine();
                string answer = str[0].ToString() + str[str.Length - 1].ToString();
                Console.WriteLine(answer);
            }
        }
    }
}

